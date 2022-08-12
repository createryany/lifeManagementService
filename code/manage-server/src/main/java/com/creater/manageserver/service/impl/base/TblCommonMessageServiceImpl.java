package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblCommonMessage;
import com.creater.manageserver.service.base.TblCommonMessageService;
import com.creater.manageserver.mapper.TblCommonMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_common_message(常用短信)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:39
*/
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage>
    implements TblCommonMessageService{

}




