package com.lanou.day15.factory;

public class Test {

    public static void main(String[] args) throws Exception {
        AnimalFactory factory = new AnimalFactory();
        Object sheep = factory.getAnimalInstance("com.lanou.day15.factory.Sheep");
        Object dog = factory.getAnimalInstance("com.lanou.day15.factory.Dog");

        factory.doEat(sheep,"com.lanou.day15.factory.Sheep");
        factory.doEat(dog,"com.lanou.day15.factory.Dog");
    }

}
