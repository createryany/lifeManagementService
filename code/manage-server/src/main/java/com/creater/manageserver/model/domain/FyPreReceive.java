package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预收款管理
 * @TableName fy_pre_receive
 */
@TableName(value ="fy_pre_receive")
@Data
public class FyPreReceive implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 凭证号
     */
    private String voucherNumber;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 金额
     */
    private Double money;

    /**
     * 经手人
     */
    private String handlerPerson;

    /**
     * 收款日期
     */
    private Date receiveDate;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 收款方式
     */
    private String receiveMethod;

    /**
     * 数据来源
     */
    private String dataSource;

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