package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 单位名录
 * @TableName tbl_company_record
 */
@TableName(value ="tbl_company_record")
@Data
public class TblCompanyRecord implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String companyAdd;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 公司级别
     */
    private String compantGrade;

    /**
     * 上级部门
     */
    private String parentCompany;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 传真号码
     */
    private String faxNumber;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 简单介绍
     */
    private String simpleDesc;

    /**
     * 备注
     */
    private String remark;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private Date inputTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}