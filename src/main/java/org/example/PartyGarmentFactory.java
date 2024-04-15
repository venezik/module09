package org.example;

class PartyGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new PartyTop();
    }

    public Pants createPants() {
        return new PartyPants();
    }

    public Shoes createShoes() {
        return new PartyShoes();
    }
}
