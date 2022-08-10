package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 费项设置
 * @TableName fy_money_setting
 */
@TableName(value ="fy_money_setting")
@Data
public class FyMoneySetting implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 费项编号
     */
    private String moneySettingCode;

    /**
     * 费项名称
     */
    private String moneySettingName;

    /**
     * 收费方式
     */
    private String receiveType;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 费用类型
     */
    private String moneyType;

    /**
     * 是否允许修改单价
     */
    private String isUpdatePrice;

    /**
     * 是否便捷费项
     */
    private String isConvenientMoney;

    /**
     * 最小使用量
     */
    private Double minUsedNumber;

    /**
     * 是否阶梯收费
     */
    private String isStepReceive;

    /**
     * 阶梯条件1
     */
    private Double stepCondition1;

    /**
     * 阶梯单价1
     */
    private Double stepPrice1;

    /**
     * 阶梯条件2
     */
    private Double stepCondition21;

    /**
     * 阶梯条件2
     */
    private Double stepCondition22;

    /**
     * 阶梯单价2
     */
    private Double stepPrice2;

    /**
     * 阶梯条件3
     */
    private Double stepCondition31;

    /**
     * 阶梯条件3
     */
    private Double stepCondition32;

    /**
     * 阶梯单价3
     */
    private Double stepPrice3;

    /**
     * 阶梯条件4
     */
    private Double stepCondition41;

    /**
     * 阶梯条件4
     */
    private Double stepCondition42;

    /**
     * 阶梯单价4
     */
    private Double stepPrice4;

    /**
     * 阶梯条件5
     */
    private Double stepCondition5;

    /**
     * 阶梯单价5
     */
    private Double stepPrice5;

    /**
     * 续费短信
     */
    private String renewMessage;

    /**
     * 从已收费的费用止期后N天发送短信
     */
    private Integer receiveWarnStopDay;

    /**
     * 最多短信重复提醒次数
     */
    private Integer maxWarnNumber;

    /**
     * 催缴短信
     */
    private String askMessage;

    /**
     * 从未收取的缴费限期前N天发送短信
     */
    private Integer noReceiveWarnStopDay;

    /**
     * 关联费项ID
     */
    private Integer associateMoneyId;

    /**
     * 滞纳金比率
     */
    private Double delayRate;

    /**
     * 滞纳金超期天数
     */
    private Integer delayOverDay;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 常规收费打印时隐藏单价
     */
    private String receivePrintHidden;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}