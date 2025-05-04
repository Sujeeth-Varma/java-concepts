import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {
//        Divide By zero exception
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
//        IOException
//        FileReader will be automatically closed -
//        after it's utilization by using try with resource block
        try(FileReader fr = new FileReader("test.txt")) {
            System.out.println(fr.read());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        CustomException
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        try {
            if (age < 18) {
                throw new CustomException("Under Age!!");
            } else {
                System.out.println("Age above 18");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}