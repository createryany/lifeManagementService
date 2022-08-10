package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 历史费用临时表
 * @TableName fy_history_money_temp
 */
@TableName(value ="fy_history_money_temp")
@Data
public class FyHistoryMoneyTemp implements Serializable {
    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 房产名称
     */
    private String cellName;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 单价
     */
    private Double priceUnit;

    /**
     * 金额
     */
    private Double money;

    /**
     * 费用起期
     */
    private Date moneyStartDate;

    /**
     * 费用止期
     */
    private Date moneyStopDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人编码
     */
    private String operatePerson;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}