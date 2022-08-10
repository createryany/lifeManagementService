package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租户转兑
 * @TableName zh_rent_transfer
 */
@TableName(value ="zh_rent_transfer")
@Data
public class ZhRentTransfer implements Serializable {
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
     * 转出租户id
     */
    private Integer transferOutId;

    /**
     * 转出租户名称
     */
    private String transferOutName;

    /**
     * 转入租户id
     */
    private Integer transferInId;

    /**
     * 转入租户名称
     */
    private String transferInName;

    /**
     * 更名费
     */
    private Double changeNameMoney;

    /**
     * 转兑说明
     */
    private String transferDesc;

    /**
     * 转兑时间
     */
    private Date transferDate;

    /**
     * 操作人
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private Date operateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}