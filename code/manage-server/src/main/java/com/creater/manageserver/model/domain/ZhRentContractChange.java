package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁合同变更
 * @TableName zh_rent_contract_change
 */
@TableName(value ="zh_rent_contract_change")
@Data
public class ZhRentContractChange implements Serializable {
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
     * 变更项目
     */
    private String changeProject;

    /**
     * 原值
     */
    private String oldValue;

    /**
     * 新值
     */
    private String newValue;

    /**
     * 说明
     */
    private String desc;

    /**
     * 变更人
     */
    private String changePerson;

    /**
     * 变更时间
     */
    private Date changeDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}