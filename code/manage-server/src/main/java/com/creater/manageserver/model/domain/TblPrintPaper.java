package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 打印纸张宽度设置
 * @TableName tbl_print_paper
 */
@TableName(value ="tbl_print_paper")
@Data
public class TblPrintPaper implements Serializable {
    /**
     * 编码
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String paperName;

    /**
     * 值
     */
    private String paperValue;

    /**
     * 状态
     */
    private Integer paperStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}