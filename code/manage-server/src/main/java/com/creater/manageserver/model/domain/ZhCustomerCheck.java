package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主验房
 * @TableName zh_customer_check
 */
@TableName(value ="zh_customer_check")
@Data
public class ZhCustomerCheck implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private String cellId;

    /**
     * 验收日期
     */
    private Date checkDate;

    /**
     * 确认日期
     */
    private Date confirmDate;

    /**
     * 验收项目编号
     */
    private Long checkItemId;

    /**
     * 验收项目名称
     */
    private String checkItemName;

    /**
     * 是否合格
     */
    private String isPass;

    /**
     * 业主意见
     */
    private String consumerAdvice;

    /**
     * 房管员意见
     */
    private String houseKeeperAdvice;

    /**
     * 验收人员
     */
    private String checkPerson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private Date inputDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 验房类型
     */
    private String checkHouseType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}