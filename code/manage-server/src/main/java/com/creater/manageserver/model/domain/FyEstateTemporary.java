package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 房产信息临时表
 * @TableName fy_estate_temporary
 */
@TableName(value ="fy_estate_temporary")
@Data
public class FyEstateTemporary implements Serializable {
    /**
     * 所属公司
     */
    private String company;

    /**
     * 房产编码
     */
    private String estateCode;

    /**
     * 房产名称
     */
    private String estateName;

    /**
     * 楼宇编码
     */
    private String buildingCode;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 单元编码
     */
    private String unitCode;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 房间编码
     */
    private String cellCode;

    /**
     * 房间名称
     */
    private String cellName;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 楼层数
     */
    private Integer floorNumber;

    /**
     * 功能
     */
    private String function;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人编码
     */
    private String operatePerson;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}