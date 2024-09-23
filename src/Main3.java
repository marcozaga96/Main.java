import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("------------------------input per il rettangolo------------------------------");
        System.out.println("inserisci la lunghezza del primo lato del rettangolo");
        double lato1= scanner.nextDouble();
        System.out.println("inserisci la lunghezza del secondo lato del rettangolo");
        double lato2= scanner.nextDouble();
        double perimetroRettangolo = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);


        System.out.println("------------------------input per il pari o dispari------------------------------");
        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));


        System.out.println("------------------------input per il triangolo------------------------------");
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double latoA = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double latoB = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double latoC = scanner.nextDouble();
        double areaTriangolo = areaTriangolo(latoA, latoB, latoC);
        System.out.println("L'area del triangolo è: " + areaTriangolo);

        scanner.close();
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    public static double areaTriangolo(double latoA, double latoB, double latoC) {
        double semiPerimetro = (latoA + latoB + latoC) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - latoA) * (semiPerimetro - latoB) * (semiPerimetro - latoC));
    }
}
