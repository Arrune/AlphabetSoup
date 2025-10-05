//Name: Arrune Nimalan
//Date: 9/24/25
//Description: This program creates a Soup class that has several methods which will change a string named Letters.
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //precondition - word string is not null or empty
    //postcondition - return the word inserted by the user which is added to the end of the letters string
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

    //precondition - letters string is not null or empty
    //postcondition - returns a random character from the letters string 
    //by multiplying the length of the letters string to Math.random(), then casting it to an int
    //, and then using charAt to return that random character
    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int length = letters.length();
        int randomChar = (int)(Math.random()*length);
        return letters.charAt(randomChar);
    }

    //precondtion - letters string is not null or empty
    //postcondition - returns the first half of letters string then (with a space) the company name and then (with a space)
    //the second half of the letters string
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int middle = letters.length()/2;
        String firstHalf = letters.substring (0,middle);
        String secondHalf = letters.substring (middle);
        return firstHalf + " " + company + " " + secondHalf;
    }

    //precondtion - letters string is not null or empty
    //postcondition - removes the first vowel in the letters string and if their are no vowels nothing will happen
    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]","");
    }

    //precondition - letters string is not null or empty and num is not negative or exceed the length of letters string
    //postcondition - removes a certain number of letters (determined by the user's input in 
    //the terminal) and removes that number of letters from a random spot in the string
    //and returns the new string
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int totalLength = letters.length();
        int maxNum = totalLength - num;
        double random = Math.random();
        int scaled = (int) (random*(maxNum + 1));
        String firstPart = letters.substring(0,scaled);
        String secondPart = letters.substring(scaled + num);
        letters = firstPart + secondPart;
    }

    //precondition - letters string is not null or empty
    //postcondition - removes the word the user inputs in the terminal and only removes
    //that word. If the word is not found in letters string then nothing will happen.
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replace(word, "");
    }
}
