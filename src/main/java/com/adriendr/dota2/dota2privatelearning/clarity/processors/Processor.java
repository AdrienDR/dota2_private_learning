package com.adriendr.dota2.dota2privatelearning.clarity.processors;

import com.adriendr.dota2.dota2privatelearning.clarity.metier.Game;

public abstract class Processor {

    private final Game game;

    protected Processor(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
