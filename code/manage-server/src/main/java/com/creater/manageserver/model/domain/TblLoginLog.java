package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 登录日志
 * @TableName tbl_login_log
 */
@TableName(value ="tbl_login_log")
@Data
public class TblLoginLog implements Serializable {
    /**
     * 登录人员编码
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 登录日期
     */
    private Date loginDate;

    /**
     * 登录的ip地址
     */
    private String loginIp;

    /**
     * 登录状态
     */
    private String loginStatus;

    /**
     * 进入模块名称
     */
    private Long openMk;

    /**
     * 登录机器名
     */
    private String loginMechineName;

    /**
     * 端口号
     */
    private String loginPort;

    /**
     * 登录入口
     */
    private String loginDoor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}