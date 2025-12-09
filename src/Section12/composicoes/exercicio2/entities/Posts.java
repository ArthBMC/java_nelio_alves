package Section12.composicoes.exercicio2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Posts {
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private final List<Comments> commentsList = new ArrayList<>();

    public Posts(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment (String newComment){
        Comments comment = new Comments(newComment);
        commentsList.add(comment);
    }

    public void removeComment (Comments comment){
        commentsList.remove(comment);
    }


    public void showPosts(){
        System.out.println(title);
        System.out.printf("%d Likes - %s%n", likes, sdf1.format(moment));
        System.out.println(content);

        System.out.println("Comments: ");
        if (commentsList.isEmpty()){
            return;
        }
        for (Comments c: commentsList){
            System.out.println(c.getText());
        }
        System.out.println();
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf1.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comments c: commentsList){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }


}
