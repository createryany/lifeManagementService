package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主请修
 * @TableName zh_customer_ask_fix
 */
@TableName(value ="zh_customer_ask_fix")
@Data
public class ZhCustomerAskFix implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编码
     */
    private String cellId;

    /**
     * 申请人
     */
    private String proposer;

    /**
     * 申请时间
     */
    private Date proposerDate;

    /**
     * 请修内容
     */
    private String askFixContent;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 修理费用
     */
    private Double fixMoney;

    /**
     * 审批日期
     */
    private Date checkDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 负责人电话
     */
    private String leaderPhone;

    /**
     * 施工单位
     */
    private String executeCompany;

    /**
     * 施工开始日期
     */
    private Date executeStartDate;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 验收人
     */
    private String checkedPerson;

    /**
     * 施工结束日期
     */
    private Date executeStopDate;

    /**
     * 验收日期
     */
    private Date checkedDate;

    /**
     * 验收意见
     */
    private String checkedAdvice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private String status;

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
     * 确认人
     */
    private String confirmPerson;

    /**
     * 确认时间
     */
    private Date confirmDate;

    /**
     * 验收附件
     */
    private String checkedAttach;

    /**
     * 参考附件
     */
    private String referAttach;

    /**
     * 联系电话
     */
    private String phoneNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}