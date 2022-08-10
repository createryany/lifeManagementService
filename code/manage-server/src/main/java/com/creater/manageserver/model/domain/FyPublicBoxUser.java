package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 公表关联用户
 * @TableName fy_public_box_user
 */
@TableName(value ="fy_public_box_user")
@Data
public class FyPublicBoxUser implements Serializable {
    /**
     * 自动增长id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 表号
     */
    private String publicBoxId;

    /**
     * 房间号
     */
    private Integer cellId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}