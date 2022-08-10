package com.mashibing.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 附件
 * </p>
 *
 * @author createryan
 * @since 2022-08-11
 */
public class TblAttupload implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 附件id
     */
    @TableId(value = "attID", type = IdType.AUTO)
    private Integer attid;

    /**
     * 附件名称
     */
    @TableField("attName")
    private String attname;

    /**
     * 附件新名称
     */
    @TableField("attNewName")
    private String attnewname;

    /**
     * 唯一key
     */
    @TableField("attKey")
    private String attkey;

    /**
     * 附件分类
     */
    @TableField("attClass")
    private String attclass;


    public Integer getAttid() {
        return attid;
    }

    public void setAttid(Integer attid) {
        this.attid = attid;
    }

    public String getAttname() {
        return attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public String getAttnewname() {
        return attnewname;
    }

    public void setAttnewname(String attnewname) {
        this.attnewname = attnewname;
    }

    public String getAttkey() {
        return attkey;
    }

    public void setAttkey(String attkey) {
        this.attkey = attkey;
    }

    public String getAttclass() {
        return attclass;
    }

    public void setAttclass(String attclass) {
        this.attclass = attclass;
    }

    @Override
    public String toString() {
        return "TblAttupload{" +
        "attid=" + attid +
        ", attname=" + attname +
        ", attnewname=" + attnewname +
        ", attkey=" + attkey +
        ", attclass=" + attclass +
        "}";
    }
}
