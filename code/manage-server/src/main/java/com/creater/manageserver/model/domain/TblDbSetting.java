package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 数据库设置
 * @TableName tbl_db_setting
 */
@TableName(value ="tbl_db_setting")
@Data
public class TblDbSetting implements Serializable {
    /**
     * 连接地址
     */
    private String dbUrl;

    /**
     * 用户名
     */
    private String dbUsername;

    /**
     * 密码
     */
    private String dbPwd;

    /**
     * 数据库名
     */
    private String dbLibName;

    /**
     * 存放路径
     */
    private String savePath;

    /**
     * 存放名称
     */
    private String saveName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}