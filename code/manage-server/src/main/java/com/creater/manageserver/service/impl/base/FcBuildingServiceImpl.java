package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.FcBuilding;
import com.creater.manageserver.service.base.FcBuildingService;
import com.creater.manageserver.mapper.FcBuildingMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【fc_building(楼宇信息表)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:37
*/
@Service
public class FcBuildingServiceImpl extends ServiceImpl<FcBuildingMapper, FcBuilding>
    implements FcBuildingService{

}




