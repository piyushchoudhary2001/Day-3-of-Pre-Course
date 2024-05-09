
import java.util.Scanner;

public class TakingInput {


    // add two numbers
 public static void main(String[] agrs)
 {
     Scanner input= new Scanner(System.in);
    /// System.out.println("Please give the radius of the circle");
     int pi=3;
     int radius=input.nextInt();
     int perimeter=2*pi*radius;
     int area=pi*radius*radius;

     System.out.println("Your area for your circle is: "+area);
     System.out.println("Your parameter for your circle is :"+perimeter);




//     float a=14;
//     float b=3;
//     float answer=a/b;

//     double a=14;
//     double b=3;
//     double answer=a/b;

//     System.out.println(14d/3d);





//     System.out.println("Enter Your Character: ");
//     char mychar=input.next().charAt(2);
//     System.out.println("You have entered: "+mychar);






//     System.out.println("What's your name:");
//     String name=input.nextLine(); using nextLine() we are able to read whole sentance
//       String name=input.next(); using next() we are reading one word
//     System.out.println("your name is:"+name);







//     System.out.println("Give your first number");
//     int firstNumber=input.nextInt();
//     System.out.println("Give your second number");
//     int secondNumber=input.nextInt();
//     System.out.println("You answer is: "+(firstNumber+secondNumber));

 }

}


