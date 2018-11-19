package com.example.demo;

public class Pets {
        private String name;
        private String type;
        private String description;
        private int id;

    public Pets(String name, String type, String description, int id) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pets() {
        }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
