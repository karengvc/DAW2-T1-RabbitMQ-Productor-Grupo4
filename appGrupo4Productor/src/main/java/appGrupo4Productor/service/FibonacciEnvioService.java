package appGrupo4Productor.service;


import appGrupo4Productor.rabbitmq.FibonacciProductor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FibonacciEnvioService {
    private final FibonacciProductor fibonacciProductor;

    public void enviarNumeros(String numeros) {
        fibonacciProductor.enviarNumerosARabbitMQ(numeros);
    }
}
