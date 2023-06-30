package com.example.biblioteca.controller;


import com.example.biblioteca.model.Libro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private List<Libro> libros = new ArrayList<>();

    public LibroController(){
        libros.add(new Libro(1, "El Hobbit"));
        libros.add(new Libro(2, "Saga de los Confines- Los días del Venado"));
        libros.add(new Libro(3, "Cell"));
        libros.add(new Libro(4, "Maleficio"));
        libros.add(new Libro(5,"El fantasma de Canterville"));
        libros.add(new Libro(6, "The Call of Cthulhu"));
        libros.add(new Libro(7, "El libro gordo de Petete"));
        libros.add(new Libro(8, "Harry Potter y la cámara secreta"));
        libros.add(new Libro(9,"Protocolo Bluehand: Alienígenas"));

    }

    @GetMapping
    public List <Libro> getAll(){
        return libros;
    }

    @GetMapping("/{id}")
    public Libro getById(@PathVariable int id){
        for(Libro libro : libros){
            if(libro.getId() == id){
                return libro;
            }
        }
       return null;
    }

    @GetMapping("/libro")
    public Libro getByNombre(@RequestHeader String nombre){
        for(Libro libro : libros){
            if(libro.getNombre().equalsIgnoreCase(nombre)){
                return libro;
            }
        }
        return null;
    }
   /* @GetMapping("/libro")
    public Libro getByNombreParam(@RequestParam(name = "nombre") String nombre){
        for(Libro libro : libros){
            if(libro.getNombre().equalsIgnoreCase(nombre)){
                return libro;
            }
        }
        return null;
    }*/


    @PostMapping
    public String guardar(@RequestBody Libro libro){
        for(Libro libroActual : libros){
            if(libroActual.getId() == libro.getId()){
                return "El libro ya existe en la lista";
            }
        }
        libros.add(libro);
        return "Libro " + libro.getNombre() + " fue incluido en la colección";
    }

    @PutMapping
    public String actualizar(@RequestBody Libro libro){
        for(Libro libroDeLista : libros){
            if(libroDeLista.getId() == libro.getId()){
                libroDeLista.setNombre(libro.getNombre());
                return "El libro de id: " + libro.getId() + " tuvo una alteración en el nombre";
            }
        }
        return "El libro informado no existe";
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id){
        for(Libro libro : libros){
            if(libro.getId() == id){
                String mensaje = "El libro " + libro.getNombre() + " fue removido con éxito!";
                libros.remove(libro);
                return mensaje;
            }
        }
        return null;
    }
}
