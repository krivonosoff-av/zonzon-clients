package ru.kav.zonzon.client.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kav.zonzon.client.domain.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
