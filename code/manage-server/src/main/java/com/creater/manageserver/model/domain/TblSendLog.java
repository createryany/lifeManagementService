package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 发送日志表
 * @TableName tbl_send_log
 */
@TableName(value ="tbl_send_log")
@Data
public class TblSendLog implements Serializable {
    /**
     * 记录编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 发送者名称
     */
    private String sendName;

    /**
     * 请求时间
     */
    private Date requestDate;

    /**
     * 定时标志
     */
    private Integer sendTag;

    /**
     * 定时时间
     */
    private Date timingDate;

    /**
     * 短信类型
     */
    private Integer messageType;

    /**
     * 拓展号码
     */
    private String extendPhone;

    /**
     * 接受手机号码
     */
    private String receivePhone;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 是否发送
     */
    private Integer isSend;

    /**
     * 接收人标识
     */
    private String receiveIdentify;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}