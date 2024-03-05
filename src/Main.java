import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Fruits.values()));
        System.out.println("Write name fruit: ");

        Fruits.valueOf(new Scanner(System.in).nextLine().toUpperCase()).getFruits();
        {

        }
    }
}