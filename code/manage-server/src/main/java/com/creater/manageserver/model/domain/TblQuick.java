package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 快捷方式
 * @TableName tbl_quick
 */
@TableName(value ="tbl_quick")
@Data
public class TblQuick implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 快捷方式名称
     */
    private String quickName;

    /**
     * 链接参数
     */
    private String urlParam;

    /**
     * 程序路径
     */
    private String codePath;

    /**
     * 图标名称
     */
    private String iconName;

    /**
     * 机器名
     */
    private String mechineName;

    /**
     * 公共类型
     */
    private String publicType;

    /**
     * 类别
     */
    private String type;

    /**
     * 创建人
     */
    private String inputRecordPerson;

    /**
     * 创建时间
     */
    private Date inputRecordDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}