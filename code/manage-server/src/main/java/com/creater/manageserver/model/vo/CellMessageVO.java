package com.creater.manageserver.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: createryan
 * @date 2022/8/13 21:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CellMessageVO implements Serializable {

    private static final long serialVersionUID = 8906574929286341026L;

    /**
     * 房产编号
     */
    private String estateCode;

    /**
     * 楼宇编号
     */
    private String unitCode;

    /**
     * 开始楼层
     */
    private Integer startFloor;

    /**
     * 结束楼层
     */
    private Integer stopFloor;

    /**
     * 开始房间号
     */
    private Integer startCellId;

    /**
     * 结束房间号
     */
    private Integer stopCellId;
}
