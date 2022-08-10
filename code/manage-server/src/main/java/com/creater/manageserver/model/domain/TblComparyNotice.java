package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 企业公告
 * @TableName tbl_compary_notice
 */
@TableName(value ="tbl_compary_notice")
@Data
public class TblComparyNotice implements Serializable {
    /**
     * 自动增长id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 公告主题
     */
    private String noticeTheme;

    /**
     * 公告内容
     */
    private String noticeContent;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date stopDate;

    /**
     * 接受类型
     */
    private String receiveType;

    /**
     * 公告分类
     */
    private Long noticeCategory;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件路径
     */
    private String attachPath;

    /**
     * 状态
     */
    private String status;

    /**
     * 公告类别
     */
    private String noticeType;

    /**
     * 公告附件
     */
    private String noticeAttach;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private Date inputDate;

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
     * 允许查看的用户编码
     */
    private String allowUserCode;

    /**
     * 允许查看的用户名称
     */
    private String allowUserName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}