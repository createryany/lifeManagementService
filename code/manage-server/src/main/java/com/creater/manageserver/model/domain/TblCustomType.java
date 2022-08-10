package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 自定义类型
 * @TableName tbl_custom_type
 */
@TableName(value ="tbl_custom_type")
@Data
public class TblCustomType implements Serializable {
    /**
     * 类型编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 类型状态
     */
    private String status;

    /**
     * 类型分类
     */
    private String category;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}