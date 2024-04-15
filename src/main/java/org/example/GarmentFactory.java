package org.example;

// Abstract Factory Interface that implements 3 abstract methods - Top, Pants, Shoes and each one is created as Interfaces
interface GarmentFactory {
    Top createTop();

    Pants createPants();

    Shoes createShoes();
}
