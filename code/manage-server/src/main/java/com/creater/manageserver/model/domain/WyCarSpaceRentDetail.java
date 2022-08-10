package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车位租赁缴费明细
 * @TableName wy_car_space_rent_detail
 */
@TableName(value ="wy_car_space_rent_detail")
@Data
public class WyCarSpaceRentDetail implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属租赁id
     */
    private Long rentId;

    /**
     * 缴费类型
     */
    private String payType;

    /**
     * 缴费开始日
     */
    private Date payStartDate;

    /**
     * 缴费结束日
     */
    private Date payStopDate;

    /**
     * 应收金额
     */
    private Double shouldReceive;

    /**
     * 优惠金额
     */
    private Double discountMoney;

    /**
     * 滞纳金
     */
    private Double delayMoney;

    /**
     * 实收金额
     */
    private Double realReceiveMoney;

    /**
     * 说明
     */
    private String desc;

    /**
     * 收款人id
     */
    private String receiveId;

    /**
     * 收款人名称
     */
    private String receivePersonName;

    /**
     * 收款时间
     */
    private Date receiveDate;

    /**
     * 发票号码
     */
    private String invoiceNumber;

    /**
     * 收款状态
     */
    private String receiveStatus;

    /**
     * 作废人id
     */
    private String invalidPersonId;

    /**
     * 作废人名称
     */
    private String invalidPersonName;

    /**
     * 作废原因
     */
    private String invalidReason;

    /**
     * 作废时间
     */
    private Date invalidDate;

    /**
     * 单据审核状态
     */
    private String receiptCheckStatus;

    /**
     * 单据审核人
     */
    private String receiptCheckPerson;

    /**
     * 单据审核时间
     */
    private Date receiptCheckTime;

    /**
     * 单据审核意见
     */
    private String receiptCheckAdvice;

    /**
     * 现金审核状态
     */
    private String moneyCheckStatus;

    /**
     * 现金审核人
     */
    private String moneyCheckPerson;

    /**
     * 现金审核时间
     */
    private Date moneyCheckTime;

    /**
     * 现金审核意见
     */
    private String moneyCheckAdvice;

    /**
     * 作废审核状态
     */
    private String invalidCheckStatus;

    /**
     * 作废审核人
     */
    private String invalidCheckPerson;

    /**
     * 作废审核时间
     */
    private Date invalidCheckTime;

    /**
     * 作废审核意见
     */
    private String invalidCheckAdvice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}