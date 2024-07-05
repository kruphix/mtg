package com.game.mtg.entity.list;

import jakarta.persistence.*;

@Entity
public class CardSet {

    @Id
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private short releaseYear;
}