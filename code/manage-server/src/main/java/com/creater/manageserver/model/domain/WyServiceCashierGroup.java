package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客服收银组
 * @TableName wy_service_cashier_group
 */
@TableName(value ="wy_service_cashier_group")
@Data
public class WyServiceCashierGroup implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客服组名称
     */
    private String name;

    /**
     * 包含楼宇编码
     */
    private String includeBuildingCode;

    /**
     * 包含楼宇名称
     */
    private String includeBuildingName;

    /**
     * 包含客服编码
     */
    private String includeServiceCode;

    /**
     * 包含客服名称
     */
    private String includeServiceName;

    /**
     * 组说明
     */
    private String desc;

    /**
     * 所属公司
     */
    private String company;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}