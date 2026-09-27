package appGrupo4Productor.rabbitmq;

import appGrupo4Productor.config.RabbitMqConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class FibonacciProductor {
    private final RabbitTemplate rabbitTemplate;

    public void enviarNumerosARabbitMQ(String numeros) {
        rabbitTemplate.convertAndSend(
                RabbitMqConfig.EXCHANGE,
                RabbitMqConfig.ROUTING_KEY, numeros);
        log.info("Enviando numeros a RabbitMQ: {}", numeros);
    }
}
