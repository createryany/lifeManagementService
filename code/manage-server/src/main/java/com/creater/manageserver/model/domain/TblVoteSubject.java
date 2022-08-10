package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 投票题目表
 * @TableName tbl_vote_subject
 */
@TableName(value ="tbl_vote_subject")
@Data
public class TblVoteSubject implements Serializable {
    /**
     * 题目编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属项目编号
     */
    private Integer projectId;

    /**
     * 题目名称
     */
    private String subjectName;

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