package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主服务类型
 * @TableName zh_customer_service_type
 */
@TableName(value ="zh_customer_service_type")
@Data
public class ZhCustomerServiceType implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型单价
     */
    private Double typePrice;

    /**
     * 类型说明
     */
    private String typeDesc;

    /**
     * 类型状态
     */
    private String typeStatus;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建人时间
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