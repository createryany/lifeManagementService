package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 房间信息表
 * @TableName fc_cell
 */
@TableName(value ="fc_cell")
@Data
public class FcCell implements Serializable {
    /**
     * 房间编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 单元编码
     */
    private String unitCode;

    /**
     * 房间编码
     */
    private String cellCode;

    /**
     * 房间名称
     */
    private String cellName;

    /**
     * 户型编码
     */
    private String cellHouseCode;

    /**
     * 朝向编码
     */
    private String cellTowardCode;

    /**
     *  功能
     */
    private String cellFunction;

    /**
     * 装修编码
     */
    private String cellDecorateCode;

    /**
     * 使用面积
     */
    private Double cellUsedArea;

    /**
     * 建筑面积
     */
    private Double cellBuildArea;

    /**
     * 车库面积
     */
    private Double carportArea;

    /**
     * 车位面积
     */
    private Double carArea;

    /**
     * 阁楼面积
     */
    private Double loftArea;

    /**
     * 储藏室面积
     */
    private Double storeArea;

    /**
     * 楼层数
     */
    private Integer floorNumber;

    /**
     * 上次欠缴
     */
    private Double lastDebt;

    /**
     * 物业类型
     */
    private Long propertyType;

    /**
     * 租金
     */
    private Double rentMoney;

    /**
     * 长度
     */
    private Double length;

    /**
     * 宽度
     */
    private Double width;

    /**
     * 档口用途
     */
    private Long stallUse;

    /**
     * 档口区域
     */
    private Long stallArea;

    /**
     * 是否已售
     */
    private String isSale;

    /**
     * 是否已租
     */
    private String isRent;

    /**
     * 销售合同编号
     */
    private String saleContractId;

    /**
     * 租赁合同编号
     */
    private String rentContractId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系数
     */
    private String factor;

    /**
     * 房间性质
     */
    private Integer cellProperty;

    /**
     * 储藏室号
     */
    private String storeId;

    /**
     * 车牌号
     */
    private String carLicenceId;

    /**
     * 车位号
     */
    private String carSpaceId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}