package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 房间加建信息
 * @TableName fc_cell_addbuild
 */
@TableName(value ="fc_cell_addbuild")
@Data
public class FcCellAddbuild implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属房间id
     */
    private Integer cellId;

    /**
     * 加建面积
     */
    private Double addbuildArea;

    /**
     * 加建时间
     */
    private Date addbuildTime;

    /**
     * 加建状态
     */
    private String addbuildState;

    /**
     * 加建说明
     */
    private String addbuildDesc;

    /**
     * 加建附件
     */
    private String addbuildAccessory;

    /**
     * 操作人
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private Date operateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}