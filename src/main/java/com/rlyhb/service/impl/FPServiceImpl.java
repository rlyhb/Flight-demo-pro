package com.rlyhb.service.impl;

import com.rlyhb.dao.FPDao;
import com.rlyhb.pojo.FP;
import com.rlyhb.service.FPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FPServiceImpl implements FPService {
    @Autowired
    FPDao fpDao;
    @Override
    public boolean add(FP fp) {
        return fpDao.add(fp)>0;
    }

    @Override
    public int selectCountByFid(String fid) {
        return fpDao.selectCountByFid(fid);
    }

    @Override
    public boolean deleteOrder(FP fp) {
        return fpDao.deleteOrder(fp)>0;
    }
}
