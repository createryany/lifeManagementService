package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车位租赁
 * @TableName wy_car_space_rent
 */
@TableName(value ="wy_car_space_rent")
@Data
public class WyCarSpaceRent implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 合同编号
     */
    private String constractId;

    /**
     * 所属车位编号
     */
    private String carSpaceId;

    /**
     * 租期开始日
     */
    private Date rentStartDate;

    /**
     * 租期结束日
     */
    private Date rentStopDate;

    /**
     * 承租月数
     */
    private Double rentMonth;

    /**
     * 使用人id
     */
    private Integer userId;

    /**
     * 使用人名称
     */
    private String userName;

    /**
     * 车牌号码
     */
    private String carLicenceId;

    /**
     * 停车证号
     */
    private String stopCarLicence;

    /**
     * 月租金
     */
    private Double rentPerMonth;

    /**
     * 月服务费
     */
    private Double serviceMoneyPerMonth;

    /**
     * 签订日期
     */
    private Date signDate;

    /**
     * 生效日期
     */
    private Date startDate;

    /**
     * 终止日期
     */
    private Date stopDate;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 中介费
     */
    private Double agentMoney;

    /**
     * 是否收取租金
     */
    private String isRentMoney;

    /**
     * 合同附件
     */
    private String contractAttach;

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