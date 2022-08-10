package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 快捷方式图标
 * @TableName tbl_shortcut_icon
 */
@TableName(value ="tbl_shortcut_icon")
@Data
public class TblShortcutIcon implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String iconName;

    /**
     * 图标路径
     */
    private String iconPath;

    /**
     * 状态
     */
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}