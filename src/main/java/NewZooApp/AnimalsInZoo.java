package NewZooApp;

import java.util.ArrayList;
import java.util.List;

public class AnimalsInZoo {
        List<ZooAnimal> animalsInZoo = new ArrayList<>();


        public void showMeAnimals (){

            animalsInZoo.stream()
                    .map(ZooAnimal::getName)
                    .forEach(System.out::println);
        }
    }

