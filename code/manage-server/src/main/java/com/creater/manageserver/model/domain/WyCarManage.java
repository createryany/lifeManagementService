package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车辆管理
 * @TableName wy_car_manage
 */
@TableName(value ="wy_car_manage")
@Data
public class WyCarManage implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 车牌号
     */
    private String carLicnece;

    /**
     * 停车牌号
     */
    private String stopCarLicence;

    /**
     * 车主姓名
     */
    private String carOwnerName;

    /**
     * 车位
     */
    private String carport;

    /**
     * 入场时间
     */
    private Date inDate;

    /**
     * 出场时间
     */
    private Date outDate;

    /**
     * 值班人
     */
    private String agent;

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