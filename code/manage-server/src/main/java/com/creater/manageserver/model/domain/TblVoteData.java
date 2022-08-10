package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 投票数据表
 * @TableName tbl_vote_data
 */
@TableName(value ="tbl_vote_data")
@Data
public class TblVoteData implements Serializable {
    /**
     * 投票编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 投票项目编号
     */
    private Integer voteProjectId;

    /**
     * 投票用户编码
     */
    private String voteUserId;

    /**
     * 投票用户名称
     */
    private String voteUserName;

    /**
     * 投票时间
     */
    private Date voteDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}