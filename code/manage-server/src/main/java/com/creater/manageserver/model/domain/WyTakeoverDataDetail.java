package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物业接管资料明细
 * @TableName wy_takeover_data_detail
 */
@TableName(value ="wy_takeover_data_detail")
@Data
public class WyTakeoverDataDetail implements Serializable {
    /**
     * 接管资料id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属接管id
     */
    private Integer takeoverId;

    /**
     * 资料名称
     */
    private String dataName;

    /**
     * 资料份数
     */
    private Integer dataCopies;

    /**
     * 资料页数
     */
    private Integer dataPages;

    /**
     * 资料分类
     */
    private Long dataType;

    /**
     * 档案号
     */
    private String fileNumber;

    /**
     * 交出人
     */
    private String handoverPerson;

    /**
     * 接收人
     */
    private String receivePerson;

    /**
     * 接受日期
     */
    private Date receiveDate;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}