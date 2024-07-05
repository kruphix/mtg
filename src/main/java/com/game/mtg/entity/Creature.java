package com.game.mtg.entity;

import com.game.mtg.entity.list.CardType;
import com.game.mtg.entity.list.CreatureType;

import java.util.List;

public class Creature extends Card implements Permanent, Spell {
    private List<CardType> cardTypes;
    private List<CreatureType> creatureTypes;
    private int power;
    private int toughness;
}
