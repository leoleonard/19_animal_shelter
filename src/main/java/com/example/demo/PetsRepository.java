package com.example.demo;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PetsRepository {

    private List<Pets> pets = new ArrayList<>();

    public PetsRepository(List<Pets> pets) {
        this.pets = pets;
    }

    public PetsRepository() {
        pets.add(new Pets("Cheester", "dog", "lovely, always bring the stick back", 1));
        pets.add(new Pets("Aszanti", "cat", "obese, whinny", 2));
        pets.add(new Pets("Rogger", "rabbit", "white ball of furr", 3));
    }

    public List<Pets> getPets() {
        return pets;
    }

    public void addPets(String name, String type, String description, int id) {
        pets.add(new Pets(name, type, description, id));
    }

    public void addPets(Pets pet){
        pets.add(pet);
    }

    public ArrayList<Pets> getPetsByType(String type) {
        ArrayList<Pets> typesList = new ArrayList<>();
        for (Pets pet : getPets()) {
            if (pet.getType().compareTo(type) == 0)
                typesList.add(pet);
        }
        return typesList;
    }

}

