package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        //INSTANCIANDO FORMATO DE HORAS
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        //INSTANCIANDO OS OBJETOS COMMENT
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        //INSTANCIANDO O OBJETO POST
        /*
         *     Post p1 = new Post(moment, title, content, likes)
         */
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);

        // ADCIONANDO COMENTARIOS AO POST p1
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
