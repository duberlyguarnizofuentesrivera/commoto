package com.mdsperu.commoto.enums;

public enum Country {
    //list of countries of latinAmerica
    ARGENTINA("Argentina"),
    BOLIVIA("Bolivia"),
    BRAZIL("Brazil"),
    CHILE("Chile"),
    COLOMBIA("Colombia"),
    ECUADOR("Ecuador"),
    GUATEMALA("Guatemala"),
    MEXICO("Mexico"),
    PANAMA("Panama"),
    PERU("Peru"),
    URUGUAY("Uruguay"),
    VENEZUELA("Venezuela");
    final String name;

    Country(String name) {
        this.name = name;
    }
}
