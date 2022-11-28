import java.util.*;
//package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product sourCream = new Product("Сметана", 10, 1, 38);
        products.add(sourCream);
        Product tomato = new Product("Помидор", 1, 1, 48);
        products.add(tomato);
        products.add(new Product("Вода", 2, 1, 2));
        //products.add(new Product("Вода",1,1,2));
        products.add(new Product("Кофе", 2, 1, 2));
        Product cucumber = new Product("Огурец", 1, 1, 48);
        products.add(cucumber);

        Set<Product> salatProducts1 = new HashSet<>();
        salatProducts1.add(new Product("Кофе", 2, 1, 2));
        salatProducts1.add(new Product("Вода", 2, 1, 2));

        Set<Product> salatProducts2 = new HashSet<>();
        salatProducts2.add(sourCream);
        salatProducts2.add(tomato);
        salatProducts2.add(cucumber);

        System.out.println(products.toString());




        Recipes salat1 = new Recipes("Кофе вареный", salatProducts1);
        salat1.getRecipes();
        Recipes salat2 = new Recipes("Салат летний", salatProducts2);
        salat2.getRecipes();

        Set<Recipes> recipesList = new HashSet<>();
        recipesList.add(salat1);
        recipesList.add(salat2);
        recipesList.add(salat2);

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> set2 = new ArrayList<>();


        for(int i = 0; i < 20; i++)
            set.add((int) Math.round(Math.random()*100));

        //System.out.println(Arrays.toString(set.toArray()));

        for(Integer element : set)
            if(element % 2 == 0)
                set2.add(element);

        set.removeAll(set2);
        System.out.println(Arrays.toString(set.toArray()));


        Numbers.numbersSet();
    }


}
