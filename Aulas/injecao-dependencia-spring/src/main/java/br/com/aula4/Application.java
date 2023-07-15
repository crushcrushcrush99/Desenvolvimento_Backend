package br.com.aula4;

import br.com.aula4.model.VideoGame;
import br.com.aula4.model.controladores.ProController;
import br.com.aula4.model.jogos.TheLegendOfZelda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        VideoGame videoGame = applicationContext.getBean(VideoGame.class);
        System.out.println(videoGame.getJogo().getClass().getName());

        /*VideoGame videoGame = new VideoGame("Nintendo", "Game & Watch", new BigDecimal(200.00), new TheLegendOfZelda(), new ProController());

        System.out.println(videoGame.getJogo().getClass().getName());*/
    }
}
