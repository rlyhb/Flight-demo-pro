package com.rlyhb.controller;

import com.rlyhb.pojo.Flight;
import com.rlyhb.service.FPService;
import com.rlyhb.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    FlightService flightService;
    @Autowired
    FPService fpService;
    @PostMapping
    public Result addFlight(@RequestBody Flight flight){//数据从请求体来
        boolean flag=flightService.addFlight(flight);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @DeleteMapping("/{fid}")
    public Result deleteFlight(@PathVariable String fid){
        boolean flag = flightService.deleteByFid(fid);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @PutMapping
    public Result updateFlight(@RequestBody Flight flight){
        boolean flag = flightService.updateFlight(flight);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @GetMapping
    public Result selectAllFlight(){//查询所有航班
        //调用service查询
        List<Flight> flights = flightService.selectAllFlight();
        for(int i=0;i<flights.size();i++){
            Flight flight=flights.get(i);
            float count=fpService.selectCountByFid(flight.getFid());
            flight.setFsr((count/flight.getSeatCount())*100);//设置满足率
        }
        Integer code=flights!=null?Code.GET_OK:Code.GET_ERR;//不是空就是成功的状态码，反之失败
        String msg=flights!=null?"":"数据查询失败请重试";//返回消息，如果不是空就无消息，反之有提示
        return new Result(code,flights,msg);
    }
    @GetMapping("/{fid}")
    public Result selectByFid(@PathVariable String fid){
        Flight flight = flightService.selectByFid(fid);
        Integer code=flight!=null?Code.GET_OK:Code.GET_ERR;//不是空就是成功的状态码，反之失败
        String msg=flight!=null?"":"数据查询失败请重试";//返回消息，如果不是空就无消息，反之有提示
        return new Result(code,flight,msg);
    }
}