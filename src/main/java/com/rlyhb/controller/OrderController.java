package com.rlyhb.controller;

import com.rlyhb.pojo.FP;
import com.rlyhb.pojo.Flight;
import com.rlyhb.service.FPService;
import com.rlyhb.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    FPService fpService;
    @Autowired
    FlightService flightService;
    @PutMapping
    public Result deleteOrder(@RequestBody FP fp){
        boolean flag = fpService.deleteOrder(fp);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/{pid}")
    public Result MyOrderSelect(@PathVariable Integer pid){
        List<Flight> flights = flightService.mySelect(pid);
        Integer code=flights!=null?Code.GET_OK:Code.GET_ERR;//不是空就是成功的状态码，反之失败
        String msg=flights!=null?"":"数据查询失败请重试";//返回消息，如果不是空就无消息，反之有提示
        return new Result(code,flights,msg);
    }
    @PostMapping
    public Result buyFlight(@RequestBody FP fp){//购买航班
        boolean flag = fpService.add(fp);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
}
