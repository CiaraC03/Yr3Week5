package ie.atu.yr3week5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class Yr3Week5Application {

    public static void main(String[] args) {
        SpringApplication.run(Yr3Week5Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
