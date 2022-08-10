package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼盘经费支出明细_审批子表
 * @TableName wy_estate_out_detail_sub
 */
@TableName(value ="wy_estate_out_detail_sub")
@Data
public class WyEstateOutDetailSub implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 所属主单id
     */
    private Long belongOutProjectId;

    /**
     * 接受时间
     */
    private Date receiveDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 审批人id
     */
    private String checkPersonId;

    /**
     * 审批人名称
     */
    private String checkPersonName;

    /**
     * 审批时间
     */
    private Date checkDate;

    /**
     * 审批状态
     */
    private String checkStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}