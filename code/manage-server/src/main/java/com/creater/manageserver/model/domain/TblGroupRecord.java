package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 群组档案
 * @TableName tbl_group_record
 */
@TableName(value ="tbl_group_record")
@Data
public class TblGroupRecord implements Serializable {
    /**
     * 自动增长id
     */
    private Integer groupRecordId;

    /**
     * 群组名称
     */
    private String groupName;

    /**
     * 群组类型
     */
    private String groupType;

    /**
     * 群组说明
     */
    private String groupDesc;

    /**
     * 组内成员id
     */
    private String groupMemberId;

    /**
     * 组内成员名称
     */
    private String groupMemberName;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}