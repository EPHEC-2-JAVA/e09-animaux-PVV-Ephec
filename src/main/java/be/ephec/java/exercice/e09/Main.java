package be.ephec.java.exercice.e09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = createTable();
        for(Animal animal : animals){
            animal.makeNoise();
        }
    }

    public static Animal[] createTable(){
        Animal[] animals = new Animal[10];
        Random alea = new Random();

        for(int i = 0 ; i < animals.length ; i++){
            if(alea.nextBoolean())
                animals[i] = new Cat();
            else animals[i] = new Dog();
        }
        return animals;
    }

}