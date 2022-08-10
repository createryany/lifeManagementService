package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 我的意见
 * @TableName tbl_myadvice
 */
@TableName(value ="tbl_myadvice")
@Data
public class TblMyadvice implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 意见箱
     */
    private Integer adviceBox;

    /**
     * 状态
     */
    private String status;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 发表人id
     */
    private String publisherId;

    /**
     * 发表人名称
     */
    private String publisherName;

    /**
     * 发表时间
     */
    private Date publisherDate;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复人id
     */
    private String replyId;

    /**
     * 回复人名称
     */
    private String replyName;

    /**
     * 回复时间
     */
    private Date replyDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}