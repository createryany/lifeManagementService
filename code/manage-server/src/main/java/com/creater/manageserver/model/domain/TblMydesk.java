package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 我的桌面
 * @TableName tbl_mydesk
 */
@TableName(value ="tbl_mydesk")
@Data
public class TblMydesk implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属模块
     */
    private String belongModel;

    /**
     * 排序号
     */
    private Long orderId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 显示条数
     */
    private String showNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}