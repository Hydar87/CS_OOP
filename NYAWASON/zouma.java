//Name: HAIDAR NYAWA ZUMA
//Reg no: CT101/G/20354/23
//Assignment3:

/*java program accepting user input*/ 
import java.util.Scanner;

public class zouma {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //name input and output
        System.out.println("Enter name:");
        String name = myScanner.nextLine();
        System.out.println("Name is:" + name);

        //age input and output
        System.out.println("Enter age:");
        int age = myScanner.nextInt();
        System.out.println("Age is:" + age);

         //salary input and output
        System.out.println("Enter salary:");
        double salary = myScanner.nextDouble();
        System.out.println("Salary is:" + salary);

         //boolean expression input and output
        System.out.println("Working (true/false):");
        boolean working = myScanner.nextBoolean();
        System.out.println("Working status:" + working);


    }
}