package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 部门key
 * @TableName tbl_deptkey
 */
@TableName(value ="tbl_deptkey")
@Data
public class TblDeptkey implements Serializable {
    /**
     * Key编码
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * key名称
     */
    private String deptName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}