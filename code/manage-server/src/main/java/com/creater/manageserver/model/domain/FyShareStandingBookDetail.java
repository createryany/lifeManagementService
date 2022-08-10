package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公摊费用台账公表明细
 * @TableName fy_share_standing_book_detail
 */
@TableName(value ="fy_share_standing_book_detail")
@Data
public class FyShareStandingBookDetail implements Serializable {
    /**
     * 公表明细id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属台账编号
     */
    private Double standingBookId;

    /**
     * 公表名称
     */
    private String publicBoxName;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 分摊户数
     */
    private Double shareNumber;

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
     * 收费周期
     */
    private Integer receiveCycle;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}