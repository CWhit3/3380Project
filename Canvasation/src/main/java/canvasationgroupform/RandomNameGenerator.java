/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvasationgroupform;

import java.util.Random;

/**
 *
 * @author christian_white
 */
public class RandomNameGenerator {
    private Random r = new Random();
     
    private String[] adjectives = {
        "Adventurous",
        "Bold",
        "Charismatic",
        "Daring",
        "Enigmatic",
        "Furry",
        "Gregarious",
        "Holistic",
        "Introverted",
        "Jubilant",
        "Knowledgeable",
        "Lucky",
        "Mnemonic",
        "Neutered",
        "Oppressed",
        "Presumptuous",
        "Quizzical",
        "Religious",
        "Sardonic",
        "Tolerable",
        "Unshaven",
        "Vain",
        "Weathered",
        "Xenophobic",
        "Yummy",
        "Zany"
    };
    private String[] animals = {
        "Aardvark", 
        "Beaver",
        "Cockatoo",
        "Deer",
        "Elephant",
        "Fox",
        "Giraffe",
        "Hippopotamus",
        "Iguana",
        "Jackal",
        "Kangaroo",
        "Llama",
        "Manatee",
        "Owl"
    };

    private boolean[][] used = new boolean[adjectives.length][animals.length];
       
    public String getNewName(){
        int adjUsed = r.nextInt(adjectives.length);
        int animalUsed = r.nextInt(animals.length);
        
        if(!used[adjUsed][animalUsed]){
            used[adjUsed][animalUsed] = true;
            return adjectives[adjUsed] + animals[animalUsed];
        }
        else{
            getNewName();
            return null;
        }

    }
}
