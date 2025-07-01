
//Write a code that the user enters with a first number, a second number greater than the first and chooses between the even
// and odd options, with this the code must inform all
// even or odd numbers (according to the initial selection) in the range of
// numbers informed, including the numbers informed and in descending order.

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void smain(String[] args) {

    var sc = new Scanner(System.in);
    var num2 = 0;
        System.out.printf("type a first number: \n");
        var num1 = sc.nextInt();
        do{
            System.out.printf("type a second number: \n");

             num2 = sc.nextInt();
        }while(num1 >num2);


        System.out.printf("want odd or even ???");
        var choice = sc.next();

        if(choice.equals("odd") ){

            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }

            }
        }else if(choice.equals("even") ){
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.printf("write even or odd, restart the program");
        }


    }
}