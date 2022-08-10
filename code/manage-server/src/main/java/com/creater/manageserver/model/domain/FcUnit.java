package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 单元信息表
 * @TableName fc_unit
 */
@TableName(value ="fc_unit")
@Data
public class FcUnit implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 楼宇编号
     */
    private String buildingCode;

    /**
     * 单元编码
     */
    private String unitCode;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 开始楼层
     */
    private Integer startFloor;

    /**
     * 结束楼层
     */
    private Integer stopFloor;

    /**
     * 开始房号
     */
    private Integer startCellId;

    /**
     * 结束房号
     */
    private Integer stopCellId;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}