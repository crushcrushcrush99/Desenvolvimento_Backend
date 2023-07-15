package br.com.aula4.controller;

import br.com.aula4.model.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videogame")
public class VideoGameController {

    @Autowired
    private VideoGame videoGame;
}
