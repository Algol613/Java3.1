import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ticet coast: ");
        float cost = in.nextFloat();
        float mile = (float) Math.floor(cost/20);
        in.close();
        System.out.printf("Added bonus miles: %s \n", mile);

    }
}