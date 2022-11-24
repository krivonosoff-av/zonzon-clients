package ru.kav.zonzon.client.domain.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import ru.kav.zonzon.client.domain.model.Client;

@Tag("repository-test")
@ActiveProfiles("test")
@DataJpaTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void saveClientWillSuccess() {
        clientRepository.save(Client.builder().firstName("Andrei").lastName("Krivonosov").build());
        Assertions.assertEquals(1, clientRepository.count());
    }

}
