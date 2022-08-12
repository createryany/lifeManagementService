package com.creater.manageserver.service;

import com.creater.manageserver.common.Result;
import com.creater.manageserver.model.domain.FcBuilding;
import com.creater.manageserver.model.domain.FcEstate;
import com.creater.manageserver.model.domain.TblCompany;
import com.github.yulichang.base.MPJBaseService;

/**
 * @author: createryan
 * @date 2022/8/12 20:14
 */

public interface EstateService extends MPJBaseService<TblCompany> {

    Result selectCompanys();

    Result addEstate(FcEstate fcEstate);

    Result searchBuild(String estateCode, Integer buildingNumber);

    Result updateBuildingMsg(FcBuilding fcBuilding);
}
