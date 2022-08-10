package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 公表信息
 * @TableName fy_public_box
 */
@TableName(value ="fy_public_box")
@Data
public class FyPublicBox implements Serializable {
    /**
     * 公表编号
     */
    private String publicBoxId;

    /**
     * 所属费项
     */
    private Integer moneyId;

    /**
     * 公表读数
     */
    private Double publicBoxReadNumber;

    /**
     * 分摊方法
     */
    private String shareMethod;

    /**
     * 公表状态
     */
    private String publicBoxState;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}