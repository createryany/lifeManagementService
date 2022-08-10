package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 费用台账概要
 * @TableName fy_standing_book
 */
@TableName(value ="fy_standing_book")
@Data
public class FyStandingBook implements Serializable {
    /**
     * 台账编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 台账名称
     */
    private String standingBookName;

    /**
     * 关联费用编码
     */
    private Integer associateCostCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 生成日期
     */
    private Date creationDate;

    /**
     * 生成人
     */
    private String creationPerson;

    /**
     * 关联台账账号
     */
    private String associateStandingBookId;

    /**
     * 所属公司
     */
    private Integer company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}