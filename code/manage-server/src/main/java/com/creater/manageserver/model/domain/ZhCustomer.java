package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主信息表
 * @TableName zh_customer
 */
@TableName(value ="zh_customer")
@Data
public class ZhCustomer implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 业主编码
     */
    private String customerCode;

    /**
     * 业主密码
     */
    private String customerPwd;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 业主生日
     */
    private String customerBirthday;

    /**
     * 业主性别
     */
    private String customerGender;

    /**
     * 开户行
     */
    private String openBank;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 学历
     */
    private String education;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 证件类型
     */
    private String certificateType;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 职务
     */
    private String customerDuty;

    /**
     * 所在派出所
     */
    private String police;

    /**
     * 民族
     */
    private String nation;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 紧急联系人姓名
     */
    private String urgencyUserName;

    /**
     * 紧急联系人电话
     */
    private String urgencyUserPhone;

    /**
     * 紧急联系人地址
     */
    private String urgencyUserAddress;

    /**
     * 业主状态
     */
    private String customerStatus;

    /**
     * 业主类型
     */
    private String customerType;

    /**
     * 照片
     */
    private String picture;

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
     * 所属公司
     */
    private String company;

    /**
     * 是否银行代扣
     */
    private String isBankWithhold;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}