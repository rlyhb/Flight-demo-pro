package com.rlyhb.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PassengerService {
    String selectPnameByPid(Integer pid);
}
