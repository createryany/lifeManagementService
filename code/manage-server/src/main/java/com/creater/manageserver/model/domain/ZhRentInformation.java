package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 租户信息
 * @TableName zh_rent_information
 */
@TableName(value ="zh_rent_information")
@Data
public class ZhRentInformation implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 租户编码
     */
    private String rentCode;

    /**
     * 租户名称
     */
    private String rentName;

    /**
     * 法定代表
     */
    private String memberOfRight;

    /**
     * 租户类型
     */
    private Long rentType;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String homeNumber;

    /**
     * 手机
     */
    private String phoneNumber;

    /**
     * 地址
     */
    private String addr;

    /**
     * 证件类型
     */
    private Long certificateType;

    /**
     * 主营商品
     */
    private Long mainSale;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 照片地址
     */
    private String pictureUrl;

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
     * 登陆密码
     */
    private String pwd;

    /**
     * 租户附件
     */
    private String rentAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}