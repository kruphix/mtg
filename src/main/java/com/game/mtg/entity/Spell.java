package com.game.mtg.entity;

import com.game.mtg.entity.list.Color;

import java.util.ArrayList;
import java.util.List;

public interface Spell {
    List<Color> colors = new ArrayList<>();
    String castingCost = "";
}
