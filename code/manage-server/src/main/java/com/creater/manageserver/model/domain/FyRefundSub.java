package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款单子单
 * @TableName fy_refund_sub
 */
@TableName(value ="fy_refund_sub")
@Data
public class FyRefundSub implements Serializable {
    /**
     * 退款单明细单号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属退款单号
     */
    private String refundId;

    /**
     * 费项名称
     */
    private String moneySettingName;

    /**
     * 计费单价
     */
    private Double chargeUnit;

    /**
     * 上次读数
     */
    private Double lastReadNumber;

    /**
     * 本次读数
     */
    private Double currentReadNumber;

    /**
     * 实际用量
     */
    private Double realUsed;

    /**
     * 费用金额
     */
    private Double money;

    /**
     * 滞纳金
     */
    private Double delayMoney;

    /**
     * 本次应付
     */
    private Double currentShouldPay;

    /**
     * 超期天数
     */
    private Integer overDay;

    /**
     * 费用起期
     */
    private Date moneyStartDate;

    /**
     * 费用止期
     */
    private Date moneyStopDate;

    /**
     * 缴费限期
     */
    private Date payLimitDay;

    /**
     * 记录人
     */
    private String inputPerson;

    /**
     * 所属台账id
     */
    private String standingBookId;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 费用减免金额
     */
    private Double moneyDerate;

    /**
     * 费项id
     */
    private Integer moneyId;

    /**
     * 滞纳金减免金额
     */
    private Double delayDerateMoney;

    /**
     * 费用倍数
     */
    private Integer moneyMult;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}