package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 信息发送
 * @TableName tbl_message_send
 */
@TableName(value ="tbl_message_send")
@Data
public class TblMessageSend implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送人
     */
    private String sendPerson;

    /**
     * 发送时间
     */
    private Date sendDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}