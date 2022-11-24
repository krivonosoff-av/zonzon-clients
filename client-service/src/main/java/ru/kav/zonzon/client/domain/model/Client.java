package ru.kav.zonzon.client.domain.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client extends AbstractPersistable<Long> {

    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;
}
