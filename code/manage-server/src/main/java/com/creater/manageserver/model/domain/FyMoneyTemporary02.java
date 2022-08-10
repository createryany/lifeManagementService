package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 费用临时表2
 * @TableName fy_money_temporary_02
 */
@TableName(value ="fy_money_temporary_02")
@Data
public class FyMoneyTemporary02 implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 费项编码
     */
    private Integer moneyId;

    /**
     * 档案名称
     */
    private String recordName;

    /**
     * 档案备注
     */
    private String recordRemark;

    /**
     * 房间编码
     */
    private Integer cellId;

    /**
     * 房产名称
     */
    private String estateName;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 房间名称
     */
    private String cellName;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 计费单位
     */
    private Double chargeUnit;

    /**
     * 单位价格
     */
    private Double priceUnit;

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

    /**
     * 操作人编码
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private Date operateDate;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}