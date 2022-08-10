package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 到期日期
 * @TableName tbl_stop_date
 */
@TableName(value ="tbl_stop_date")
@Data
public class TblStopDate implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 天数
     */
    private String days;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}