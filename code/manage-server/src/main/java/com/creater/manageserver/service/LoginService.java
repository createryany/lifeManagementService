package com.creater.manageserver.service;

import com.creater.manageserver.common.Result;
import com.creater.manageserver.model.domain.TblUserRecord;
import com.github.yulichang.base.MPJBaseService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: createryan
 * @date 2022/8/11 5:04
 */

public interface LoginService extends MPJBaseService<TblUserRecord> {

    Result login(HttpServletRequest request, String username, String password);
}
