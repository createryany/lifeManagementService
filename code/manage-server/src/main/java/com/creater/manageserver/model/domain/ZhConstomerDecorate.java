package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业主装修
 * @TableName zh_constomer_decorate
 */
@TableName(value ="zh_constomer_decorate")
@Data
public class ZhConstomerDecorate implements Serializable {
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
     * 申请人
     */
    private String proposer;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 申请日期
     */
    private Date proposerDate;

    /**
     * 装修内容
     */
    private String decorateContent;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 装修保证金
     */
    private Double decorateEnsureMoney;

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
     * 施工截止日期
     */
    private Date executeStopDate;

    /**
     * 验收意见
     */
    private String checkedAdvice;

    /**
     * 验收日期
     */
    private Date checkedDate;

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
     * 装修附件
     */
    private String decorateAttach;

    /**
     * 违约金
     */
    private Double againstMoney;

    /**
     * 作废人
     */
    private String invalidPerson;

    /**
     * 作废时间
     */
    private Date invalidDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}