package com.rlyhb.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PassengerDao {
    @Select("select Pname from Passenger where Pid=#{pid}")
    String selectPnameByPid(Integer pid);
}

