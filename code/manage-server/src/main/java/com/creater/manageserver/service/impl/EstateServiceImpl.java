package com.creater.manageserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.creater.manageserver.common.Result;
import com.creater.manageserver.mapper.FcBuildingMapper;
import com.creater.manageserver.mapper.FcEstateMapper;
import com.creater.manageserver.mapper.TblCompanyMapper;
import com.creater.manageserver.model.domain.FcBuilding;
import com.creater.manageserver.model.domain.FcEstate;
import com.creater.manageserver.model.domain.TblCompany;
import com.creater.manageserver.service.EstateService;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: createryan
 * @date 2022/8/12 20:15
 */
@Service
@Log4j
public class EstateServiceImpl extends MPJBaseServiceImpl<TblCompanyMapper, TblCompany> implements EstateService {

    @Resource
    private TblCompanyMapper tblCompanyMapper;

    @Resource
    private FcEstateMapper fcEstateMapper;

    @Resource
    private FcBuildingMapper fcBuildingMapper;

    @Override
    public Result selectCompanys() {
        List<String> tblCompanyNamesList = new ArrayList<>();
        List<TblCompany> tblCompanyNames = tblCompanyMapper.selectList(new MPJLambdaWrapper<TblCompany>()
                .select(TblCompany::getCompanyFullName));
        for (TblCompany tblCompanyName : tblCompanyNames) {
            tblCompanyNamesList.add(String.valueOf(tblCompanyName.getCompanyFullName()));
        }
        return Result.ok(tblCompanyNamesList);
    }

    @Override
    public Result addEstate(FcEstate fcEstate) {
        // 判断该住宅是否已经添加过
        String estateCode = fcEstate.getEstateCode();
        FcEstate code = fcEstateMapper.selectOne(new QueryWrapper<FcEstate>()
                .eq("estate_code", estateCode));
        if (code != null) {
            return Result.fail("该住宅已添加，请忽重复添加！");
        }
        // 未添加过，直接添加
        int resultCount = fcEstateMapper.insert(fcEstate);
        if (resultCount > 0) {
            return Result.ok("添加成功", resultCount);
        }
        return Result.fail("添加失败，请稍后重试！");
    }

    @Override
    @Transactional
    public Result searchBuild(String estateCode, Integer buildingNumber) {
        if (estateCode == null || buildingNumber == null) {
            return Result.fail("请求错误，请刷新后重试！");
        }
        List<FcBuilding> fcBuildings = new ArrayList<>();
        String message = "";
        for (int i = 1; i <= buildingNumber; i++) {
            FcBuilding fcBuilding = new FcBuilding();
            fcBuilding.setBuildingCode("B" + i);
            fcBuilding.setBuildingName("第" + i + "号楼");
            fcBuilding.setEstateCode(estateCode);
            int count = fcBuildingMapper.insert(fcBuilding);
            if (count > 0) {
                fcBuildings.add(fcBuilding);
            } else {
                message = "系统异常，请稍后重试！";
            }
        }
        return Result.ok(message, fcBuildings);
    }

    @Override
    public Result updateBuildingMsg(FcBuilding fcBuilding) {
        String remark = fcBuilding.getRemark();
        if (fcBuilding.getId() == null) {
            return Result.fail("请求错误，请刷新后重试！");
        }
        if (remark == null || "".equals(remark)) {
            fcBuilding.setRemark("无");
        }
        int count = fcBuildingMapper.updateById(fcBuilding);
        if (count > 0) {
            return Result.ok("保存成功", count);
        }
        return Result.fail("系统异常，请稍后重试！");
    }
}
