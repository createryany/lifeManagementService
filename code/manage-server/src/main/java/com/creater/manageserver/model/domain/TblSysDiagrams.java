package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 系统图标
 * @TableName tbl_sys_diagrams
 */
@TableName(value ="tbl_sys_diagrams")
@Data
public class TblSysDiagrams implements Serializable {
    /**
     * 图标名称
     */
    private String diagramName;

    /**
     * 归属人
     */
    private Integer belongPerson;

    /**
     * 图标编号
     */
    private Integer diagramId;

    /**
     * 图标版本
     */
    private Integer diagramVersion;

    /**
     * 图标定义
     */
    private String diagramDefinition;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}