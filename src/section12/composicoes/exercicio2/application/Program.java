package section12.composicoes.exercicio2.application;

import section12.composicoes.exercicio2.entities.Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String title = "Traveling to New Zealand";
        int likes = 12;
        Date moment = sdf1.parse("21/06/2018 13:05:44");
        String content = "I'm going to visit this wonderful country!";



        Posts post1 = new Posts(moment, title, content, likes);
        post1.addComment("Have a nice trip");
        post1.addComment("Wow that's awesome!");

        post1.showPosts();
        System.out.println("-------teste com String Builder abaixo--------");
        System.out.println(post1.toString());



        String title2 = "Good night guys";
        int likes2 = 5;
        Date moment2 = sdf1.parse("28/07/2018 23:14:19");
        String content2 = "See you tomorrow";

        Posts post2 = new Posts(moment2, title2, content2, likes2);

        post2.addComment("Good night");
        post2.addComment("May the Force be with you");
        post2.showPosts();
        System.out.println("-------teste com String Builder abaixo--------");
        System.out.println(post2.toString());



    }
}
