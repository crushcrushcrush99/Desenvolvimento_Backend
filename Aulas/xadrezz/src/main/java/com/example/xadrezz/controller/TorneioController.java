package com.example.xadrezz.controller;

import com.example.xadrezz.model.Torneio;
import com.example.xadrezz.service.TorneioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {

    @Autowired
    private TorneioService torneioService;

    @GetMapping
    public List<Torneio> getAll(){
        return torneioService.getAll();
    }
    @GetMapping("/{id}")
    public Torneio getById(@PathVariable int id){
        return torneioService.getById(id);
    }
    @PostMapping
    public boolean save(@RequestBody Torneio torneio){
        return torneioService.save(torneio);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return torneioService.delete(id);
    }
}
