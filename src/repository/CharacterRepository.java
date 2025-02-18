package repository;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepository {
    private List<Character> characters;

    public CharacterRepository() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void updateCharacter(int index, Character character) {
        if (index >= 0 && index < characters.size()) {
            characters.set(index, character);
        }
    }

    public void removeCharacter(int index) {
        if (index >= 0 && index < characters.size()) {
            characters.remove(index);
        }
    }

    public List<Character> getAllCharacters() {
        return characters;
    }
}

