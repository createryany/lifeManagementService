package com.creater.manageserver.controller;

import com.creater.manageserver.common.PermissionManagement.Permission;
import com.creater.manageserver.common.PermissionManagement.Permissions;
import com.creater.manageserver.common.PermissionManagement.UserInfo;
import com.creater.manageserver.common.Result;
import com.creater.manageserver.model.dto.TblUserRecordDTO;
import com.creater.manageserver.service.LoginService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * @author: createryan
 * @date 2022/8/11 4:43
 */
@RestController
@Log4j
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping("/auth/2step-code")
    public Boolean twoStepCode() {
        return true;
    }

    @PostMapping("/auth/login")
    public Result login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpServletRequest request) {
        log.info("===调用了login()方法\n");
        return loginService.login(request, username, password);
    }

    @GetMapping("/user/info")
    public Result getUserInfo(HttpServletRequest request) {
        log.info("===调用了getUserInfo()方法\n");
        TblUserRecordDTO tblUserRecordDTO = (TblUserRecordDTO) request.getSession().getAttribute("userInfo");
        // 获取权限模块
        String[] permissionArray = tblUserRecordDTO.getRolePrivileges().split("-");
        // 创建权限集合对象
        Permissions permissions = new Permissions();
        ArrayList<Permission> permissionList = new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        // 向权限集合中添加具体的权限
        for (String permissionId : permissionArray) {
            permissionList.add(new Permission(permissionId));
        }
        permissions.setPermissions(permissionList);
        // 设置返回处理的带有用户权限的用户信息
        userInfo.setName(tblUserRecordDTO.getUserName());
        userInfo.setRole(permissions);
        return Result.ok("ok", userInfo);
    }

    @RequestMapping("/auth/logout")
    public Result logout(HttpSession session) {
        log.info("===调用了logout()方法\n");
        TblUserRecordDTO tblUserRecordDTO = (TblUserRecordDTO) session.getAttribute("userInfo");
        log.info(tblUserRecordDTO.getUserName() + "--退出登录");
        session.invalidate();
        return Result.ok();
    }
}
