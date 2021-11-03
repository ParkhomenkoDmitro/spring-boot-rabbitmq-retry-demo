package com.parkhomenko.springbootrabbitmqretrydemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "javainuse.queue")
    public void recievedMessage(Employee employee) throws InvalidSalaryException {

        log.info("Recieved Message From RabbitMQ: " + employee);

        if (employee.getSalary() < 0) {
            throw new InvalidSalaryException();
        }
    }
}
