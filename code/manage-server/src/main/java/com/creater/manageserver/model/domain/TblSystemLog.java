package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统日志
 * @TableName tbl_system_log
 */
@TableName(value ="tbl_system_log")
@Data
public class TblSystemLog implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 日志内容
     */
    private String logContent;

    /**
     * 模块编码
     */
    private String modelId;

    /**
     * ip地址
     */
    private String ipAddr;

    /**
     * 部门权限
     */
    private String deptPrivileges;

    /**
     * 操作人编码
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operateName;

    /**
     * 部门编码
     */
    private String deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 操作时间
     */
    private Date operateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}