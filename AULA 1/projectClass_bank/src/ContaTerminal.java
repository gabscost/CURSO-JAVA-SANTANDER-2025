import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta:\n");
        var n = sc.nextInt();
        sc.nextLine();
        System.out.printf("Por favor, digite o número da Agência: \n");
        var ag = sc.nextLine();
        System.out.printf("Por favor, digite o nome do Cliente:\n");
        var c = sc.nextLine();
        System.out.printf("Por favor, entre com o saldo da conta:\n");
        var saldo = sc.nextDouble();

        System.out.println("Olá " + c +", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " +n+ " e seu saldo " + saldo + " já está disponível para saque. ");
    }
}