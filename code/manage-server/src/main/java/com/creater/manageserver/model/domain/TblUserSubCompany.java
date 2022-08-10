package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户子公司表
 * @TableName tbl_user_sub_company
 */
@TableName(value ="tbl_user_sub_company")
@Data
public class TblUserSubCompany implements Serializable {
    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 子公司编号
     */
    private Integer companyId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}