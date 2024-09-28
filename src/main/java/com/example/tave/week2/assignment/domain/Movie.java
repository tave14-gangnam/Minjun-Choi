package com.example.tave.week2.assignment.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long id;

    private String title;
    private String content;

    @OneToMany(mappedBy = "movie")
    private List<Member> users = new ArrayList<Member>();

    @Builder
    public Movie(Long id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
}