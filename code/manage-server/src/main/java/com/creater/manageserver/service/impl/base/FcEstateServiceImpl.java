package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.FcEstate;
import com.creater.manageserver.service.base.FcEstateService;
import com.creater.manageserver.mapper.FcEstateMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【fc_estate(楼盘信息)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:38
*/
@Service
public class FcEstateServiceImpl extends ServiceImpl<FcEstateMapper, FcEstate>
    implements FcEstateService{

}




