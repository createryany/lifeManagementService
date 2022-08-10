package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 临客费项设置
 * @TableName fy_temporary_money_setting
 */
@TableName(value ="fy_temporary_money_setting")
@Data
public class FyTemporaryMoneySetting implements Serializable {
    /**
     * 临客费项id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 费项名称
     */
    private String temporaryMoneyName;

    /**
     * 上级费项id
     */
    private Integer upperMoneyId;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 费项说明
     */
    private String moneyDescription;

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
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}