package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void TestBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Roll(Roll.SESAME))
                .burgers(2)
                .sauce(new Sauce(Sauce.BARBECUE))
                .ingredients(new Ingredients(Ingredients.LETTUCE))
                .ingredients(new Ingredients(Ingredients.BACON))
                .ingredients(new Ingredients(Ingredients.CHILLI))
                .ingredients(new Ingredients(Ingredients.BACON))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatKindOfBun = bigmac.getBun().getKind();
//        Class<Ingredients> ingredients = Ingredients.class;

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("SESAME", whatKindOfBun);
    }
}
