package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据库
 * @TableName tbl_dbsource
 */
@TableName(value ="tbl_dbsource")
@Data
public class TblDbsource implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String sourceName;

    /**
     * 中文解释
     */
    private String sourceDesc;

    /**
     * 类型
     */
    private String sourceType;

    /**
     * 分类
     */
    private String sourceClass;

    /**
     * 是否可以清空
     */
    private String idClear;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 所属产品
     */
    private String belongProduct;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}