package com.creater.manageserver.service;

import com.creater.manageserver.common.Result;
import com.creater.manageserver.model.domain.*;
import com.creater.manageserver.model.vo.CellMessageVO;
import com.creater.manageserver.model.vo.UnitMessageVO;
import com.github.yulichang.base.MPJBaseService;

import java.util.List;

/**
 * @author: createryan
 * @date 2022/8/12 20:14
 */

public interface EstateService extends MPJBaseService<TblCompany> {

    Result selectCompanys();

    Result addEstate(FcEstate fcEstate);

    Result searchBuild(String estateCode, Integer buildingNumber);

    Result updateBuildingMsg(FcBuilding fcBuilding);

    List<FcUnit> searchUnitMsg(UnitMessageVO unitMessage);

    Result updateUnitMsg(FcUnit fcUnit);

    List<FcCell> addCell(CellMessageVO cellMessageVO);

    Result searchBaseBuildMsg(String estateCode);

    Result searchBaseUnitMsg(String buildingCode);

    Result searchCellMsg(String unitCode);

    Result updateCellMsg(FcCell fcCell);

    Result getBuildMsg();

    Result getUnitMsg();

    int updateCacheBuildingMsg(FcBuilding fcBuilding);

    int updateCacheUnitMsg(FcUnit fcUnit);

    int updateCacheCellMsg(FcCell fcCell);
}
