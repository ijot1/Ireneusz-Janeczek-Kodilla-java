package com.kodilla.patterns.builder.bigmac;

public final class Sauce {
    public static final  String STANDARD = "STANDARD";
    public static final  String _1000_ISLANDS = "1000_ISLANDS";
    public static final  String BARBECUE = "BARBECUE";

    final private String name;

    public Sauce(final String name) {
        if (name.equals(STANDARD) || name.equals(_1000_ISLANDS) || name.equals(BARBECUE)) {
            this.name = name;
        } else {
            throw new IllegalStateException("There is no such sauce in the menu");
        }
    }
}
