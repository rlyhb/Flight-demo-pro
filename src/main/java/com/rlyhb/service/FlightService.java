package com.rlyhb.service;

import com.rlyhb.pojo.Flight;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface FlightService {
    List<Flight> selectAllFlight();
    List<Flight> mainSelect(Flight flight);
    boolean addFlight(Flight flight);
    boolean deleteByFid(String fid);
    Flight selectByFid(String fid);
    boolean updateFlight(Flight flight);
    List<Flight> mySelect(Integer pid);
}
