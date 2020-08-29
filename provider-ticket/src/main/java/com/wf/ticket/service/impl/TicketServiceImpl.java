package com.wf.ticket.service.impl;

import com.wf.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author wf
 * @create 2020-08-29 15:20
 * @desc
 **/
@Service
@DubboService(version = "V1.0.1", interfaceClass = TicketService.class)
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<<历史直接>>";
    }
}
