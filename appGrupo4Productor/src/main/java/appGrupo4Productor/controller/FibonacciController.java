package appGrupo4Productor.controller;

import appGrupo4Productor.service.FibonacciEnvioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    private final FibonacciEnvioService fibonacciEnvioService;

    // URL de prueba: localhost:8081/api/fibonacci/send?numbers=1;2;15;8
    @GetMapping("/send")
    public String send(@RequestParam String numbers) {
        fibonacciEnvioService.enviarNumeros(numbers);
        return "Lista enviada a RabbitMQ correctamente";
    }
}