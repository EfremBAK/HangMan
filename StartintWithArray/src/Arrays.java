import java.util.Random;

public class Arrays {
    public static void main (String [] args){
        String str = "hello";
        str.compareTo("Hello"); //compares two strings
        str.length(); // length of the string length
        str.equalsIgnoreCase("hELlo"); //this will ignore the case and compare the characters
        str.charAt(1); // tells us the 2nd character of the string hello

        Random rnd = new Random();
        int randomInt;

        //Declare array to hold ten test scores
        int scores[] = new int[10];

        //initialize elements of an array
        for (int i = 0; i< 10; i++){
            randomInt = 1 + rnd.nextInt(100); // creates a random number between 1 and 100
            scores[i] = randomInt;
        }

        //print the element of an array
        for (int i = 0; i < 10; i++){
        System.out.printf("Element # %d value is %d\n", i, scores[i]);

    }
}
