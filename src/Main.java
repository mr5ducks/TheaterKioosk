import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.println("input age= ");
        int ageInput = in.nextInt();
        //if starts and ends
        if (ageInput >= 21) {
            System.out.println("you get a wrist band ");
        }
        in.close();

    }
}