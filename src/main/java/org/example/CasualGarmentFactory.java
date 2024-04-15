package org.example;

class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }

    public Pants createPants() {
        return new CasualPants();
    }

    public Shoes createShoes() {
        return new CasualShoes();
    }
}