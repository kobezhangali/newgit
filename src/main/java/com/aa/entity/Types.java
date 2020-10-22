package com.aa.entity;

import java.io.Serializable;

/**
 * (Types)实体类
 *
 * @author makejava
 * @since 2020-10-21 20:45:39
 */
public class Types implements Serializable {
    private static final long serialVersionUID = 136428074863094360L;

    private String tid;

    private String tname;

    private String tdesc;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTdesc() {
        return tdesc;
    }

    public void setTdesc(String tdesc) {
        this.tdesc = tdesc;
    }

}