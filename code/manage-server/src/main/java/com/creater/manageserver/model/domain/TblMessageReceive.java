package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 短信接受表
 * @TableName tbl_message_receive
 */
@TableName(value ="tbl_message_receive")
@Data
public class TblMessageReceive implements Serializable {
    /**
     * 记录编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 拓展号码
     */
    private String extendPhone;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 回复时间
     */
    private Date replyDate;

    /**
     * 位置序号
     */
    private String positionOrder;

    /**
     * 接受时间
     */
    private Date receiveDate;

    /**
     * 读取标记
     */
    private Integer readTag;

    /**
     * 读取时间
     */
    private Date readDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}