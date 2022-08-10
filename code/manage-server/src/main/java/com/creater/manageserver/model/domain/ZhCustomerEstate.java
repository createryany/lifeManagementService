package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主房产对照表
 * @TableName zh_customer_estate
 */
@TableName(value ="zh_customer_estate")
@Data
public class ZhCustomerEstate implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 业主id
     */
    private Integer customerId;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 使用状态
     */
    private String useStatus;

    /**
     * 入住日期
     */
    private Date liveDate;

    /**
     * 装修时间
     */
    private Date decorateDate;

    /**
     * 认购证号
     */
    private String subscriptionCardNumber;

    /**
     * 房产证号
     */
    private String houseCode;

    /**
     * 是否缴纳维修金
     */
    private String isPayDecorateMoney;

    /**
     * 预缴维修金
     */
    private Double prePayDecorateMoney;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序号
     */
    private Integer orderid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}