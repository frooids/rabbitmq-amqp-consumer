package com.rabbitmq.studies.consumer.service;

import com.rabbitmq.studies.consumer.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;
}
