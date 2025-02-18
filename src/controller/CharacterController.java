package controller;
import model.Character;

import model.Product;
import repository.CharacterRepository;

import java.util.List;

import java.util.List;

public class CharacterController {
    private CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void addCharacter(int id, String name, String originVillage, List<Product> purchasedProducts) {
        Character character = new Character(id, name, originVillage, purchasedProducts);
        characterRepository.addCharacter(character);
    }

    public void updateCharacter(int index, int id, String name, String originVillage, List<Product> purchasedProducts) {
        Character character = new Character(id, name, originVillage, purchasedProducts);
        characterRepository.updateCharacter(index, character);
    }

    public void removeCharacter(int index) {
        characterRepository.removeCharacter(index);
    }

    public void showAllCharacters() {
        for (Character character : characterRepository.getAllCharacters()) {
            System.out.println(character);
        }
    }
}

