package com.rlyhb.controller;

import com.rlyhb.pojo.FP;
import com.rlyhb.pojo.Flight;
import com.rlyhb.service.FPService;
import com.rlyhb.service.FlightService;
import com.rlyhb.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    FlightService flightService;
    @Autowired
    PassengerService passengerService;
    @Autowired
    FPService fpService;
    @GetMapping("/{pid}")
    public Result selectName(@PathVariable Integer pid){
        String pname = passengerService.selectPnameByPid(pid);
        Integer code=pname!=null?Code.GET_OK:Code.GET_ERR;//不是空就是成功的状态码，反之失败
        String msg=pname!=null?"":"数据查询失败请重试";//返回消息，如果不是空就无消息，反之有提示
        return new Result(code,pname,msg);
    }
    @PostMapping
    public Result userSelectFlight(@RequestBody Flight flight){
        List<Flight> flights = flightService.mainSelect(flight);
        for(int i=0;i<flights.size();i++){
            Flight f=flights.get(i);
            float count=fpService.selectCountByFid(f.getFid());
            f.setFsr((count/f.getSeatCount())*100);//设置满足率
        }
        Integer code=flights!=null?Code.GET_OK:Code.GET_ERR;//不是空就是成功的状态码，反之失败
        String msg=flights!=null?"":"数据查询失败请重试";//返回消息，如果不是空就无消息，反之有提示
        return new Result(code,flights,msg);
    }
}
