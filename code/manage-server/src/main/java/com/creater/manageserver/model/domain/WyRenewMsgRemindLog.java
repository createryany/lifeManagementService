package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 续费短信提醒日志
 * @TableName wy_renew_msg_remind_log
 */
@TableName(value ="wy_renew_msg_remind_log")
@Data
public class WyRenewMsgRemindLog implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房间号
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
     * 费用止期
     */
    private Date moneyStopDate;

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
     * 发送人姓名
     */
    private String sendPersonName;

    /**
     * 发送时间
     */
    private Date sendDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}