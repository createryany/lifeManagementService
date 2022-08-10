package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 楼宇信息表
 * @TableName fc_building
 */
@TableName(value ="fc_building")
@Data
public class FcBuilding implements Serializable {
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
     * 楼宇编码
     */
    private String buildingCode;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 楼宇功能
     */
    private String buildingFunction;

    /**
     * 使用面积
     */
    private Double usedArea;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 建设许可证号
     */
    private String buildPermissionId;

    /**
     * 销售许可证号
     */
    private String salePermissionId;

    /**
     * 竣工日期
     */
    private Date finishDate;

    /**
     * 封顶日期
     */
    private Date overRoofDate;

    /**
     * 装修
     */
    private String decorate;

    /**
     * 结构类别
     */
    private String structType;

    /**
     * 完损等级
     */
    private String damageGrade;

    /**
     * 单元数量
     */
    private Double unitCount;

    /**
     * 楼宇类型
     */
    private String buildingType;

    /**
     * 清扫层数
     */
    private Integer cleanFloor;

    /**
     * 拖洗层数
     */
    private Integer mopFloor;

    /**
     * 楼狼通道地面
     */
    private Double channelArea;

    /**
     * 电梯轿箱
     */
    private Integer elevator;

    /**
     * 通道门
     */
    private Integer channelDoor;

    /**
     * 电梯门
     */
    private Integer evevatorDoor;

    /**
     * 水井门
     */
    private Integer waterWellDoor;

    /**
     * 电井门
     */
    private Integer electricWellDoor;

    /**
     * 百叶窗
     */
    private Integer windowShades;

    /**
     * 消防栓
     */
    private Integer hydrant;

    /**
     * 整容镜
     */
    private Integer mirrors;

    /**
     * 单元门
     */
    private Integer unitDoor;

    /**
     * 硬化地面
     */
    private Double hardenGroundArea;

    /**
     * 提纯绿地
     */
    private Double greenArea;

    /**
     * 不提纯绿地
     */
    private Double noGreenArea;

    /**
     * 人工水面
     */
    private Double waterByPerson;

    /**
     * 是否使用电梯
     */
    private String isElevator;

    /**
     * 是否需要二次水电
     */
    private String isSecondWaterElectric;

    /**
     * 随机标识码
     */
    private String randomIdentify;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}