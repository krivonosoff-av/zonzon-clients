package ru.kav.zonzon.client.domain.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTS")
public class Client extends AbstractPersistable<Long> {

    @NotEmpty
    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;
}
