package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户部门表
 * @TableName tbl_user_dept
 */
@TableName(value ="tbl_user_dept")
@Data
public class TblUserDept implements Serializable {
    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 部门编号
     */
    private Integer deptId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}