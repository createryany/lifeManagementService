package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 费用台账明细
 * @TableName fy_standing_book_detail
 */
@TableName(value ="fy_standing_book_detail")
@Data
public class FyStandingBookDetail implements Serializable {
    /**
     * 台账明细编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属台账编号
     */
    private Integer standingBookId;

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
     * 计费单位
     */
    private Double chargeUnit;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 上次读数
     */
    private Double lastReadNumber;

    /**
     * 本次读数
     */
    private Double currentReadNumber;

    /**
     * 本次用量
     */
    private Double currentUseNumber;

    /**
     * 应缴费用
     */
    private Double shouldPay;

    /**
     * 上次费用止期
     */
    private Date lastPayStopDate;

    /**
     * 上次费用起期
     */
    private Date lastPayStartDate;

    /**
     * 本次费用止期
     */
    private Date currentPayStopDate;

    /**
     * 本次费用限期
     */
    private Date currentPayLimitDate;

    /**
     * 费用标识
     */
    private String costIdentify;

    /**
     * 收费标识
     */
    private String receiveIdentify;

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
     * 减免费用
     */
    private Double derateMoney;

    /**
     * 应收费用
     */
    private Double shouldReceive;

    /**
     * 作废次数
     */
    private Integer invalidNumber;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    /**
     * 减免滞纳金
     */
    private Double derateDelayMoney;

    /**
     * 费用倍数
     */
    private Integer payMult;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}