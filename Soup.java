//Name: Arrune Nimalan
//Date: 9/24/25
//Description: This program will...
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

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int length = letters.length();
        int randomChar = (int)(Math.random()*length);
        return letters.charAt(randomChar);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int middle = letters.length()/2;
        String firstHalf = letters.substring (0,middle);
        String secondHalf = letters.substring (middle);
        return firstHalf + " " + company + " " + secondHalf;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]","");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int stringLength = letters.length();
        int num = (int)(Math.random()*(stringLength));
        letters = letters.replace(num,"");
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replace("word","");
    }
}
