package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物业接管工程明细
 * @TableName wy_property_takeover_detail
 */
@TableName(value ="wy_property_takeover_detail")
@Data
public class WyPropertyTakeoverDetail implements Serializable {
    /**
     * 接管细节id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属接管id
     */
    private Integer takeoverId;

    /**
     * 工程项目名称
     */
    private String projectName;

    /**
     * 验收方
     */
    private String checked;

    /**
     * 验收日期
     */
    private Date checkedDate;

    /**
     * 验收结果
     */
    private String checkedResult;

    /**
     * 整改完成日期
     */
    private Date finishDate;

    /**
     * 整改完成情况
     */
    private String finishCondition;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}