package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 清洁记录
 * @TableName wy_clean_record
 */
@TableName(value ="wy_clean_record")
@Data
public class WyCleanRecord implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目编号
     */
    private String projectId;

    /**
     * 清洁情况
     */
    private String cleanCondition;

    /**
     * 清洁时间
     */
    private String cleanDate;

    /**
     * 清洁人
     */
    private String cleanPerson;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}