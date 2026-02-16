import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("Upišite nešto: ");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        // Zadatak 1: Brojač slova, brojeva i ostalih znakova
        int countslova = 0;
        int countbrojevi = 0;
        int countznak = 0;

        for (int i = 0; i < user.length(); i++) {
            char c = user.charAt(i);
            if (Character.isLetter(c)) countslova++;
            else if (Character.isDigit(c)) countbrojevi++;
            else countznak++;
        }
        System.out.println("Slova: " + countslova + " Brojevi: " + countbrojevi + " Znakovi: " + countznak);
    }
}
