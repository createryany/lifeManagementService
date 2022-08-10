package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 清洁检查
 * @TableName wy_clean_check
 */
@TableName(value ="wy_clean_check")
@Data
public class WyCleanCheck implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 检查日期
     */
    private Date checkDate;

    /**
     * 检查地段
     */
    private String checkPlace;

    /**
     * 检查情况
     */
    private String checkCondition;

    /**
     * 检查人
     */
    private String checkPerson;

    /**
     * 清洁人
     */
    private String cleanPerson;

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