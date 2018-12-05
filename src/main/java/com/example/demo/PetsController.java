package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PetsController {

    private PetsRepository petsRepository;

    @Autowired
    public PetsController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping("/")
    public String petsList(Model model) {
        model.addAttribute("petsList", petsRepository.getPets("all", "all"));
        return "index";
    }

    @GetMapping("/sort")
    public String sortedPets(Model model, @RequestParam String type, @RequestParam String name) {
        model.addAttribute("petsList", petsRepository.getPets(type, name));
        model.addAttribute()
    }

    @GetMapping("/add")
    public String addPet(Model model){
        model.addAttribute("pets", new Pets());
        return "petsForm";
    }

    @GetMapping("/savePet")
    public String savePet(Pets pets) {
        petsRepository.addPets(pets);
        return "/pets";
    }








}