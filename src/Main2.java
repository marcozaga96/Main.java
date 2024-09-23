import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine();


        String allString = primaStringa + " " + secondaStringa + " " + terzaStringa;
        System.out.println("Concatenazione delle stringhe: " + allString);


        String ordineInverso = terzaStringa + " " + secondaStringa + " " + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + ordineInverso);

        scanner.close();
    }
}
