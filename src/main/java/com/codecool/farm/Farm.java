package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    public List<Animal> animalList;

    public Farm(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feedAnimals() {
        for (Animal animal : animalList) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animalList.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        if (animalList.size() == 0) {
            return true;
        }
        return false;
    }

    public List getAnimals() {
        return animalList;
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < animalList.size(); i++) {
            int tempSize = animalList.get(i).getSize();
            String tempName = animalList.get(i).getClass().getSimpleName().toLowerCase();
            result.add("There is a " + tempSize + " sized " + tempName + " in the farm.");
        }
        return result;
    }

}
