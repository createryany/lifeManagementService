package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 图纸管理
 * @TableName wy_picture_manage
 */
@TableName(value ="wy_picture_manage")
@Data
public class WyPictureManage implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 图纸名称
     */
    private String pictureName;

    /**
     * 图纸类型
     */
    private Long pictureType;

    /**
     * 说明
     */
    private String desc;

    /**
     * 图纸附件
     */
    private String pictureAttach;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 上传人
     */
    private String uploadPerson;

    /**
     * 上传时间
     */
    private Date uploadDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private Date updateDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}