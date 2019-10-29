/*
QUESTION. SIMPLE HANGMAN

Initialize your array list with the following words:
tree
rain
bear
encourage
promise
soup
chess
insurance
pancakes
stream
When you run the application, randomly choose a word from that list for the user to guess.
For each letter the user guesses wrong, let them know along with how many wrong guesses they have left.
The user is allowed up to 5 wrong guesses. On the 6th wrong guess, they lose the game.
If the user guesses correctly, output the word with the letters they have guessed correctly so far and blanks for letters
they have not guessed yet.
The user can input either a letter or a word for their guess.
If the user guesses the word correctly, output "You've won!" and end the game.


PSEUDOCODE
1. INITIALIZE An arraylist with the name "words"
2. populate the array using a single line
3. rndsel = you will need a randomizer method to choose from the list or from the array for the user to guess.
prompt user for input
save it to stirng variable
rndchk = you need to initialize another array with lenth as the one the random method has generated. and populate it with "_"
for index starting from zero upto word length, increment by 1
if word from user is equal to the variable,
display the word the user inputed on the same index it found the variable it found that word,
now rndchk is updated
repeat this until


4.(our else statement) user is going to have 5 wrong tries, so if the loop is false once, counter of wrongtries should be incremented by one
and displayed for the user. when counter wrongtries is six, display a message saying " you lost"
we would have character comparison


 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

    public static void main(String[] args) {

// declarations
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //char[] rndchk = new char[1];
        //char[] answer = new char[1];
        char letter;

        String guess;

        int wrongtry = 0;
        int correct = 0;
        int NoWords;

        boolean found = false;



        //randomly selecting  a word from list of the arraylist

        words.add("tree");
        words.add("rain");
        words.add("bear");
        words.add("encourage");
        words.add("promise");
        words.add("soup");
        words.add("chess");
        words.add("insurance");
        words.add("pancakes");
        words.add("stream");

int wordsize = words.size();
int rano = rand.nextInt(wordsize);
        String selected = words.get(rano);

        System.out.println("words size =" + wordsize + "     selected:" + selected + "   rano :" + rano);

        System.out.println("Welcome, let's play hHangman!");
        NoWords = selected.length();


         NoWords = selected.length();
        char[] rndchk = new char[NoWords];
        char[] answer = new char[NoWords];
        for (int i = 0; i<NoWords; i++){

           rndchk [i] = '_';
        }

        for (int i= 0; i<NoWords; i++) {
//you need a line to print out every characther of an array, mhere

        }
        System.out.print("Here is the word I am thinking of: " + rndchk);


    }
}
