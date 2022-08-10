package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼盘经费收入项目
 * @TableName wy_estate_income_project
 */
@TableName(value ="wy_estate_income_project")
@Data
public class WyEstateIncomeProject implements Serializable {
    /**
     * 收入项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 收入项目名称
     */
    private String incomeProject;

    /**
     * 上级收入项目id
     */
    private Integer parentIncomeId;

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