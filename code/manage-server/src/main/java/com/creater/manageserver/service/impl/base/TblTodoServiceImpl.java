package com.creater.manageserver.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creater.manageserver.model.domain.TblTodo;
import com.creater.manageserver.service.base.TblTodoService;
import com.creater.manageserver.mapper.TblTodoMapper;
import org.springframework.stereotype.Service;

/**
* @author creater
* @description 针对表【tbl_todo(待办事项)】的数据库操作Service实现
* @createDate 2022-08-11 01:58:40
*/
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo>
    implements TblTodoService {

}




