package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 楼盘信息
 * @TableName fc_estate
 */
@TableName(value ="fc_estate")
@Data
public class FcEstate implements Serializable {
    /**
     * 自动编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 房产编码
     */
    private String estateCode;

    /**
     * 房产名称
     */
    private String estateName;

    /**
     * 房产地址
     */
    private String estateAddr;

    /**
     * 占地面积
     */
    private Double coverArea;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 绿地面积
     */
    private Double greenArea;

    /**
     * 道路面积
     */
    private Double roadArea;

    /**
     * 楼宇数量
     */
    private Double buildingNumber;

    /**
     * 负责人
     */
    private String buildingLeader;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 法人代表
     */
    private String companyBehalf;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 联系地址
     */
    private String contactAddr;

    /**
     * 车位滞纳金比率
     */
    private Double carSpaceDelayRate;

    /**
     * 车位超期天数
     */
    private Integer carSpaceOverDay;

    /**
     * 房产类型
     */
    private String estateType;

    /**
     * 路灯数量
     */
    private Integer streetLampNumber;

    /**
     * 化粪池数量
     */
    private Integer hfcnum;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}