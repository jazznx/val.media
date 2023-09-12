package att;
import java.util.Scanner;

public class a2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
            int numero3 = scanner.nextInt();

        scanner.close();
        float media = (float) (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é: " + media);


    }
}
