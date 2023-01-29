package com.rlyhb.pojo;

public class FP {//乘客航班关系
    private Integer pid;
    private String fid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "FP{" +
                "pid=" + pid +
                ", fid='" + fid + '\'' +
                '}';
    }
}
