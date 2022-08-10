package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主成员
 * @TableName zh_customer_members
 */
@TableName(value ="zh_customer_members")
@Data
public class ZhCustomerMembers implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属业主编码
     */
    private Integer belongCustomerId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private Date birdate;

    /**
     * 性别
     */
    private String gender;

    /**
     * 与业主关系
     */
    private String ration;

    /**
     * 证件类型
     */
    private String certificateType;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 学历
     */
    private String education;

    /**
     * 备注
     */
    private String remark;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 照片
     */
    private String picture;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}