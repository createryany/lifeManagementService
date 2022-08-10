package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物业接管概要
 * @TableName wy_property_takeover_schema
 */
@TableName(value ="wy_property_takeover_schema")
@Data
public class WyPropertyTakeoverSchema implements Serializable {
    /**
     * 接管单号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 接管标题
     */
    private String takeoverTitle;

    /**
     * 所属楼盘
     */
    private Integer estateId;

    /**
     * 接管备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建日期
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}