package com.kodilla.good.patterns.food.shop;

import java.util.Scanner;

public class ShopSupplierChoice {
    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. ExtraFoodShop");
        System.out.println("     2. HealthyShop");
        System.out.println("     3. GlutenFreeShop");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }
}
