package com.creater.manageserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblLoginLog;
import com.creater.manageserver.service.TblLoginLogService;
import com.creater.manageserver.mapper.TblLoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_login_log(登录日志)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:39
*/
@Service
public class TblLoginLogServiceImpl extends ServiceImpl<TblLoginLogMapper, TblLoginLog>
    implements TblLoginLogService {

}




