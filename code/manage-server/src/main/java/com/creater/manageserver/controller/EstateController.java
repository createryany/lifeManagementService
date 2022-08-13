package com.creater.manageserver.controller;

import com.creater.manageserver.common.Result;
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

    @GetMapping("/selectCompanys")
    public Result selectCompanys() {
        log.info("===调用了selectCompanys()方法");
        return estateService.selectCompanys();
    }

    @PostMapping("/addEstate")
    public Result addEstate(FcEstate fcEstate) {
        log.info("===调用了addEstate()方法");
        return estateService.addEstate(fcEstate);
    }

    @PostMapping("/searchBuild")
    public Result searchBuild(String estateCode, Integer buildingNumber) {
        log.info("===调用了searchBuild()方法");
        return estateService.searchBuild(estateCode, buildingNumber);
    }

    @PostMapping("/updateBuildingMsg")
    public Result updateBuildingMsg(FcBuilding fcBuilding) {
        log.info("===调用了updateBuildingMsg()方法");
        return estateService.updateBuildingMsg(fcBuilding);
    }

    @PostMapping("/searchUnitMsg")
    public Result searchUnitMsg(@RequestBody UnitMessageVO[] unitMessageVOS) {
        log.info("===调用了searchUnitMsg()方法");
        List<FcUnit> fcUnits = new ArrayList<>();
        for (UnitMessageVO unitMessage : unitMessageVOS) {
            fcUnits.addAll(estateService.searchUnitMsg(unitMessage));
        }
        return Result.ok(fcUnits);
    }

    @PostMapping("/updateUnitMsg")
    public Result updateUnitMsg(FcUnit fcUnit) {
        log.info("===调用了updateUnitMsg()方法");
        return estateService.updateUnitMsg(fcUnit);
    }

    @PostMapping("/addCell")
    public Result addCell(@RequestBody CellMessageVO[] cellMessageVOS) {
        log.info("===调用了addCell()方法");
        ArrayList<FcCell> fcCells = new ArrayList<>();
        for (CellMessageVO cellMessage : cellMessageVOS) {
            fcCells.addAll(estateService.addCell(cellMessage));
        }
        return Result.ok(fcCells);
    }

    @PostMapping("/searchBaseBuildMsg")
    public Result searchBaseBuildMsg(String estateCode) {
        log.info("===调用了searchBaseBuildMsg()方法");
        return estateService.searchBaseBuildMsg(estateCode);
    }

    @PostMapping("/searchBaseUnitMsg")
    public Result searchBaseUnitMsg(String buildingCode) {
        log.info("===调用了searchBaseUnitMsg()方法");
        return estateService.searchBaseUnitMsg(buildingCode);
    }

    @PostMapping("/searchCellMsg")
    public Result searchCellMsg(String unitCode) {
        log.info("===调用了searchCellMsg()方法");
        return estateService.searchCellMsg(unitCode);
    }

    @PostMapping("/updateCellMsg")
    public Result updateCellMsg(FcCell fcCell) {
        log.info("===调用了updateCellMsg()方法");
        return estateService.updateCellMsg(fcCell);
    }
}
