package com.programando.ejercicio1.controller;

import com.programando.ejercicio1.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class ProductoController {
    private List<Producto> productos = new ArrayList<>();

    public ProductoController() {
        productos.add(new Producto(554875, "milanesas de soja", 300));
        productos.add(new Producto(354785, "arvejas frescas", 125));
        productos.add(new Producto(896644, "hamburguesas de arroz yamani", 500));
    }

    @GetMapping("/productos")
    public List<Producto> getAll(){
        return productos;
    }
    @GetMapping("/productos/{codigoDeBarras}")
    public Producto getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        for(Producto producto : productos){
            if(producto.getCodigoDeBarras() == codigoDeBarras){
                return producto;
            }
        }
        return null;
    }

    @PostMapping("/productos")
    public String save(@RequestBody Producto producto){
        for (Producto item : productos){
            if (item.getCodigoDeBarras() == producto.getCodigoDeBarras()){
                return "Producto ya existente";
            }
        }
        this.productos.add(producto);
        return "Producto " + producto.getNombre() + " fue agregado al stock!";
    }
}

