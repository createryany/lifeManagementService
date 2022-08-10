package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 植被信息
 * @TableName wy_vegetation_information
 */
@TableName(value ="wy_vegetation_information")
@Data
public class WyVegetationInformation implements Serializable {
    /**
     * 植被编号
     */
    @TableId
    private String vegetationId;

    /**
     * 植被名称
     */
    private String vegetationName;

    /**
     * 种类
     */
    private String vegetationType;

    /**
     * 树龄
     */
    private Integer vegetationAge;

    /**
     * 数量
     */
    private Integer vegetationNumber;

    /**
     * 单位
     */
    private String vegetationUnit;

    /**
     * 习性
     */
    private String vegetationHabit;

    /**
     * 特点
     */
    private String vegetationFeature;

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