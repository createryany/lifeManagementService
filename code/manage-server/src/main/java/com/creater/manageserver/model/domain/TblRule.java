package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 规章制度
 * @TableName tbl_rule
 */
@TableName(value ="tbl_rule")
@Data
public class TblRule implements Serializable {
    /**
     * 自动增长id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 适用范围
     */
    private String useRange;

    /**
     * 分类
     */
    private Long category;

    /**
     * 文号
     */
    private String articleNumber;

    /**
     * 制度等级
     */
    private String level;

    /**
     * 保密等级
     */
    private String secretLevel;

    /**
     * 主题词
     */
    private String titleWord;

    /**
     * 发文单位
     */
    private String publishCompany;

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
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

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

    /**
     * 规章制度附件
     */
    private String ruleAttach;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}