package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 附件
 * @TableName tbl_attupload
 */
@TableName(value ="tbl_attupload")
@Data
public class TblAttupload implements Serializable {
    /**
     * 附件id
     */
    @TableId(type = IdType.AUTO)
    private Integer attid;

    /**
     * 附件名称
     */
    private String attname;

    /**
     * 附件新名称
     */
    private String attnewname;

    /**
     * 唯一key
     */
    private String attkey;

    /**
     * 附件分类
     */
    private String attclass;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}