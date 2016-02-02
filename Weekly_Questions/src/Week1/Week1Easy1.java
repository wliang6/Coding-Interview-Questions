package Week1;

/**
 * 
 * @author Winnie
 *Question: Write a function that tells you an individual’s Chinese Zodiac animal.
 *Hint: Chinese zodiac:12 animals that describe an individual's personalities and fortunes. 
 *      Every person is assigned to a zodiac according to their birth year. 
 *Hint: 1992: Monkey, 1993: Rooster, 1994: Dog, 1995: Pig, 1996: Rat, 1997: Ox, 
 *      1998: Tiger, 1999: Rabbit, 2000: Dragon, 2001: Snake, 2002: Horse, 2003: Goat
 *      
 */

public class Week1Easy1{

    public static void main(String[]args){
        
        int year = 1994;
        System.out.println(Integer.toString(year) + " is the year of the " + findZodiac(year) + ".");
    }
    
    /**
     * Input: int year
     * Output: String zodiac
     * Purpose: This function calculates the zodiac animal after inputting the birth year.
     * Iterate through an array and return zodiac at that index using module % sign
     */
    public static String findZodiac(int year){
        
        String[] zodiacAnimals = {"Monkey", "Rooster", "Dog", "Pig",
                "Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Goat"};
        
        int indexAnimal = year%12; 
        return zodiacAnimals[indexAnimal];
    }
    
}