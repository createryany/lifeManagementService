package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 来访管理
 * @TableName wy_visit_manage
 */
@TableName(value ="wy_visit_manage")
@Data
public class WyVisitManage implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 来访时间
     */
    private Date visitDate;

    /**
     * 离开时间
     */
    private Date leaveDate;

    /**
     * 来访人
     */
    private String visitPerson;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 来访人住址
     */
    private String visitAddr;

    /**
     * 来访事由
     */
    private String visitReason;

    /**
     * 被访人
     */
    private String visitedPerson;

    /**
     * 所住地址
     */
    private String visitedReason;

    /**
     * 值班人
     */
    private String agent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}