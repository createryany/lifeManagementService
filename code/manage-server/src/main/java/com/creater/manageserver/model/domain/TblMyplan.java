package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 我的日程
 * @TableName tbl_myplan
 */
@TableName(value ="tbl_myplan")
@Data
public class TblMyplan implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 主题
     */
    private String planTheme;

    /**
     * 地点
     */
    private String planAddr;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date stopDate;

    /**
     * 分类
     */
    private String planType;

    /**
     * 状态
     */
    private String planStatus;

    /**
     * 优先级
     */
    private String planPrior;

    /**
     * 备用字段
     */
    private String fieldBak;

    /**
     * 日程描述
     */
    private String planDesc;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件路径
     */
    private String attachUrl;

    /**
     * 所有者
     */
    private String owner;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 日程附件
     */
    private String planAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}