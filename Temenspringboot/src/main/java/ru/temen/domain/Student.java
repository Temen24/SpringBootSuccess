package ru.temen.domain;

import javax.persistence.*;



@Entity @Table(name = "m_student")
public class Student {

    @Id @GeneratedValue
    private long id;


    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String course;
    @Column(nullable = false)
    private int score;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
