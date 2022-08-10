package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 绿化设置
 * @TableName wy_green_setting
 */
@TableName(value ="wy_green_setting")
@Data
public class WyGreenSetting implements Serializable {
    /**
     * 设置编码
     */
    private String settingCode;

    /**
     * 设置名称
     */
    private String settingName;

    /**
     * 面积
     */
    private Double area;

    /**
     * 绿化时间
     */
    private Date greenDate;

    /**
     * 地点
     */
    private String greenPlace;

    /**
     * 责任人
     */
    private String leader;

    /**
     * 主要植被
     */
    private String mainVegetation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}