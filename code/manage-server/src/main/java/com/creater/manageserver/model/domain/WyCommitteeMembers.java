package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业委会成员
 * @TableName wy_committee_members
 */
@TableName(value ="wy_committee_members")
@Data
public class WyCommitteeMembers implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 成员代码
     */
    private String memberCode;

    /**
     * 成员姓名
     */
    private String memberName;

    /**
     * 职务
     */
    private String memberDuty;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 个人简介
     */
    private String selfIntroduce;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}