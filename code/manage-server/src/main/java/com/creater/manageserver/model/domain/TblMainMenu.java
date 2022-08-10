package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 主菜单
 * @TableName tbl_main_menu
 */
@TableName(value ="tbl_main_menu")
@Data
public class TblMainMenu implements Serializable {
    /**
     * 主菜单编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 主菜单名称
     */
    private String mainMenuName;

    /**
     * 主菜单文件路径
     */
    private String mainMenuUrl;

    /**
     * 主菜单图标
     */
    private String mainMenuIcon;

    /**
     * 主菜单状态
     */
    private String mainMenuStatus;

    /**
     * 菜单key
     */
    private String mainMenuKey;

    /**
     * 排序号
     */
    private Double mainMenuOrder;

    /**
     * 产品id
     */
    private String belongProduct;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}