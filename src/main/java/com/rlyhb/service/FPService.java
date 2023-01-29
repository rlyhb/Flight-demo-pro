package com.rlyhb.service;

import com.rlyhb.pojo.FP;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FPService {
    boolean add(FP fp);
    int selectCountByFid(String fid);
    boolean deleteOrder(FP fp);
}
