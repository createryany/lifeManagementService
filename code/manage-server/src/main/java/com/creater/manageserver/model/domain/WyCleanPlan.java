package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 清洁安排
 * @TableName wy_clean_plan
 */
@TableName(value ="wy_clean_plan")
@Data
public class WyCleanPlan implements Serializable {
    /**
     * 项目编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 清洁地段
     */
    private String cleanPlace;

    /**
     * 清洁内容
     */
    private String cleanContent;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 清洁时间
     */
    private String cleanDate;

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