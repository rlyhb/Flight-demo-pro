package com.rlyhb.service.impl;

import com.rlyhb.dao.FlightDao;
import com.rlyhb.pojo.Flight;
import com.rlyhb.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightDao flightDao;
    @Override
    public List<Flight> selectAllFlight() {
        return flightDao.selectAllFlight();
    }

    @Override
    public List<Flight> mainSelect(Flight flight) {
        return flightDao.mainSelect(flight);
    }

    @Override
    public boolean addFlight(Flight flight) {
        return flightDao.addFlight(flight)>0;//影响行数大于0就是成功
    }

    @Override
    public boolean deleteByFid(String fid) {
        return flightDao.deleteByFid(fid)>0;
    }

    @Override
    public Flight selectByFid(String fid) {
        return flightDao.selectByFid(fid);
    }

    @Override
    public boolean updateFlight(Flight flight) {
        return flightDao.updateFlight(flight)>0;
    }

    @Override
    public List<Flight> mySelect(Integer pid) {
        return flightDao.mySelect(pid);
    }
}
