package org.example;

//  Professional Factory Class that defines the Professional Factory which implements regular factory interface
class ProfessionalGarmentFactory implements GarmentFactory {
    public Top createTop() { // Creates an instance of Top and returns it as Professional Top
        return new ProfessionalTop();
    }

    public Pants createPants() {
        return new CasualPants(); // Creates an instance of Pants and returns it as Casual Pants
    }

    public Shoes createShoes() {
        return new PartyShoes(); // Creates an instance of Shoes and returns it as Party Shoes
    }
}
