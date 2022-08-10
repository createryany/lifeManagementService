package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 邮件发送
 * @TableName tbl_email_send
 */
@TableName(value ="tbl_email_send")
@Data
public class TblEmailSend implements Serializable {
    /**
     * 邮件id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 接受人群编码
     */
    private String receivePersonCode;

    /**
     * 接受人群名称
     */
    private String receivePersonName;

    /**
     * 邮件标题
     */
    private String emailTitle;

    /**
     * 邮件内容
     */
    private String emailContent;

    /**
     * 重要级别
     */
    private String importantGrade;

    /**
     * 是否草稿
     */
    private String isDraft;

    /**
     * 删除标志
     */
    private String isDelete;

    /**
     * 密送标志
     */
    private String isSecretSend;

    /**
     * 邮件附件
     */
    private String emailAttach;

    /**
     * 发送类型
     */
    private String sendType;

    /**
     * 发送人id
     */
    private String sendPerson;

    /**
     * 发送人姓名
     */
    private String sendName;

    /**
     * 发送时间
     */
    private Date sendDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}