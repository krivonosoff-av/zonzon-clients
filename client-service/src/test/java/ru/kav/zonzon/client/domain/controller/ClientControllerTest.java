package ru.kav.zonzon.client.domain.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import ru.kav.zonzon.client.domain.model.Client;

import java.net.URI;
import java.util.List;
import java.util.function.Supplier;

@ActiveProfiles("dev")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ClientControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private final Supplier<URI> uri = () -> URI.create("http://localhost:" + port + "/api/clients");

    @BeforeEach


    @Test
    public void createClientWillSuccess() {
        Client client = restTemplate.postForObject(uri.get(), Client.builder().firstName("Vasia").lastName("Kuropatkin").build(), Client.class);
        Assertions.assertNotNull(client);
    }

    @Test
    public void getClientsWillSuccess() {
        Client[] clients = restTemplate.getForObject(uri.get(), Client[].class);
        Assertions.assertTrue(clients.length > 0);
    }


}
