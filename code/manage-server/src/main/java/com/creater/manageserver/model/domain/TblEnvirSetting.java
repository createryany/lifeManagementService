package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 环境配置
 * @TableName tbl_envir_setting
 */
@TableName(value ="tbl_envir_setting")
@Data
public class TblEnvirSetting implements Serializable {
    /**
     * 序号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * logo图片名称
     */
    private String logoName;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 版本号
     */
    private String version;

    /**
     * 当前版本标识
     */
    private String currentVersion;

    /**
     * 类型
     */
    private String type;

    /**
     * 是否主系统
     */
    private String isMain;

    /**
     * 自定义文本一
     */
    private String customTextOne;

    /**
     * 自定义文本二
     */
    private String customTextTwo;

    /**
     * 自定义文本三
     */
    private String customTextThree;

    /**
     * 自定义文本四
     */
    private String customTextFour;

    /**
     * 设置时间
     */
    private Date setTime;

    /**
     * 产品代码
     */
    private String productId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}