package com.creater.manageserver.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 功能模块
 * @TableName tbl_function_model
 */
@TableName(value ="tbl_function_model")
@Data
public class TblFunctionModel implements Serializable {
    /**
     * 模块编码
     */
    @TableId
    private Integer id;

    /**
     * 模块名称
     */
    private String modelName;

    /**
     * 模块类型
     */
    private String modelType;

    /**
     * 上级模块编码
     */
    private Long modelParent;

    /**
     * 状态
     */
    private String modelStatus;

    /**
     * 文件路径
     */
    private String modelUrl;

    /**
     * 分析参考
     */
    private String modelAnalyseRef;

    /**
     * 报表分析
     */
    private Integer modelReportAnalyse;

    /**
     * 图标名称
     */
    private String modelIcon;

    /**
     * 模块性质
     */
    private String modelProperty;

    /**
     * 模块描述
     */
    private String modelDesc;

    /**
     * 是否控制操作权限
     */
    private String isControl;

    /**
     * 全部
     */
    private String mFull;

    /**
     * 新增
     */
    private String mAdd;

    /**
     * 修改
     */
    private String mMod;

    /**
     * 删除
     */
    private String mDel;

    /**
     * 导出
     */
    private String mExp;

    /**
     * 审批
     */
    private String mAud;

    /**
     * 执行
     */
    private String mExe;

    /**
     * 查询
     */
    private String mQue;

    /**
     * 个人
     */
    private String dPerson;

    /**
     * 部门
     */
    private String dDept;

    /**
     * 公司
     */
    private String dCompany;

    /**
     * 排序字段
     */
    private Double orderid;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private Date createDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}