package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 网络硬盘路径
 * @TableName tbl_netdisk_url
 */
@TableName(value ="tbl_netdisk_url")
@Data
public class TblNetdiskUrl implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文件夹id
     */
    private Integer dirId;

    /**
     * 文件原名称
     */
    private String fileName;

    /**
     * 新名称
     */
    private String newName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文档大小
     */
    private Integer fileSize;

    /**
     * 上传时间
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}