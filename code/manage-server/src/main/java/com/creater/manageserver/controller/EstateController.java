package com.creater.manageserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.creater.manageserver.common.Result;
import com.creater.manageserver.mapper.FcCellMapper;
import com.creater.manageserver.mapper.FcUnitMapper;
import com.creater.manageserver.model.domain.FcBuilding;
import com.creater.manageserver.model.domain.FcCell;
import com.creater.manageserver.model.domain.FcEstate;
import com.creater.manageserver.model.domain.FcUnit;
import com.creater.manageserver.model.vo.CellMessageVO;
import com.creater.manageserver.model.vo.UnitMessageVO;
import com.creater.manageserver.service.EstateService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: createryan
 * @date 2022/8/12 20:06
 */
@RestController
@Log4j
@RequestMapping("/estate")
public class EstateController {

    @Resource
    private EstateService estateService;

    @Resource
    private FcUnitMapper fcUnitMapper;

    @Resource
    private FcCellMapper fcCellMapper;

    String messageError = "请求错误，请刷新后重试！";
    String systemError = "系统异常，请稍后重试！";

    @GetMapping("/selectCompanys")
    public Result selectCompanys() {
        log.info("===调用了selectCompanys()方法\n");
        return estateService.selectCompanys();
    }

    @PostMapping("/addEstate")
    public Result addEstate(FcEstate fcEstate) {
        log.info("===调用了addEstate()方法\n");
        return estateService.addEstate(fcEstate);
    }

    @PostMapping("/searchBuild")
    public Result searchBuild(String estateCode, Integer buildingNumber) {
        log.info("===调用了searchBuild()方法\n");
        return estateService.searchBuild(estateCode, buildingNumber);
    }

    @PostMapping("/updateBuildingMsg")
    public Result updateBuildingMsg(FcBuilding fcBuilding) {
        log.info("===调用了updateBuildingMsg()方法\n");
        return estateService.updateBuildingMsg(fcBuilding);
    }

    @PostMapping("/searchUnitMsg")
    public Result searchUnitMsg(@RequestBody UnitMessageVO[] unitMessageVOS) {
        log.info("===调用了searchUnitMsg()方法\n");
        // 查询是否已存在记录，存在则删除
        String estateCode = unitMessageVOS[0].getEstateCode();
        QueryWrapper<FcUnit> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("estate_code", estateCode);
        List<FcUnit> fcUnitList = fcUnitMapper.selectList(queryWrapper);
        if (!fcUnitList.isEmpty()) fcUnitMapper.delete(queryWrapper);
        List<FcUnit> fcUnits = new ArrayList<>();
        for (UnitMessageVO unitMessage : unitMessageVOS) {
            fcUnits.addAll(estateService.searchUnitMsg(unitMessage));
        }
        return Result.ok(fcUnits);
    }

    @PostMapping("/updateUnitMsg")
    public Result updateUnitMsg(FcUnit fcUnit) {
        log.info("===调用了updateUnitMsg()方法\n");
        return estateService.updateUnitMsg(fcUnit);
    }

    @PostMapping("/addCell")
    public Result addCell(@RequestBody CellMessageVO[] cellMessageVOS) {
        log.info("===调用了addCell()方法\n");
        String estateCode = cellMessageVOS[0].getEstateCode();
        QueryWrapper<FcCell> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("estate_code", estateCode);
        List<FcCell> fcCellList = fcCellMapper.selectList(queryWrapper);
        if (!fcCellList.isEmpty()) fcCellMapper.delete(queryWrapper);
        ArrayList<FcCell> fcCells = new ArrayList<>();
        for (CellMessageVO cellMessage : cellMessageVOS) {
            fcCells.addAll(estateService.addCell(cellMessage));
        }
        return Result.ok(fcCells);
    }

    @PostMapping("/searchBaseBuildMsg")
    public Result searchBaseBuildMsg(String estateCode) {
        log.info("===调用了searchBaseBuildMsg()方法\n");
        return estateService.searchBaseBuildMsg(estateCode);
    }

    @PostMapping("/searchBaseUnitMsg")
    public Result searchBaseUnitMsg(String buildingCode) {
        log.info("===调用了searchBaseUnitMsg()方法\n");
        return estateService.searchBaseUnitMsg(buildingCode);
    }

    @PostMapping("/searchCellMsg")
    public Result searchCellMsg(String unitCode) {
        log.info("===调用了searchCellMsg()方法\n");
        return estateService.searchCellMsg(unitCode);
    }

    @PostMapping("/updateCellMsg")
    public Result updateCellMsg(FcCell fcCell) {
        log.info("===调用了updateCellMsg()方法\n");
        return estateService.updateCellMsg(fcCell);
    }

    /**
     * 添加住宅的第三步返回上一步后，获得第二步的页面信息
     * @return
     */
    @PostMapping("/getBuildMsg")
    public Result searchBuildMsg() {
        log.info("===调用了getBuildMsg()方法\n");
        return estateService.getBuildMsg();
    }

    /**
     * 添加住宅的第四步返回上一步后，获得第三步的页面信息
     * @return
     */
    @PostMapping("/getUnitMsg")
    public Result getUnitMsg() {
        log.info("===调用了getUnitMsg()方法\n");
        return estateService.getUnitMsg();
    }

    /**
     * 更新楼宇缓存数据
     */
    @PostMapping("/updateCacheBuildingMsg")
    public Result updateCacheBuildingMsg(@RequestBody FcBuilding[] fcBuildings) {
        log.info("===调用了updateCacheBuildingMsg()方法\n");
        Integer id = fcBuildings[0].getId();
        if (id == null) {
            return Result.fail(messageError);
        }
        int result = 0;
        for (FcBuilding fcBuilding : fcBuildings) {
            result += estateService.updateCacheBuildingMsg(fcBuilding);
        }
        if (result == 0) {
            return Result.fail(systemError);
        }
        return Result.ok();
    }

    /**
     * 更新楼宇缓存数据
     */
    @PostMapping("/updateCacheUnitMsg")
    public Result updateCacheUnitMsg(@RequestBody FcUnit[] fcUnits) {
        log.info("===调用了updateCacheUnitMsg()方法\n");
        Integer id = fcUnits[0].getId();
        if (id == null) {
            return Result.fail(messageError);
        }
        int result = 0;
        for (FcUnit fcUnit : fcUnits) {
            result += estateService.updateCacheUnitMsg(fcUnit);
        }
        if (result == 0) {
            return Result.fail(systemError);
        }
        return Result.ok();
    }

    /**
     * 更新楼宇缓存数据
     */
    @PostMapping("/updateCacheCellMsg")
    public Result updateCacheCellMsg(@RequestBody FcCell[] fcCells) {
        log.info("===调用了updateCacheCellMsg()方法\n");
        Integer id = fcCells[0].getId();
        if (id == null) {
            return Result.fail(messageError);
        }
        int result = 0;
        for (FcCell fcCell : fcCells) {
            result += estateService.updateCacheCellMsg(fcCell);
        }
        if (result == 0) {
            return Result.fail(systemError);
        }
        return Result.ok();
    }

    @PostMapping("/searchEstate")
    public Result searchEstate(String company) {
        return estateService.searchEstate(company);
    }
}
