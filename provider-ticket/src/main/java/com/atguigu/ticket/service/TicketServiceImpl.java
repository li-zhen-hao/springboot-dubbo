package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author li
 * 2019/2/5 15:46
 * version 1.0
 */
@Component
@Service //讲服务发布出去
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<厉害了，我的哥！>";
    }
}
