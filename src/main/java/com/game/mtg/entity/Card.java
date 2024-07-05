package com.game.mtg.entity;

import com.game.mtg.entity.list.CardSet;
import com.game.mtg.entity.list.CardType;
import com.game.mtg.entity.list.Rarity;
import com.game.mtg.entity.list.SuperType;

import java.util.List;

public abstract class Card {
    private int id;
    private List<CardType> cardTypes;
    private List<SuperType> superTypes;
    private String flavorText;
    private CardSet cardSet;
    private Rarity rarity;
}
