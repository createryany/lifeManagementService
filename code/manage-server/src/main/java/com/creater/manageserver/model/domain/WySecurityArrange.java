package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 保安安排
 * @TableName wy_security_arrange
 */
@TableName(value ="wy_security_arrange")
@Data
public class WySecurityArrange implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date stopDate;

    /**
     * 班次
     */
    private String classes;

    /**
     * 时段
     */
    private String timeFrame;

    /**
     * 地段
     */
    private String district;

    /**
     * 值班人员
     */
    private String waterkeeper;

    /**
     * 岗位
     */
    private String job;

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