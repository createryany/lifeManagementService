package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblMessageReceive;
import com.creater.manageserver.service.base.TblMessageReceiveService;
import com.creater.manageserver.mapper.TblMessageReceiveMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_message_receive(短信接受表)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:39
*/
@Service
public class TblMessageReceiveServiceImpl extends ServiceImpl<TblMessageReceiveMapper, TblMessageReceive>
    implements TblMessageReceiveService {

}




