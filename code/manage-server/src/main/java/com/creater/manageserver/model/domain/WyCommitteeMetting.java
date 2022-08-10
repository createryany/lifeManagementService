package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业委会会议
 * @TableName wy_committee_metting
 */
@TableName(value ="wy_committee_metting")
@Data
public class WyCommitteeMetting implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 会议日期
     */
    private Date meetingDate;

    /**
     * 会议主题
     */
    private String meetingTitle;

    /**
     * 会议地点
     */
    private String meetingAddr;

    /**
     * 会议内容
     */
    private String meetingContent;

    /**
     * 主持人
     */
    private String hoster;

    /**
     * 记录员
     */
    private String recorder;

    /**
     * 参见人员
     */
    private String joiner;

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