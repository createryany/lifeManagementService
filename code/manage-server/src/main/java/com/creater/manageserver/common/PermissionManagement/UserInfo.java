package com.creater.manageserver.common.PermissionManagement;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: createryan
 * @date 2022/8/11 23:10
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 8175018695599027847L;
    private String name;
    private String avatar = "/avatar2.jpg";
    private Permissions role;
}
