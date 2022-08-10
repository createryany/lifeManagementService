package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主服务_办理结果
 * @TableName zh_cs_handle_result
 */
@TableName(value ="zh_cs_handle_result")
@Data
public class ZhCsHandleResult implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属服务单id
     */
    private Integer serviceId;

    /**
     * 办理人id
     */
    private String transactorId;

    /**
     * 办理人名称
     */
    private String transactorName;

    /**
     * 是否负责人
     */
    private String isLeader;

    /**
     * 相关单位
     */
    private String relationCompany;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 开始办理时间
     */
    private Date handleStartDate;

    /**
     * 完成办理时间
     */
    private Date handleStopDate;

    /**
     * 办理结果
     */
    private String handleResult;

    /**
     * 办理完成附件
     */
    private String handleFinishAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}