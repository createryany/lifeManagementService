package com.creater.manageserver.common.PermissionManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: createryan
 * @date 2022/8/11 23:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission implements Serializable {

    private static final long serialVersionUID = 2766957902890013077L;
    private String permissionId;
}
