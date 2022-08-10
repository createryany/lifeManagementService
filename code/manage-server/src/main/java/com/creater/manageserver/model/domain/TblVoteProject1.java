package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 投票项目表
 * @TableName tbl_vote_project1
 */
@TableName(value ="tbl_vote_project1")
@Data
public class TblVoteProject1 implements Serializable {
    /**
     * 项目编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目类型
     */
    private String projectType;

    /**
     * 项目标志
     */
    private String projectTag;

    /**
     * 项目说明
     */
    private String projectDesc;

    /**
     * 建档人
     */
    private String inputRecordPerson;

    /**
     * 建档时间
     */
    private Date inputRecordDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}