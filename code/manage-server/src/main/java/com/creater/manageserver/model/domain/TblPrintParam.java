package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 打印参数
 * @TableName tbl_print_param
 */
@TableName(value ="tbl_print_param")
@Data
public class TblPrintParam implements Serializable {
    /**
     * 打印参数编号
     */
    @TableId
    private String printId;

    /**
     * 打印参数名称
     */
    private String printName;

    /**
     * 打印参数值
     */
    private String printValue;

    /**
     * 打印参数描述
     */
    private String printDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}