package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 分组待办事项
 * @TableName tbl_groups_todo
 */
@TableName(value ="tbl_groups_todo")
@Data
public class TblGroupsTodo implements Serializable {
    /**
     * 分组id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 待办事项id
     */
    private String todoId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}