import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Write a code that receives the size of a square's side, calculates its area and displays it on the screen
        //
        //formula: area=side X side

        var scanner = new Scanner(System.in);

        System.out.printf("enter one side of the square: \n");
        var side1 = scanner.nextDouble();
        System.out.printf("enter another one side of the square: \n");
        var side2 = scanner.nextDouble();
        var form = side1 * side2;
        System.out.printf("the area of the square: %.2f\n", form);

    }
}