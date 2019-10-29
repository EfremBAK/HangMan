public class variousvariables {
    public static void main(String[] args){
        //declare variables here before we use them
        int x, y, answer;
        //all three variables will be declared as integers
        double temperature;
        float Temperature, gpa;
        //a float uses less memory than a double
        String firstName, lastName;
        String question = "unknown";
        //the last movie I saw
        String lMovie = "Joker";
        // question is initialized
        //assign values to the variables here
        x = 99;
        //my commulative is
        gpa = 3.72f;
        y=214783647;    //you could also use a constant integer.Max_value
        int z=Integer.MAX_VALUE;
        answer =27;
        firstName="Abrehe";
        lastName = "Efrem";
        //String question = "unknown";      //question is initialized
        temperature = 98.6;
        Temperature = 32.0f;

        //use the variables here
        System.out.println("the variable x contains a value of " + x);
        System.out.println("the value " + z + " the largest value ");
        System.out.println("you can store in an integer.");
        System.out.println("the answer to the question of my age is  : " + answer);
        System.out.println("And the question has long since been "+ question);
        System.out.println("if you are not sick you temperature is "+ temperature);
        System.out.println("The variable Temperature is not "+"the same as temperature");
        System.out.println("The founder of Java is "+ firstName +" "+ lastName);
        System.out.printf("Apparently the last movie I saw is "+ lMovie);
        System.out.println("And my GPA is "+ gpa);
    }
}
