package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 信件收取
 * @TableName wy_email_receive
 */
@TableName(value ="wy_email_receive")
@Data
public class WyEmailReceive implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 收件日期
     */
    private Date receiveDate;

    /**
     * 领件日期
     */
    private Date getDate;

    /**
     * 邮件类别
     */
    private String emailType;

    /**
     * 收件单位
     */
    private String receiveUnit;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 领件人
     */
    private String getPerson;

    /**
     * 证件类型
     */
    private String cardType;

    /**
     * 证件
     */
    private String card;

    /**
     * 经手人
     */
    private String agent;

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