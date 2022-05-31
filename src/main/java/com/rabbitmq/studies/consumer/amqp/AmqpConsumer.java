package com.rabbitmq.studies.consumer.amqp;

public interface AmqpConsumer<T> {

    void consume(T t) throws Exception;
}
