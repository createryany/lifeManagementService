package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 参数档案
 * @TableName tbl_arg_record
 */
@TableName(value ="tbl_arg_record")
@Data
public class TblArgRecord implements Serializable {
    /**
     * 参数编码
     */
    @TableId
    private String argCode;

    /**
     * 参数名称
     */
    private String argName;

    /**
     * 参数值
     */
    private String argValue;

    /**
     * 说明
     */
    private String argDesc;

    /**
     * 排序号
     */
    private Integer argOrder;

    /**
     * 所属产品
     */
    private String belongProduct;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}