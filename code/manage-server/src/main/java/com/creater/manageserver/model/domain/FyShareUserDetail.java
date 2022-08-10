package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公摊费用台账用户明细
 * @TableName fy_share_user_detail
 */
@TableName(value ="fy_share_user_detail")
@Data
public class FyShareUserDetail implements Serializable {
    /**
     * 用户明细id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属台账编号
     */
    private Double standingBookId;

    /**
     * 所属房间编码
     */
    private Integer cellId;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 表编号
     */
    private String boxId;

    /**
     * 分摊金额
     */
    private Double shareMoney;

    /**
     * 本次分摊量
     */
    private Double currentShareNumber;

    /**
     * 本次费用起期
     */
    private Date currentPayStartDate;

    /**
     * 本次费用止期
     */
    private Date currentPayStopDate;

    /**
     * 本次缴费限期
     */
    private Date currentPayLimitDate;

    /**
     * 收费标识
     */
    private String receiveIdentify;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 费用标识
     */
    private String costIdentify;

    /**
     * 收费单号
     */
    private String receiveId;

    /**
     * 退款次数
     */
    private Integer refundNumber;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 减免金额
     */
    private Double derateMoney;

    /**
     * 应收金额
     */
    private Double shouldPay;

    /**
     * 作废次数
     */
    private Integer invalidNumber;

    /**
     * 减免滞纳金
     */
    private Double derateDelayMoney;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}