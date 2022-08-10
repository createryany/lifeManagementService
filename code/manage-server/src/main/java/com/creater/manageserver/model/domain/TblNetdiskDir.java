package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 网络硬盘_文件夹
 * @TableName tbl_netdisk_dir
 */
@TableName(value ="tbl_netdisk_dir")
@Data
public class TblNetdiskDir implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文件夹名称
     */
    private String name;

    /**
     * 上级文件夹
     */
    private Integer parentDir;

    /**
     * 是否共享
     */
    private String isShare;

    /**
     * 创建用户编码
     */
    private String userId;

    /**
     * 创建日期
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}