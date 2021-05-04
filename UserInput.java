import java.util.Scanner;//this is our scanner classs
public class UserInput {
    public static void main(String[] args) {
        //in java user input can be taken using the Scanner Class by importing the package
        Scanner sc=new Scanner(System.in);//here scanner is a class which is used to take the input from the user Sytem.in is used for taking input from the keyboard
        System.out.println("Please enter the value");
        int value=sc.nextByte();
        System.out.println("The value which is taken  from user is:"+value);

    }
}
