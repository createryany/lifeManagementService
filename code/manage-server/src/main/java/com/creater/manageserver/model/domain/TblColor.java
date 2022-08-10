package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 颜色管理
 * @TableName tbl_color
 */
@TableName(value ="tbl_color")
@Data
public class TblColor implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 颜色
     */
    private String color;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}