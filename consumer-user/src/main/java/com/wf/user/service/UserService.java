package com.wf.user.service;

import com.wf.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author wf
 * @create 2020-08-29 15:24
 * @desc
 **/
@Service
public class UserService {

    @DubboReference(version = "V1.0.1")
    private TicketService ticketService;

    public void hello() {
        System.out.println("调用成功了--" + ticketService.getTicket());
    }
}
