package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 部门信息表
 * @TableName tbl_dept
 */
@TableName(value ="tbl_dept")
@Data
public class TblDept implements Serializable {
    /**
     * 部门id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 部门编码
     */
    private String deptCode;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门负责人
     */
    private String deptLeader;

    /**
     * 部门电话
     */
    private String deptPhone;

    /**
     * 部门类型
     */
    private Long deptType;

    /**
     * 部门传真
     */
    private String deptFax;

    /**
     * 部门上级编号
     */
    private Integer deptParent;

    /**
     * 部门层级线
     */
    private String deptLine;

    /**
     * 部门权限
     */
    private String deptPrivileges;

    /**
     * 部门管理权限
     */
    private String deptManagePrivileges;

    /**
     * 机构类别
     */
    private String organCategory;

    /**
     * 岗位编制数
     */
    private Integer deptPersonNumber;

    /**
     * 建档人
     */
    private String inputPerson;

    /**
     * 建档时间
     */
    private Date inputTime;

    /**
     * 部门备注
     */
    private String deptRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}