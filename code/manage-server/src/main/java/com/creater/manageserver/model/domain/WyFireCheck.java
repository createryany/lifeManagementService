package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消防巡查
 * @TableName wy_fire_check
 */
@TableName(value ="wy_fire_check")
@Data
public class WyFireCheck implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 巡视日期
     */
    private Date checkDate;

    /**
     * 巡视地点
     */
    private String checkPlace;

    /**
     * 巡视人
     */
    private String checkPerson;

    /**
     * 巡视情况
     */
    private String checkCondition;

    /**
     * 处理意见
     */
    private String handleAdvice;

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