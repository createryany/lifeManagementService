package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主服务
 * @TableName zh_customer_service
 */
@TableName(value ="zh_customer_service")
@Data
public class ZhCustomerService implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private Integer cellId;

    /**
     * 申请人姓名
     */
    private String proposer;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 诉求时间
     */
    private Date appealDate;

    /**
     * 诉求事项
     */
    private String appealEvent;

    /**
     * 状态
     */
    private String status;

    /**
     * 服务类型
     */
    private Long serviceType;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 标识
     */
    private String identify;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 审批时间
     */
    private Date checkDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 服务费用
     */
    private Double serviceMoney;

    /**
     * 回访人
     */
    private String returnVisitPerson;

    /**
     * 回访时间
     */
    private Date returnVisitDate;

    /**
     * 是否满意
     */
    private String isSatisfy;

    /**
     * 业主评价
     */
    private String customerEvaluate;

    /**
     * 参考附件
     */
    private String referAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}