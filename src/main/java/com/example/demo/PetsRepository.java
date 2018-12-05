package com.example.demo;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PetsRepository {

    private List<Pets> pets = new ArrayList<>();


    public PetsRepository() {
        pets.add(new Pets("Cheester", "dog", "lovely, always bring the stick back", 1));
        pets.add(new Pets("Aszanti", "cat", "obese, whinny", 2));
        pets.add(new Pets("Rogger", "rabbit", "white ball of furr", 3));
    }

    public List<Pets> getPets(String type, String name) {
        List<Pets> newList = new ArrayList<>();
        if (type.equals("all") && name.equals("all")) {
            return pets;
        } else if (type.equals("all") && !(name.equals("all"))) {
            for (int i = 0; i < pets.size(); i++) {
                if (pets.get(i).getName().equals(name)) {
                    newList.add(pets.get(i));
                }
            }
            return newList;
        } else if (!(type.equals("all")) && name.equals("all")) {
            for (int i = 0; i < pets.size(); i++) {
                if (pets.get(i).getType().equals(type)) {
                    newList.add(pets.get(i));
                }
            }
            return newList;
        } else {
            for (int i = 0; i < pets.size(); i++) {
                if (pets.get(i).getName().equals(name) && pets.get(i).getType().equals(type)) {
                    newList.add(pets.get(i));
                }
            }
            return newList;
        }
    }


    public void addPets(Pets pet) {
        pets.add(pet);
    }

    public Pets showPets(String name) {
        for (Pets pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    public List<Pets> sortByType(String type) {
        ArrayList<Pets> sortedList = new ArrayList<>();
        for(int i = 0; i< pets.size();i++){
            if(pets.get(i).getType().equals(type)){
                sortedList.add(pets.get(i));
            }
        }
        return sortedList;
    }

    public List<Pets> sortByName(String name) {
        ArrayList<Pets> sortedList = new ArrayList<>();
        for(int i = 0; i< pets.size();i++){
            if(pets.get(i).getName().equals(name)){
                sortedList.add(pets.get(i));
            }
        }
        return sortedList;
    }


}

