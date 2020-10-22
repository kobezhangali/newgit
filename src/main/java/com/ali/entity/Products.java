package com.ali.entity;

import java.io.Serializable;

/**
 * (Products)实体类
 *
 * @author makejava
 * @since 2020-10-21 20:45:38
 */
public class Products implements Serializable {
    private static final long serialVersionUID = -87172165221131284L;

    private String pid;

    private String pname;

    private String pimage;

    private Object price;

    private String tid;


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

}