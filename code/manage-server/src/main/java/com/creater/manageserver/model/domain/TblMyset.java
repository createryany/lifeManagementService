package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 个人设置
 * @TableName tbl_myset
 */
@TableName(value ="tbl_myset")
@Data
public class TblMyset implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编码
     */
    private String username;

    /**
     * 是否需要提醒
     */
    private String idRemain;

    /**
     * 提醒间隔时间
     */
    private String remainInterval;

    /**
     * 弹出提醒窗口
     */
    private String remainWindowOpen;

    /**
     * 消息提醒
     */
    private String messageRemain;

    /**
     * 默认主页面
     */
    private String defaultMain;

    /**
     * 邮箱全称
     */
    private String emailAll;

    /**
     * smtp地址
     */
    private String smtpAddr;

    /**
     * 登录用户
     */
    private String loginUser;

    /**
     * 登录密码
     */
    private String loginPwd;

    /**
     * 邮件端口
     */
    private String mailPort;

    /**
     * 发送人名称
     */
    private String sendPerson;

    /**
     * 分页行数
     */
    private Integer pageCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}