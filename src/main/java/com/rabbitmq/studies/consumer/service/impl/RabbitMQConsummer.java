package com.rabbitmq.studies.consumer.service.impl;

import com.rabbitmq.studies.consumer.dto.Message;
import com.rabbitmq.studies.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsummer implements ConsumerService {

    @Override
    public void action(Message message) throws Exception {
        System.out.println(message);
//        throw new Exception("Erro planejado para a msg cair na dlq");
    }
}
