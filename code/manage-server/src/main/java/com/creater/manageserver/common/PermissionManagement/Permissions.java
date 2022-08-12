package com.creater.manageserver.common.PermissionManagement;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: createryan
 * @date 2022/8/11 23:03
 */
@Data
public class Permissions implements Serializable {

    private static final long serialVersionUID = -2712665865314666440L;
    private List<Permission> permissions;

}
