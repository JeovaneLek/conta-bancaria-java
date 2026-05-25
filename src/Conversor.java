import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em fahrenheit é " + fahrenheit);

        input.close();

    }
}