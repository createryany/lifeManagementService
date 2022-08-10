package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁合同房间
 * @TableName zh_rent_contract_cell
 */
@TableName(value ="zh_rent_contract_cell")
@Data
public class ZhRentContractCell implements Serializable {
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
     * 所属档口信息
     */
    private Integer stallMessage;

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