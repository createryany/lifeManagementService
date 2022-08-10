package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 销售合同
 * @TableName fy_sale_contract
 */
@TableName(value ="fy_sale_contract")
@Data
public class FySaleContract implements Serializable {
    /**
     * 合同编号
     */
    @TableId
    private String saleContractId;

    /**
     * 所属房间编号
     */
    private Integer cellId;

    /**
     * 合同金额
     */
    private Double contractMoney;

    /**
     * 合同日期
     */
    private Date contractDate;

    /**
     * 付款方式
     */
    private String payMethod;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 固定电话
     */
    private String onlinePhone;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合同附件
     */
    private String contractAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}