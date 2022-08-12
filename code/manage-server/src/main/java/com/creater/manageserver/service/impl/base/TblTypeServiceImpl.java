package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblType;
import com.creater.manageserver.service.base.TblTypeService;
import com.creater.manageserver.mapper.TblTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_type(类型库)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:40
*/
@Service
public class TblTypeServiceImpl extends ServiceImpl<TblTypeMapper, TblType>
    implements TblTypeService {

}




