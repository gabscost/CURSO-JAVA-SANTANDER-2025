import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Write a code that receives the base and height of a rectangle, calculates its area and displays it on the screen
        //
        //formula: area = base X height

        var scanner = new Scanner(System.in);
        System.out.printf("enter a base number of the triangle\n ");
        var base = scanner.nextDouble();
        System.out.printf("enter a size of the triangle\n ");
        var size = scanner.nextDouble();
        System.out.println("triangle: " + base + "+" + size + "=" + (base * size));

    }
}