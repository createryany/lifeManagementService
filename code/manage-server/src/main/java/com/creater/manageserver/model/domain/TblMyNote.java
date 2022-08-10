package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 我的记事本
 * @TableName tbl_my_note
 */
@TableName(value ="tbl_my_note")
@Data
public class TblMyNote implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人员编码
     */
    private String createPersonId;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private String type;

    /**
     * 地点
     */
    private String place;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否私人性质
     */
    private Integer isPrivate;

    /**
     * 是否重复
     */
    private Integer isRepeat;

    /**
     * 重复
     */
    private String repeat;

    /**
     * 重复至日结束
     */
    private Date repeatStop;

    /**
     * 是否提醒
     */
    private Integer isRemain;

    /**
     * 提前N天提醒
     */
    private Integer remainDay;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date stopDate;

    /**
     * 预约人员
     */
    private String orderPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}