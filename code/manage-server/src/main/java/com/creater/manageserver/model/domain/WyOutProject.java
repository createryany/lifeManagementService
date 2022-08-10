package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支出项目
 * @TableName wy_out_project
 */
@TableName(value ="wy_out_project")
@Data
public class WyOutProject implements Serializable {
    /**
     * 支出项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 支出项目名称
     */
    private String outProjectName;

    /**
     * 上级支出项目id
     */
    private Integer parentOutProjectId;

    /**
     * 说明
     */
    private String desc;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

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