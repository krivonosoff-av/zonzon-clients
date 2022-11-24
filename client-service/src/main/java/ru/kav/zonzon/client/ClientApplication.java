package ru.kav.zonzon.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.kav.zonzon.client.domain.model.Client;
import ru.kav.zonzon.client.domain.repository.ClientRepository;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    @Profile("dev")
    static class DataGenerator implements CommandLineRunner {

        private final ClientRepository clientRepository;

        @Override
        public void run(String... args) throws Exception {
            clientRepository.saveAll(List.of(Client.builder().firstName("Andrei").lastName("Krivonosov").build()));
        }
    }
}
