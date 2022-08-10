package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 物业费分布
 * @TableName fy_property_money_dist
 */
@TableName(value ="fy_property_money_dist")
@Data
public class FyPropertyMoneyDist implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private Integer cellId;

    /**
     * 费项编号
     */
    private Integer moneyId;

    /**
     * 是否共有费用
     */
    private String isPublicMoney;

    /**
     * 当前读数
     */
    private Double currentReadNumber;

    /**
     * 上次计费单位
     */
    private Double lastChargeUnit;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    /**
     * 使用量倍数
     */
    private Integer useNumberMult;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}