package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主服务_办理进度
 * @TableName zh_cs_handle_speed
 */
@TableName(value ="zh_cs_handle_speed")
@Data
public class ZhCsHandleSpeed implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 服务单id
     */
    private Integer serviceId;

    /**
     * 办理人
     */
    private String transactorName;

    /**
     * 办理时间
     */
    private Date transactorDate;

    /**
     * 办理内容
     */
    private String transactorContent;

    /**
     * 记录人id
     */
    private String recorderId;

    /**
     * 记录人名称
     */
    private String recorderName;

    /**
     * 记录时间
     */
    private Date recorderDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}