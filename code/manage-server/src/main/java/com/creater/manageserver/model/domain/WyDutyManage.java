package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 执勤管理
 * @TableName wy_duty_manage
 */
@TableName(value ="wy_duty_manage")
@Data
public class WyDutyManage implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 执勤日期
     */
    private Date dutyDate;

    /**
     * 执勤人
     */
    private String dutyPerson;

    /**
     * 执勤类型
     */
    private String dutyType;

    /**
     * 执勤地点
     */
    private String dutyPlace;

    /**
     * 执勤记录
     */
    private String dutyRecord;

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