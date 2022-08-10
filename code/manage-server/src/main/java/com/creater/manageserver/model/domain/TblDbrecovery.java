package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据库还原
 * @TableName tbl_dbrecovery
 */
@TableName(value ="tbl_dbrecovery")
@Data
public class TblDbrecovery implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 还原数据库名
     */
    private String dbName;

    /**
     * 还原路径
     */
    private String dbUrl;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人姓名
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private Date operateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}