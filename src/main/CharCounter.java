//Syed Airaj Hussain 100789134 
public class CharCounter {

    public static int countingChars(char[] cArray, char current) { 
        int counter = 0; 
        for (char c : cArray) { 
            if (c == current) { 
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
    	
    	// Creating a random array of letters with recurring letters like 'a'
        char[] randArray = {'a','c','c','e','p','t'};
        
        //choosing char A
        char chosenC = 'c';
        
        //Counting amount of times the chosen character recurs in the array randArray
        int times = countingChars(randArray, chosenC);
        
        //printout out amnt of times it occurs 
        System.out.println("The amount of times '" + chosenC + "' is in the array is : " + times);
    }
}
