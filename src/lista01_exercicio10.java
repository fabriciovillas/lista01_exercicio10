import java.util.Scanner;
public class lista01_exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em graus fahrenheit é:" + fahrenheit);

    }
}
