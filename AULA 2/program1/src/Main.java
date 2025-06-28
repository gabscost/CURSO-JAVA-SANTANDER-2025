import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        var sc = new Scanner(System.in);

        System.out.printf("type a number and find out its multiplication table\n: ");
        var multi = sc.nextInt();

        for (var i = 1; i <= 10; i++) {
            System.out.printf("mutiplication table %d * %d = %d\n", i, multi, multi * i);

        }

    }
}