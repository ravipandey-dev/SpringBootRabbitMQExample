package com.rabbitmq.controller;

import com.rabbitmq.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1")
public class RabbitController {

    @Autowired
    RabbitMQSender sender;

    @GetMapping(value="/send")
    public String producer()
    {
        sender.send();
        return "message was sent succesfully to queue";
    }
}
