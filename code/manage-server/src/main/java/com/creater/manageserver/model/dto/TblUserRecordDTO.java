package com.creater.manageserver.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: createryan
 * @date 2022/8/11 17:28
 */
@Data
public class TblUserRecordDTO implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户性别
     */
    private String userGender;

    /**
     * 职位
     */
    private Integer userJob;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 内线电话
     */
    private String innerPhone;

    /**
     * 移动电话
     */
    private String movePhone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 允许发送手机短信
     */
    private String isSendMsg;

    /**
     * 有效开始日期
     */
    private Date startDate;

    /**
     * 有效结束日期
     */
    private Date stopDate;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 登陆ip规则
     */
    private String ipRule;

    /**
     * 入职日期
     */
    private Date userHiredate;

    /**
     * 允许发送微信
     */
    private String isSendWchat;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否部门管理者
     */
    private String isDeptAdmin;

    /**
     * 最后登陆时间
     */
    private Date lastLoginDate;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 部门权限
     */
    private String deptPrivileges;

    /**
     * 角色权限
     */
    private String rolePrivileges;

    /**
     * 所属公司
     */
    private String companySimpleName;

    /**
     * token 临时字段
     */
    private String token = "";

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
