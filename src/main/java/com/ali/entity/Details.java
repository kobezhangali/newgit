package com.ali.entity;

import java.io.Serializable;

/**
 * (Details)实体类
 *
 * @author makejava
 * @since 2020-10-21 20:45:36
 */
public class Details implements Serializable {
    private static final long serialVersionUID = -97009210991024965L;

    private String did;

    private Integer count;

    private String pid;

    private String oid;


    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

}