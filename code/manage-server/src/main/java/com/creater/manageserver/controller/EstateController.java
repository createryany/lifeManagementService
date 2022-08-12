package com.creater.manageserver.controller;

import com.creater.manageserver.common.Result;
import com.creater.manageserver.model.domain.FcBuilding;
import com.creater.manageserver.model.domain.FcEstate;
import com.creater.manageserver.service.EstateService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
        return estateService.updateBuildingMsg(fcBuilding);
    }
}
