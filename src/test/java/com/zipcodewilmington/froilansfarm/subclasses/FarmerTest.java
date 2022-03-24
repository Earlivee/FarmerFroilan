package com.zipcodewilmington.froilansfarm.subclasses;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void createFarmerTest(){

        //Given
        String name = "bobbie";

        //
        Farmer farmer1 = new Farmer();
        farmer1.setName(name);
        String actual = farmer1.getName();

        //
        assertEquals(name, actual);

    }

    @Test
    public void eaterTest(){

        //Given
        Egg eggie = new Egg();
        Farmer farmer1 = new Farmer("Bob");
        int expected = 1;
        //When
        farmer1.eat(eggie);

        //Then

        assertEquals(expected, farmer1.getMealsEaten());

    }

    @Test
    public void eaterTest2(){

        //Given
        Egg eggie = new Egg();
        Tomato ketchup = new Tomato();
        Farmer farmer1 = new Farmer("Bob");
        int expected = 2;
        //When
        farmer1.eat(eggie);
        farmer1.eat(ketchup);

        //Then
        assertEquals(expected, farmer1.getMealsEaten());
    }

    @Test
    void plantTest() {

//        //Given
//        Farmer farmer1 = new Farmer("Joe");
//        Cornstalk cornie = new Cornstalk();
//        String choice = "corn";
//        CropRow row1 = new CropRow();
//
//
//        //When
//        //row1.add(cornie);
//        row1.add(farmer1.plant(choice));
//
//        //Then
//        int expected = 1;
//        Assert.assertEquals(row1.size(),expected);

    }

    @Test
    void makeNoise() {

        Farmer joe = new Farmer("Joe");
        String speak = joe.makeNoise();

        System.out.println(joe.makeNoise());

        Assert.assertEquals(speak, joe.makeNoise());
    }

    @Test
    void mountTest() {

        Farmer roger = new Farmer("Roger");
        Horse horsejack = new Horse("Jack");

        roger.mountAnimal(horsejack);

        Assert.assertTrue(horsejack.riderList.contains(roger));

    }

    @Test
    void dismount() {
        //Given
        Farmer roger = new Farmer("Roger");
        Horse horsejack = new Horse("Jack");

        //When
        roger.mountAnimal(horsejack);
        roger.dismountAnimal(horsejack);

        Assert.assertFalse(horsejack.getMountStatus());

    }
}