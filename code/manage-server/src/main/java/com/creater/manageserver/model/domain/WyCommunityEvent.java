package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 社区活动
 * @TableName wy_community_event
 */
@TableName(value ="wy_community_event")
@Data
public class WyCommunityEvent implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 活动日期
     */
    private Date eventDate;

    /**
     * 活动内容
     */
    private String eventContent;

    /**
     * 主持者
     */
    private String hoster;

    /**
     * 参加人员
     */
    private String joinPerson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}