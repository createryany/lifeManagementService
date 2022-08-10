package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼盘经费支出明细
 * @TableName wy_estate_out_detail
 */
@TableName(value ="wy_estate_out_detail")
@Data
public class WyEstateOutDetail implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 记账日期
     */
    private Date chargeDate;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 支出主项目
     */
    private String outputMainProject;

    /**
     * 支出子项目
     */
    private Integer outputSubProject;

    /**
     * 支出金额
     */
    private Double outputMoney;

    /**
     * 年累计支出金额
     */
    private Double outputMoneyYear;

    /**
     * 主项累计支出金额
     */
    private Double outputMoneyMain;

    /**
     * 状态
     */
    private String status;

    /**
     * 说明
     */
    private String desc;

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
     * 下一步接收人id
     */
    private String nextReceivePersonId;

    /**
     * 下一步接收人姓名
     */
    private String nextReceivePersonName;

    /**
     * 送审时间
     */
    private Date sendCheckDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}