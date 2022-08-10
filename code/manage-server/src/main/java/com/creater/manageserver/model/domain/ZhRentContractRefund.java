package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁合同退款
 * @TableName zh_rent_contract_refund
 */
@TableName(value ="zh_rent_contract_refund")
@Data
public class ZhRentContractRefund implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属合同编号
     */
    private Integer contractId;

    /**
     * 所属租户id
     */
    private Integer rentId;

    /**
     * 租户名称
     */
    private String rentName;

    /**
     * 退款日期
     */
    private Date refundTime;

    /**
     * 退款金额
     */
    private Double refundMoney;

    /**
     * 退款状态
     */
    private String refundStatus;

    /**
     * 退款说明
     */
    private String refundDesc;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private Date operateDate;

    /**
     * 作废人id
     */
    private String invalidId;

    /**
     * 作废人名称
     */
    private String invalidPerson;

    /**
     * 作废原因
     */
    private Date invalidReason;

    /**
     * 作废时间
     */
    private String invalidDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}