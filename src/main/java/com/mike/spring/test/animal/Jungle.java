package com.mike.spring.test.animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {
	private Animal largest;
	private List<Animal> animals;
    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Animal> animalMap = new HashMap<String, Animal>();

	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public void setAnimalMap(Map<String, Animal> animalMap) {
        this.animalMap = animalMap;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "largest=" + largest +
                ", animals=" + animals +
                ", foods=" + foods +
                ", animalMap=" + animalMap +
                '}';
    }
}
