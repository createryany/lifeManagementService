package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 常用短信
 * @TableName tbl_common_message
 */
@TableName(value ="tbl_common_message")
@Data
public class TblCommonMessage implements Serializable {
    /**
     * 短信编码
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 类型
     */
    private Long messageType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}