package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 桌面
 * @TableName tbl_desktop
 */
@TableName(value ="tbl_desktop")
@Data
public class TblDesktop implements Serializable {
    /**
     * 编码
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 更多地址
     */
    private String morePath;

    /**
     * 权限
     */
    private String privileges;

    /**
     * 状态
     */
    private String status;

    /**
     * 所属产品
     */
    private String belongProduct;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}