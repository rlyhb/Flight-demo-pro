package com.rlyhb.pojo;

public class Passenger {
    private Integer pid;//身份证号
    private String pName;//姓名

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                '}';
    }
}
