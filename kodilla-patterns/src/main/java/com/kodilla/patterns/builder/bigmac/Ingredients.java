package com.kodilla.patterns.builder.bigmac;

public final class Ingredients {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLI = "CHILLI";
    public static final String MUSHROOM = "MUSHROOM";
    public static final String PRAWN = "PRAWN";
    public static final String CHEESE = "CHEESE";

    final private String ingredient;

    public Ingredients(final String ingredient) {
        if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) ||
            ingredient.equals(BACON) || ingredient.equals(CUCUMBER)||
            ingredient.equals(CHILLI) || ingredient.equals(MUSHROOM) ||
            ingredient.equals(PRAWN) || ingredient.equals(CHEESE)) {

            this.ingredient = ingredient;
        } else {
            throw new IllegalStateException("No such ingredient in the menu");
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
