package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 视频点播
 * @TableName tbl_vod
 */
@TableName(value ="tbl_vod")
@Data
public class TblVod implements Serializable {
    /**
     * 视频编码
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 来源
     */
    private String videoSource;

    /**
     * 视频类型
     */
    private Long videlType;

    /**
     * 节目名称
     */
    private String programName;

    /**
     * 节目路径
     */
    private String programUrl;

    /**
     * 简介
     */
    private String simpleIntro;

    /**
     * 是否在首页显示
     */
    private String isFirst;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}