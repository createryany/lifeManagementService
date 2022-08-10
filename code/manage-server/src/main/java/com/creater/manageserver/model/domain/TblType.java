package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 类型库
 * @TableName tbl_type
 */
@TableName(value ="tbl_type")
@Data
public class TblType implements Serializable {
    /**
     * 类型编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 状态
     */
    private String typeStatus;

    /**
     * 所属产品
     */
    private String belongProduct;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}