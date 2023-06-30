package com.programando.ejercicio1.controller;

import com.programando.ejercicio1.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        return endereco;
    }
}
