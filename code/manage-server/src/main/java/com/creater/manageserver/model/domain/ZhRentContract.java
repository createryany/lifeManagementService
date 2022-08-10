package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁合同
 * @TableName zh_rent_contract
 */
@TableName(value ="zh_rent_contract")
@Data
public class ZhRentContract implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 合同编号
     */
    private String contractId;

    /**
     * 签订日期
     */
    private Date signDate;

    /**
     * 生效日期
     */
    private Date startDate;

    /**
     * 终止日期
     */
    private Date stopDate;

    /**
     * 所属租户id
     */
    private Integer rentId;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 起租日期
     */
    private Date startRentDate;

    /**
     * 停租日期
     */
    private Date stopRentDate;

    /**
     * 合同租金金额
     */
    private Double contractRentMoney;

    /**
     * 收费面积
     */
    private Double receiveArea;

    /**
     * 合同状态
     */
    private String contractStatus;

    /**
     * 保证金
     */
    private Double ensureMoney;

    /**
     * 保证金说明
     */
    private String ensureMoneyDesc;

    /**
     * 合同附件
     */
    private String contractAttach;

    /**
     * 租期
     */
    private Integer rentDays;

    /**
     * 管理费
     */
    private Double adminMoney;

    /**
     * 是否收取租金
     */
    private String isRentMoney;

    /**
     * 缴纳方式
     */
    private Long payMethod;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 招商人员id
     */
    private String attractPersonId;

    /**
     * 招商人员姓名
     */
    private String attractPersonName;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}