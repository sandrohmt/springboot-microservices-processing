package meu.curso.microservicos.springboot_microservices_processing.consumer;

import meu.curso.microservicos.springboot_microservices_processing.dto.RequestDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessingConsumer {

    @RabbitListener(queues = "${broker.queue.processing.name}")
    public void listenerProcessingQueue(RequestDTO requestDTO) {
        System.out.println(requestDTO.getDescription());
    }
}
