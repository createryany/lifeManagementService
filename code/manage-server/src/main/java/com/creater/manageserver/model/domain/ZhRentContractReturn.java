package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁合同返利
 * @TableName zh_rent_contract_return
 */
@TableName(value ="zh_rent_contract_return")
@Data
public class ZhRentContractReturn implements Serializable {
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
     * 返利日期起
     */
    private Date returnMoneyStart;

    /**
     * 返利日期终
     */
    private Date returnMoneyStop;

    /**
     * 返利基数金额
     */
    private Double returnCardinalMoney;

    /**
     * 返利比例
     */
    private Double returnRate;

    /**
     * 本次返利金额
     */
    private Double currentReturnMoney;

    /**
     * 返利状态
     */
    private String returnMoneyStatus;

    /**
     * 返利说明
     */
    private String returnMoneyDesc;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operateName;

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
     * 作废时间
     */
    private Date invalidDate;

    /**
     * 作废原因
     */
    private String invalidReason;

    /**
     * 修改人id
     */
    private String updatePersonId;

    /**
     * 修改人名称
     */
    private String updatePersonName;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 修改原因
     */
    private String updateReason;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}