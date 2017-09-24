package com.adriendr.dota2.dota2privatelearning.config;

public enum ElasticSearchTypes {

    GAME_TYPE("game");

    private final String typeName;

    private ElasticSearchTypes(String typeName){
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
