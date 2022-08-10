package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 仪表盘
 * @TableName tbl_dashboard
 */
@TableName(value ="tbl_dashboard")
@Data
public class TblDashboard implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 数据项
     */
    private String dataItem;

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