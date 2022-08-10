package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车位管理
 * @TableName wy_car_space_manage
 */
@TableName(value ="wy_car_space_manage")
@Data
public class WyCarSpaceManage implements Serializable {
    /**
     * 车位编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 车位类型
     */
    private Long carSpaceType;

    /**
     * 车牌号码
     */
    private String carLicenceId;

    /**
     * 预售价格
     */
    private Double preSalePrice;

    /**
     * 预租价格
     */
    private Double preRentPrice;

    /**
     * 停车证号
     */
    private String stopCarLicence;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 管理类别
     */
    private String manageType;

    /**
     * 车位位置
     */
    private String carSapcePosition;

    /**
     * 车位面积
     */
    private Double carSapceArea;

    /**
     * 产权人id
     */
    private Integer ownerId;

    /**
     * 产权人名称
     */
    private String ownerName;

    /**
     * 实售价格
     */
    private Double realSalePrice;

    /**
     * 车位类别
     */
    private String carSpaceCategory;

    /**
     * 当前状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 销售人
     */
    private String salePerson;

    /**
     * 销售时间
     */
    private Date saleDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}