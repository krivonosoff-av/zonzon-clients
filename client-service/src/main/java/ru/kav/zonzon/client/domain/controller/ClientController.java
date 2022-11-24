package ru.kav.zonzon.client.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kav.zonzon.client.domain.model.Client;
import ru.kav.zonzon.client.domain.repository.ClientRepository;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> clients() {
        return clientRepository.findAll();
    }

    @PostMapping("/clients")
    @ResponseBody
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

}
