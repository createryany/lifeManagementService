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
public class UnitMessageVO implements Serializable {

    private static final long serialVersionUID = 6604655393049429186L;

    /**
     * 房产编号
     */
    private String estateCode;

    /**
     * 楼宇编号
     */
    private String buildingCode;

    /**
     * 单元数量
     */
    private Integer unitCount;
}
