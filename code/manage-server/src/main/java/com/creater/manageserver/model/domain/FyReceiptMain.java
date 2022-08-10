package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收款单主单
 * @TableName fy_receipt_main
 */
@TableName(value ="fy_receipt_main")
@Data
public class FyReceiptMain implements Serializable {
    /**
     * 收款单号
     */
    @TableId
    private String id;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 收费日期
     */
    private Date receiveDate;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 应付合计
     */
    private Double shouldPayTotal;

    /**
     * 本次应收
     */
    private Double currentShouldReceive;

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
     * 本次实收
     */
    private Double currentRealReceive;

    /**
     * 临客费项id
     */
    private Long temporaryMoneyId;

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
     * 标题
     */
    private String title;

    /**
     * 收款类型
     */
    private String receiveType;

    /**
     * 收据号
     */
    private String receiptNumber;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 收款人
     */
    private String receivePerson;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 操作时间
     */
    private Date operateDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 修改原因
     */
    private String updateReason;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}