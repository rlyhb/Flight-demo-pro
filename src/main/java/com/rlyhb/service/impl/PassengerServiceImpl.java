package com.rlyhb.service.impl;

import com.rlyhb.dao.PassengerDao;
import com.rlyhb.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerDao passengerDao;
    @Override
    public String selectPnameByPid(Integer pid) {
        return passengerDao.selectPnameByPid(pid);
    }
}
