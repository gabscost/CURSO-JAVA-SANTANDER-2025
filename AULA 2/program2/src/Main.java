import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        //
        //Se for menor ou igual a 18,5 "Abaixo do peso";
        //se for entre 18,6 e 24,9 "Peso ideal";
        //Se for entre 25,0 e 29,9 "Levemente acima do peso";
        //Se for entre 30,0 e 34,9 "Obesidade Grau I";
        //Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        //Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

        Scanner sc = new Scanner(System.in);

        System.out.printf("enter your age: \n");
        var age = sc.nextInt();
        System.out.printf("enter your height(exemple 1,75m): \n");
        var height = sc.nextDouble();
        System.out.printf("enter your weight: \n");
        var weight = sc.nextDouble();

        var imc = (weight / (height * height));
        System.out.printf("imc: %.2f\n", imc);
        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        }else if(imc > 18.6 && imc <24.9) {
            System.out.println("Peso ideal");
        }else if(imc > 25 && imc <29.9) {
            System.out.println("Levemente acima do peso");
        }else if(imc > 30 && imc <34.9) {
            System.out.println("Obesidade grau 1");

        }else if(imc > 35 && imc <39.9) {
            System.out.println("Obesidade grau 2");
        }else if(imc > 40) {
            System.out.println("Obesidade grau 3");
        }

    }
}