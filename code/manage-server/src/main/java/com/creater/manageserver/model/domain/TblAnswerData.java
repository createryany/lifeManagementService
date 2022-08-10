package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目可选答案信息表
 * @TableName tbl_answer_data
 */
@TableName(value ="tbl_answer_data")
@Data
public class TblAnswerData implements Serializable {
    /**
     * 答案编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属题目编号
     */
    private Integer subjectId;

    /**
     * 答案名称
     */
    private String answerName;

    /**
     * 答案类型
     */
    private String answerType;

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