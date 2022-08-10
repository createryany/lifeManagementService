package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 分组用户
 * @TableName tbl_groups_user
 */
@TableName(value ="tbl_groups_user")
@Data
public class TblGroupsUser implements Serializable {
    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 对象id
     */
    private String objId;

    /**
     * 绑定类型
     */
    private Integer objType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}