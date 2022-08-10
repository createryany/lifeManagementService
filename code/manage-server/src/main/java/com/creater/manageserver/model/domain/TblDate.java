package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 工作日期
 * @TableName tbl_date
 */
@TableName(value ="tbl_date")
@Data
public class TblDate implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 日期
     */
    private Date dt;

    /**
     * 星期
     */
    private Integer weekday;

    /**
     * 是否上班
     */
    private Integer isWork;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}