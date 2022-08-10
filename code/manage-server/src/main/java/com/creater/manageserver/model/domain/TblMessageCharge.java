package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 短信充值单
 * @TableName tbl_message_charge
 */
@TableName(value ="tbl_message_charge")
@Data
public class TblMessageCharge implements Serializable {
    /**
     * 充值单号
     */
    private String chargeNumber;

    /**
     * 充值账户
     */
    private String chargeAccount;

    /**
     * 充值金额
     */
    private Double chargeMoney;

    /**
     * 充值说明
     */
    private String chargeDesc;

    /**
     * 充值人
     */
    private String chargePerson;

    /**
     * 充值日期
     */
    private Date chargeDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}