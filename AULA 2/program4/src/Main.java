import java.util.Scanner;

//Write a code where the user enters an initial number, and will later enter another N numbers.
// The code execution will continue until the number entered divided
// by the first number has a remainder other than 0 in the division. Numbers smaller than the first number should be ignored.
public class Main {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.printf("type a number: \n");
        var n = sc.nextInt();
        while(true){
            System.out.printf("type a number for verification: \n");
            var toverify = sc.nextInt();
            if(toverify <n){
                System.out.printf("enter a larger number for verification: %s\n", n);
                continue;
            }
            var result = toverify %n;
            System.out.printf("%s %% %s = %s\n",toverify,n,result);
            if(result !=0)break;
        }


    }
}