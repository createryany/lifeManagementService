package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblSystemLog;
import com.creater.manageserver.service.base.TblSystemLogService;
import com.creater.manageserver.mapper.TblSystemLogMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_system_log(系统日志)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:40
*/
@Service
public class TblSystemLogServiceImpl extends ServiceImpl<TblSystemLogMapper, TblSystemLog>
    implements TblSystemLogService {

}




