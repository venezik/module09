package org.example;

public class Main {
    public static void main(String[] args) {
        GarmentFactory factory = new ProfessionalGarmentFactory(); // Creating a factory from using the GarmentFactory Interface
        Top top = factory.createTop(); // Creating an object by using Top interface and a factory that creates a Top
        Pants pants = factory.createPants(); // Creating an object by using Pants interface and a factory that creates Pants
        Shoes shoes = factory.createShoes(); // Creating an object by using Shoes interface and a factory that creates Shoes


        top.wear(); // wear a piece of clothes called on the object
        pants.wear(); // wear a piece of clothes called on the object
        shoes.wear(); // wear a piece of clothes called on the object
    }
}

