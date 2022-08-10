package com.mashibing.bean;

import java.io.Serializable;

/**
 * <p>
 * 用户部门表
 * </p>
 *
 * @author createryan
 * @since 2022-08-11
 */
public class TblUserDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 部门编号
     */
    private Integer deptId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "TblUserDept{" +
        "userId=" + userId +
        ", deptId=" + deptId +
        "}";
    }
}
