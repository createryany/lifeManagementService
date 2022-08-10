package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消防演练
 * @TableName wy_fire_exercise
 */
@TableName(value ="wy_fire_exercise")
@Data
public class WyFireExercise implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 单位
     */
    private String unit;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date stopDate;

    /**
     * 演练目的
     */
    private String exercisePurpose;

    /**
     * 参与人数
     */
    private Integer joinPersons;

    /**
     * 协助单位
     */
    private String assistantUnit;

    /**
     * 演练内容
     */
    private String exerciseContent;

    /**
     * 演练效果
     */
    private String exerciseResult;

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