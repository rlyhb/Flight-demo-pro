package com.rlyhb.dao;

import org.apache.ibatis.annotations.*;
import com.rlyhb.pojo.Flight;

import java.util.List;

@Mapper
public interface FlightDao {
    /**
     * 查询所有航班信息，管理员用
     * @return
     */
    @Select("select * from flight")
    List<Flight> selectAllFlight();

    /**
     * 主查询方法，用户输入出发地，目的地，出发日期来查询航班
     * @param flight
     * @return
     */
    @Select("select * from flight where origin=#{origin} and destination=#{destination} and bDate=#{bDate}")
    List<Flight> mainSelect(Flight flight);

    /**
     * 添加航班
     * @param flight
     */
    @Insert("insert into flight VALUES (#{fid},#{origin},#{destination},#{bDate},#{bTime},#{seatCount},#{price})")
    int addFlight(Flight flight);

    /**
     * 根据航班号删除
     * @param fid
     */
    @Delete("delete from flight where fid=#{fid}")
    int deleteByFid(String fid);

    /**
     * 根据航班号查询航班信息
     * @param fid
     * @return
     */
    @Select("select * from flight where fid=#{fid}")
    Flight selectByFid(String fid);

    /**
     * 修改航班信息
     * @param flight
     * @return
     */
    @Update("update flight set origin=#{origin},destination=#{destination},bDate=#{bDate},btime=#{bTime},seatcount=#{seatCount},price=#{price} where fid=#{fid}")
    int updateFlight(Flight flight);

    /**
     * 我的订单中查询
     * @param pid
     * @return
     */
    @Select("select * from flight,fp where fp.Pid=#{pid} and flight.fid=fp.Fid")
    List<Flight> mySelect(Integer pid);
}
