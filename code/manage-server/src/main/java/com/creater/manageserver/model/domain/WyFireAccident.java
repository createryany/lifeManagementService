package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消防事故
 * @TableName wy_fire_accident
 */
@TableName(value ="wy_fire_accident")
@Data
public class WyFireAccident implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 事故日期
     */
    private Date accidentDate;

    /**
     * 事故地点
     */
    private String accidentPlace;

    /**
     * 发生原因
     */
    private String occurReason;

    /**
     * 相关人员
     */
    private String relatedPerson;

    /**
     * 处理结果
     */
    private String handleResult;

    /**
     * 损失程度
     */
    private String loss;

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