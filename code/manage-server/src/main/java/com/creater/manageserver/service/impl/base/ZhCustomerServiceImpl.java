package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.ZhCustomer;
import com.creater.manageserver.service.base.ZhCustomerService;
import com.creater.manageserver.mapper.ZhCustomerMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【zh_customer(业主信息表)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:42
*/
@Service
public class ZhCustomerServiceImpl extends ServiceImpl<ZhCustomerMapper, ZhCustomer>
    implements ZhCustomerService {

}




