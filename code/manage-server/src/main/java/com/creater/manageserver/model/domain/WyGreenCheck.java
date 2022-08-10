package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 绿化检查
 * @TableName wy_green_check
 */
@TableName(value ="wy_green_check")
@Data
public class WyGreenCheck implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 绿化编码
     */
    private String greenCode;

    /**
     * 检查时间
     */
    private Date checkDate;

    /**
     * 检查情况
     */
    private String checkCondition;

    /**
     * 处理情况
     */
    private String handleCondition;

    /**
     * 检查人
     */
    private String checkPerson;

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