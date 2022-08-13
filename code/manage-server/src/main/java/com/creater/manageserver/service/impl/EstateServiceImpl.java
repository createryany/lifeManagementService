package com.creater.manageserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.creater.manageserver.common.Result;
import com.creater.manageserver.mapper.*;
import com.creater.manageserver.model.domain.*;
import com.creater.manageserver.model.vo.CellMessageVO;
import com.creater.manageserver.model.vo.UnitMessageVO;
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

    @Resource
    private FcUnitMapper fcUnitMapper;

    @Resource
    private FcCellMapper fcCellMapper;

    String messageError = "请求错误，请刷新后重试！";
    String systemError = "系统异常，请稍后重试！";

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
    @Transactional
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
        return Result.fail(systemError);
    }

    @Override
    @Transactional
    public Result searchBuild(String estateCode, Integer buildingNumber) {
        if (estateCode == null || buildingNumber == null) {
            return Result.fail(messageError);
        }
        List<FcBuilding> fcBuildings = new ArrayList<>();
        String message = "";
        for (int i = 1; i <= buildingNumber; i++) {
            FcBuilding fcBuilding = new FcBuilding();
            fcBuilding.setBuildingCode("B-" + estateCode + "-" + i);
            fcBuilding.setBuildingName(i + "号楼");
            fcBuilding.setEstateCode(estateCode);
            int count = fcBuildingMapper.insert(fcBuilding);
            if (count > 0) {
                fcBuildings.add(fcBuilding);
            } else {
                message = systemError;
            }
        }
        return Result.ok(message, fcBuildings);
    }

    @Override
    @Transactional
    public Result updateBuildingMsg(FcBuilding fcBuilding) {
        String remark = fcBuilding.getRemark();
        if (fcBuilding.getId() == null) {
            return Result.fail(messageError);
        }
        if (remark == null || "".equals(remark)) {
            fcBuilding.setRemark("无");
        }
        int count = fcBuildingMapper.updateById(fcBuilding);
        if (count > 0) {
            return Result.ok("保存成功", count);
        }
        return Result.fail(systemError);
    }

    @Override
    @Transactional
    public List<FcUnit> searchUnitMsg(UnitMessageVO unitMessage) {
        List<FcUnit> fcUnits = new ArrayList<>();
        for (int i = 1; i <= unitMessage.getUnitCount(); i++) {
            FcUnit fcUnit = new FcUnit();
            String buildingCode = unitMessage.getBuildingCode();
            fcUnit.setBuildingCode(buildingCode);
            fcUnit.setUnitCode(buildingCode + "-U" + i);
            fcUnit.setUnitName("第" + i + "单元");
            int result = fcUnitMapper.insert(fcUnit);
            if (result > 0) {
                fcUnits.add(fcUnit);
            }
        }
        return fcUnits;
    }

    @Override
    @Transactional
    public Result updateUnitMsg(FcUnit fcUnit) {
        String remark = fcUnit.getRemark();
        if (fcUnit.getId() == null) {
            return Result.fail(messageError);
        }
        if (remark == null || "".equals(remark)) {
            fcUnit.setRemark("无");
        }
        int count = fcUnitMapper.updateById(fcUnit);
        if (count > 0) {
            return Result.ok("保存成功", count);
        }
        return Result.fail(systemError);
    }

    @Override
    @Transactional
    public List<FcCell> addCell(CellMessageVO cellMessageVO) {
        List<FcCell> fcCells = new ArrayList<>();
        // 楼层
        for (int i = 1; i <= cellMessageVO.getStopFloor(); i++) {
            // 房间号
            for (int j = 0; j < cellMessageVO.getStopCellId(); j++) {
                String cellName = "";
                if (j < 10 ) {
                    cellName = i + "0" + j;
                } else {
                    cellName = String.valueOf(i) + j;
                }
                FcCell fcCell = new FcCell();
                String unitCode = cellMessageVO.getUnitCode();
                fcCell.setUnitCode(unitCode);
                fcCell.setCellName(cellName);
                fcCell.setCellCode(unitCode + "-C" + cellName);
                fcCell.setFloorNumber(i);
                int result = fcCellMapper.insert(fcCell);
                if (result > 0) {
                    fcCells.add(fcCell);
                }
            }
        }
        return fcCells;
    }

    @Override
    public Result searchBaseBuildMsg(String estateCode) {
        if (estateCode == null) {
            return Result.fail(messageError);
        }
        QueryWrapper<FcBuilding> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("estate_code", estateCode);
        queryWrapper.select("building_name", "building_code");
        List<FcBuilding> fcBuildings = fcBuildingMapper.selectList(queryWrapper);
        return Result.ok(fcBuildings);
    }

    @Override
    public Result searchBaseUnitMsg(String buildingCode) {
        if (buildingCode == null) {
            return Result.fail(messageError);
        }
        QueryWrapper<FcUnit> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("building_code", buildingCode);
        queryWrapper.select("unit_code", "unit_name");
        List<FcUnit> fcUnits = fcUnitMapper.selectList(queryWrapper);
        return Result.ok(fcUnits);
    }

    @Override
    public Result searchCellMsg(String unitCode) {
        if (unitCode == null) {
            return Result.fail(messageError);
        }
        QueryWrapper<FcCell> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("unit_code", unitCode);
        List<FcCell> fcCells = fcCellMapper.selectList(queryWrapper);
        return Result.ok(fcCells);
    }

    @Override
    @Transactional
    public Result updateCellMsg(FcCell fcCell) {
        String remark = fcCell.getRemark();
        if (fcCell.getId() == null) {
            return Result.fail(messageError);
        }
        if (remark == null || "".equals(remark)) {
            fcCell.setRemark("无");
        }
        int count = fcCellMapper.updateById(fcCell);
        if (count > 0) {
            return Result.ok("保存成功", count);
        }
        return Result.fail(systemError);
    }
}
