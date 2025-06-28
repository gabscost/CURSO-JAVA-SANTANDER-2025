import java.time.Year;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1) Write a code that receives someone's
        // name and year of birth and prints the following message on the screen: "Hello 'So-and-so' you are 'X' years old"
        int comp = Year.now().getValue();
        var scanner = new Scanner(System.in);
        System.out.printf("Type yor Name: ");
        var name= scanner.nextLine();
        System.out.printf("\nType your year of birth: \n");
        var year= scanner.nextInt();

        var compYear =comp - year;

        System.out.printf("Hello " + name + "! You are " + compYear + " years old!\n");

    }
}