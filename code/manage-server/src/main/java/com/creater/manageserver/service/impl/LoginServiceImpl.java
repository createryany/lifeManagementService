package com.creater.manageserver.service.impl;

import com.creater.manageserver.common.Result;
import com.creater.manageserver.mapper.TblUserRecordMapper;
import com.creater.manageserver.model.domain.TblCompany;
import com.creater.manageserver.model.domain.TblDept;
import com.creater.manageserver.model.domain.TblRole;
import com.creater.manageserver.model.domain.TblUserRecord;
import com.creater.manageserver.model.dto.TblUserRecordDTO;
import com.creater.manageserver.service.LoginService;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: createryan
 * @date 2022/8/11 5:09
 */
@Service
@Log4j
public class LoginServiceImpl extends MPJBaseServiceImpl<TblUserRecordMapper, TblUserRecord> implements LoginService {

    @Resource
    private TblUserRecordMapper tblUserRecordMapper;

    @Override
    public Result login(HttpServletRequest request, String username, String password) {
        TblUserRecordDTO tblUserRecordDTO = tblUserRecordMapper.selectJoinOne(TblUserRecordDTO.class,
                new MPJLambdaWrapper<TblUserRecord>()
                        .selectAll(TblUserRecord.class)
                        .selectAs(TblDept::getDeptPrivileges, TblUserRecordDTO::getDeptPrivileges)
                        .selectAs(TblRole::getRolePrivileges, TblUserRecordDTO::getRolePrivileges)
                        .selectAs(TblCompany::getCompanySimpleName, TblUserRecordDTO::getCompanySimpleName)
                        .leftJoin(TblDept.class, TblDept::getId, TblUserRecord::getUserDept)
                        .leftJoin(TblRole.class, TblRole::getId, TblUserRecord::getUserRole)
                        .leftJoin(TblCompany.class, TblCompany::getId, TblUserRecord::getCompany)
                        .eq(TblUserRecord::getUserName, username)
                        .eq(TblUserRecord::getUserPassword, password));
        tblUserRecordDTO.setToken(tblUserRecordDTO.getUserName());
        request.getSession().setAttribute("userInfo", tblUserRecordDTO);
        log.info(tblUserRecordDTO.getUserName() + "登录了系统");
        return Result.ok(tblUserRecordDTO);
    }
}
