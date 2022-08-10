package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 我的驾驶舱
 * @TableName tbl_mydash
 */
@TableName(value ="tbl_mydash")
@Data
public class TblMydash implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属驾驶舱id
     */
    private Integer dashId;

    /**
     * 排序号
     */
    private Long orderId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 显示条数
     */
    private String showNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}