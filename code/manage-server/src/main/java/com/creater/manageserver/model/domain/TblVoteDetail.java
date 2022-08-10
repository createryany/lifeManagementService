package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 投票数据明细表
 * @TableName tbl_vote_detail
 */
@TableName(value ="tbl_vote_detail")
@Data
public class TblVoteDetail implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 投票编号
     */
    private Integer voteId;

    /**
     * 答案编号
     */
    private Integer answerId;

    /**
     * 答案
     */
    private String result;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}