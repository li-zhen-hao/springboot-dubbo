package com.atguigu.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author li
 * 2019/2/5 15:47
 * version 1.0
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;
    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了:"+ticket);
    }
}
