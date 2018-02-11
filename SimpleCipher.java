package simplecipher;

import java.util.Random;
import java.util.ArrayList;

public class SimpleCipher {
    
    /* firstletter, secondletter contain values of characters in the original text that is to be swapped and the one it is to be swapped FOR respectively
    ** Arrays origChars and newChars contain all of the unique characters from the original text, needed primarily for the chooseRandom method
    */ 
    
    private char firstletter, secondletter;
    public static ArrayList<Character> origChars = new ArrayList<Character> (), newChars = new ArrayList<Character> ();
    
    // Constructors
    
    SimpleCipher(char q, char w){
        firstletter = q;
        secondletter = w;
    }
    
    SimpleCipher(){
        firstletter = chooseRandom(origChars);
        secondletter = chooseRandom(newChars);
    }
    
    static public void addNewChars(char ch){
        origChars.add(ch);
        newChars.add(ch);
    }
    
    
    // Choosing a random character to swap (for cases when not provided by user)
    // The intended arguments are: origChars and newChars
    
    public char getFirst() {return firstletter;}
    public char getSecond() {return secondletter;}
    
    public static char chooseRandom(ArrayList<Character> q){
        Random rand = new Random();
        int n = rand.nextInt(q.size()-1);
        System.out.print(q.get(n));
        return q.get(n);
    }
    
    // Alternate random function for processing the random buttons
    
    public static char chooseRandom(int w){
        ArrayList<Character> q;
        q = (w==1) ? origChars : newChars;
        Random rand = new Random();
        int n = rand.nextInt(q.size());
        return q.get(n);
    }
    
    // StringBuilder returns a value instead of veing a void() method to allow for multiple output locations
    
    String swapLetters(String input, String output) throws WrongSwappedException, WrongSwapperException, SwapLimitException {
        
        if(!origChars.contains(firstletter)) {throw new WrongSwappedException();}   // Handling exceptions
        if(!newChars.contains(secondletter)) {throw new WrongSwapperException();}
        if(origChars.size() < 1 || newChars.size() < 1) {throw new SwapLimitException();}
        
        StringBuilder tempOutput = new StringBuilder(output);
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == firstletter){
                tempOutput.setCharAt(i,secondletter);
            }
        }
        String result = tempOutput.toString();
        origChars.remove((Character)firstletter); // Needed to prevent the same char to be swapped twice
        newChars.remove((Character)secondletter); // Needed to prevent other chars from being swapped for this one twice
        return result;
    }
    
    // For reverting changes (unused)
    
    String swapBack(String input, String output){
        StringBuilder tempOutput = new StringBuilder(output);
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == firstletter){
                tempOutput.setCharAt(i,firstletter);
            }
        }
        origChars.add(firstletter);
        newChars.add(secondletter);
        String result = tempOutput.toString();
        return result;
    }
    
}
