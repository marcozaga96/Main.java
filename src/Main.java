public class Main {
    public static void main(String[] args) {
        int num1 =5, num2 =3;
        int sum= num1 * num2;
        System.out.println("il risultato della moltiplicazione è:" + sum);

        String name= "marco";
        int anni = 28;
        System.out.println("ciao sono " + name + " ed ho " + anni + " anni");

        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String newString= "newString";

        String[] newArray= inserisciInArray(array,newString);

        for (String s : newArray) {
            System.out.println(s);
        }

    }
    public static String[] inserisciInArray(String[] array, String stringa) {

        String[] nuovoArray = new String[6];


        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];


        nuovoArray[2] = stringa;

        // Copiamo gli elementi rimanenti dal vecchio array
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }
}