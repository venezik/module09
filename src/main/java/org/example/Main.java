package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Professional Look");
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalFactory.createTop();
        Pants professionalPants = professionalFactory.createPants();
        Shoes professionalShoes = professionalFactory.createShoes();

        professionalPants.wear();
        professionalShoes.wear();
        professionalTop.wear();

        System.out.println("\nCasual Look");

        GarmentFactory casualFactory = new CasualGarmentFactory();
        Top casualTop = casualFactory.createTop();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();

        casualPants.wear();
        casualShoes.wear();
        casualTop.wear();

        System.out.println("\nParty Look");

        GarmentFactory partyFactory = new PartyGarmentFactory();
        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();

        partyPants.wear();
        partyShoes.wear();
        partyTop.wear();
    }
}

