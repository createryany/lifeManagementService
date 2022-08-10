package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租赁分租信息
 * @TableName zh_rent_share
 */
@TableName(value ="zh_rent_share")
@Data
public class ZhRentShare implements Serializable {
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
     * 租户名称
     */
    private String rentName;

    /**
     * 分租人
     */
    private String shareRentPerson;

    /**
     * 分租房间id
     */
    private String shareCellId;

    /**
     * 分租房间名称
     */
    private String shareCellName;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 起始日期
     */
    private Date startDate;

    /**
     * 截止日期
     */
    private Date stopDate;

    /**
     * 经营范围
     */
    private String saleRange;

    /**
     * 备注
     */
    private String remark;

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