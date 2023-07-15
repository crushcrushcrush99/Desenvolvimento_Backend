package lista4.ejercicio1.repository;

import lista4.ejercicio1.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDeDados {
    private List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Natura Meu Primeiro Humor Desodorante Colônia", new BigDecimal(78.39)));
        cosmeticos.add(new Cosmetico(2, "INOAR Shampoo Vegano- Oleo de Coco", new BigDecimal(50.99)));
        cosmeticos.add(new Cosmetico(3, "Creme de Tratamento Cabelo SKALA", new BigDecimal(150.25)));
        cosmeticos.add(new Cosmetico(4, "Sabonete Bionatura Eco Nesti Dante", new BigDecimal(38.00)));
        cosmeticos.add(new Cosmetico(5, "Água de Beleza Caudalié", new BigDecimal(219.00)));

    }

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmeticoDoBancoDeDados : cosmeticos){
            if (cosmeticoDoBancoDeDados.getId() == cosmetico.getId()){
                return "impossível cadastrar! cosmético já consta no banco";
            }
        }
        cosmeticos.add(cosmetico);
        return "Cosmético " + cosmetico.getNome() + "cadastrado com sucesso!";
    }

    public String delete(int id){
        for (Cosmetico cosmetico : cosmeticos){
            if (cosmetico.getId() == id){
                String mensagem = "cosmético deletado com sucesso!";
                cosmeticos.remove(cosmetico);
                return mensagem;
            }
        }
        return "Cosmético inexistente";
    }
}
