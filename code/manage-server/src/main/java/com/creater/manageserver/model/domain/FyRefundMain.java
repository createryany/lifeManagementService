package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款单主单
 * @TableName fy_refund_main
 */
@TableName(value ="fy_refund_main")
@Data
public class FyRefundMain implements Serializable {
    /**
     * 退款单号
     */
    @TableId
    private String refundId;

    /**
     * 所属收款单号
     */
    private String receiptId;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 收费日期
     */
    private Date receiveCycle;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 费用金额
     */
    private Double money;

    /**
     * 实收金额
     */
    private Double realReceiveMoney;

    /**
     * 优惠金额
     */
    private Double discountMoney;

    /**
     * 收款方式
     */
    private String receiveMethod;

    /**
     * 是否业主
     */
    private String isCustomer;

    /**
     * 收款金额
     */
    private Double receiveMoney;

    /**
     * 费项id
     */
    private Long moneyId;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 本次欠缴
     */
    private Double currentDelayMoney;

    /**
     * 上次欠缴
     */
    private Double lastDelayMoney;

    /**
     * 退款类型
     */
    private String refundType;

    /**
     * 收据号
     */
    private String receiptNumber;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 收款人
     */
    private String receivePerson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 退款原因
     */
    private String refundReason;

    /**
     * 退款时间
     */
    private Date refundTime;

    /**
     * 退款人
     */
    private String refundPerson;

    /**
     * 审核状态
     */
    private String checkStatus;

    /**
     * 审核人
     */
    private String checkPerson;

    /**
     * 审核时间
     */
    private Date checkTime;

    /**
     * 审核意见
     */
    private String checkAdvice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}