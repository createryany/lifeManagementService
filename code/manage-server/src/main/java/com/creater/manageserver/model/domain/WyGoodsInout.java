package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物品出入
 * @TableName wy_goods_inout
 */
@TableName(value ="wy_goods_inout")
@Data
public class WyGoodsInout implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 出入时间
     */
    private Date inoutDate;

    /**
     * 携带人
     */
    private String carryPerson;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 出入类型
     */
    private String inputType;

    /**
     * 居住地址
     */
    private String liveAddr;

    /**
     * 出入单元
     */
    private String inoutUnit;

    /**
     * 户主姓名
     */
    private String customerName;

    /**
     * 出入物品
     */
    private String inoutGoods;

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