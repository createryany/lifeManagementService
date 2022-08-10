package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 催缴短信提醒日志
 * @TableName wy_ask_msg_remind_log
 */
@TableName(value ="wy_ask_msg_remind_log")
@Data
public class WyAskMsgRemindLog implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 费项id
     */
    private Integer moneyId;

    /**
     * 接受号码
     */
    private String receivePhone;

    /**
     * 缴费限期
     */
    private Date payLimitDay;

    /**
     * 提醒天数
     */
    private Integer remindDays;

    /**
     * 房产名称
     */
    private String cellName;

    /**
     * 发送人id
     */
    private String sendPersonId;

    /**
     * 发送人名称
     */
    private String sendPersonName;

    /**
     * 发送时间
     */
    private Date sendDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}