//taking an array input exercise

/*
declare and print the integer arrays below:

5 number of positive numbers
5 number of negative numbers
5 number of odd numbers
5 number of even numbers

  NOTE : arrays class needs to be imported

 */

import java.util.Random;

public class CreateIntegerArray {
    public static void main(String[] args){

        Random ran = new Random();
        int rangen;

int [] positive;
int [] negative;
int [] odd;
int [] even;

positive = new int[5];
negative = new int[5];
odd = new int[5];
even = new int[5];
        System.out.println("positive numbers:");
for (int p = 0; p <5; p++){
    rangen =1 + ran.nextInt(100);

positive[p]= rangen;
    System.out.println( positive[p]);

}

System.out.println("negative numbers:");
for (int n = 0; n <5; n++){
            rangen =1 + ran.nextInt(100);

            negative[n]= rangen;
            System.out.println(-( negative[n]));
        }

        System.out.println("even numbers:");
        for (int e = 0; e <5; e++){
            rangen =1 + ran.nextInt(100);

            even[e]= rangen;
            System.out.println(2*( even[e]));
        }

    }
}
