package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色菜单权限
 * @TableName tbl_role_menu_privi
 */
@TableName(value ="tbl_role_menu_privi")
@Data
public class TblRoleMenuPrivi implements Serializable {
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 模块id
     */
    private Integer modelId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}