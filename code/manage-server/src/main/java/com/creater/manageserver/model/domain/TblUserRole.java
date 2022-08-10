package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户角色表
 * @TableName tbl_user_role
 */
@TableName(value ="tbl_user_role")
@Data
public class TblUserRole implements Serializable {
    /**
     * 用户编号
     */
    private String userId;

    /**
     * 角色编号
     */
    private Integer roleId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}