package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    List<Animal> animalList = new ArrayList<>();

    public Farm(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feedAnimals() {
        for (Animal a :animalList) {
            a.feed(); }
        }


    public void butcher(Butcher butcher) {
        for (int i = 0; i < animalList.size(); i++) {

        }
    }

    public boolean isEmpty() {
        if (animalList.size() == 0) {
            return true;
        }
        return false;
    }

    public List getAnimals(){
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < animalList.size();i++){}return list;
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < animalList.size(); i++){
            int tempSize= animalList.get(i).getSize();
            String tempName = animalList.get(i).getClass().getSimpleName();
            result.add("There is a "+tempSize+ " sized "+ tempName +" in the farm.");
        }
        return result;
    }

}
