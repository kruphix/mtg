package com.game.mtg.entity.list;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreatureType {

    @Id
    private String name;
}
