package com.rlyhb;

import com.rlyhb.service.FlightService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlightDemoProApplicationTests {
    @Autowired
    FlightService flightService;
    @Test
    void contextLoads() {
        System.out.println(flightService.selectAllFlight());
    }

}
