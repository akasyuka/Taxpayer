package ru.learnup.javaqa.taxpayer.HW24.entities;

import javax.persistence.*;

@Entity
@Table(name ="players")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String player;

    @Column
    Integer day;

    @Column
    Integer steps;

    public Post() {

    }

    public Post(Integer id, String player, Integer day, Integer steps) {
        this.id = id;
        this.player = player;
        this.day = day;
        this.steps = steps;
    }

    public Post(String player, Integer day, Integer steps) {
        this.player = player;
        this.day = day;
        this.steps = steps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", player=" + player +
                ", day=" + day +
                ", steps=" + steps +
                '}';
    }
}
