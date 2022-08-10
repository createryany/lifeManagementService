package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 员工通讯录类别
 * @TableName tbl_employee_contact_category
 */
@TableName(value ="tbl_employee_contact_category")
@Data
public class TblEmployeeContactCategory implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 排序号
     */
    private Long orderId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 上级类别id
     */
    private String parentCategoryId;

    /**
     * 标记线
     */
    private String line;

    /**
     * 创建人id
     */
    private String createPersonId;

    /**
     * 创建人名称
     */
    private String createPerson;

    /**
     * 权限字符串
     */
    private String privileges;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}