import java.util.Scanner;

class StoringAndLoops{

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.next();
        double temp;
        System.out.println("what is todays tempreture?");
        temp = keyboard.nextDouble();
        keyboard.nextLine();

        if (temp > 80)
            System.out.println("its to hot!");
        else if (temp > 65) {
            System.out.println("It's Nice !");
            System.out.println("Go out and enjoy your day");
        }
        else
            System.out.println("Too cold");
        System.out.println("well have a nice day");
    }
}
