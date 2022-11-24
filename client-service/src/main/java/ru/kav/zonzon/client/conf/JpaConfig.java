package ru.kav.zonzon.client.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@Configuration(proxyBeanMethods = false)
@EnableTransactionManagement
@EnableJpaRepositories("ru.kav.zonzon.client.domain.repository")
public class JpaConfig {
}
