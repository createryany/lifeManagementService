package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼盘经费支出项目
 * @TableName wy_estate_out_project
 */
@TableName(value ="wy_estate_out_project")
@Data
public class WyEstateOutProject implements Serializable {
    /**
     * 项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 上级支出项目id
     */
    private Integer parentOutProjectId;

    /**
     * 所属主项目
     */
    private String belongMainProjecct;

    /**
     * 说明
     */
    private String desc;

    /**
     * 建档人
     */
    private String createPerson;

    /**
     * 建档时间
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