package com.rlyhb.controller;

/**
 * 定义状态码
 */
public class Code {//1结尾代表成功，0结尾代表失败
    public static final Integer SAVE_OK=20011;//常量，保存成功的状态码
    public static final Integer DELETE_OK=20021;//删除成功的状态码
    public static final Integer UPDATE_OK=20031;//更新成功的状态码
    public static final Integer GET_OK=20041;//查询成功的状态码
    public static final Integer SAVE_ERR=20010;//常量，保存失败的状态码
    public static final Integer DELETE_ERR=20020;//删除失败的状态码
    public static final Integer UPDATE_ERR=20030;//更新失败的状态码
    public static final Integer GET_ERR=20040;//查询失败的状态码
    public static final Integer SYSTEM_ERR=50001;//系统异常
    public static final Integer SYSTEM_UNKNOW_ERR=59999;//系统位置错误
    public static final Integer BUSINESS_ERR=60002;//业务异常
}
