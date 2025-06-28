import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Write a code that takes the name and age of 2 people and prints the age difference between them
        var sc = new Scanner(System.in);
        System.out.printf("type name of person 1 \n:");
        var name1 = sc.nextLine();
        System.out.printf("type year of person 1\n:");
        var year1 = sc.nextDouble();
        sc.nextLine();
        System.out.printf("type name of person 2\n:");
        var name2 = sc.nextLine();
        System.out.printf("type year of person 2\n:");
        var year2 = sc.nextDouble();

        System.out.printf("the age difference between the two: "+ name1+"(year: " +year1+")"+ " and " +name2+"(year: " +year2+") : "+ (year1-year2)+" years" );

    }
}