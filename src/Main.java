import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {


        //ESERCIZIO 1
        System.out.println("======= ESERCIZIO 1 =======");
        int moltiplicazione = moltiplica(34, 556);
        System.out.println(moltiplicazione);

        String concatenata = contatena("ciao", 5);
        System.out.println(concatenata);

        String[] a = {"A", "B", "C", "D", "E",};
        String[] b = inserisciInArray(a, "Son quella nuova");
        System.out.println(Arrays.toString(b));


        //ESERCIZIO 2
        System.out.println("======= ESERCIZIO 2 =======");

//        String risultato = concatenazione();
//        System.out.println(risultato);


        //ESERCIZIO 3
        System.out.println("======= ESERCIZIO 3 =======");

        int perimetro = perimetroRettangolo(4, 7);
        System.out.println(perimetro);

        String pariOdispari = pariOdispari();
        System.out.println(pariOdispari);

        double area = areaTriangolo();
        System.out.println("L'area del triangolo è: " + area);


    }

    //ESERCIZIO 1
    static int moltiplica(int a, int b) {
        return a * b;
    }

    static String contatena(String str, int a) {
        return str + a;
    }

    static String[] inserisciInArray(String[] a, String nuova) {
        int index = 2;
        String[] b = new String[a.length + 1];
        System.arraycopy(a, 0, b, 0, index);
        b[index] = nuova;
        System.arraycopy(a, index, b, index + 1, a.length - index);
        return b;
    }

    //ESERICZIO 2
    static String concatenazione() {
        System.out.println("Adesso dovrai digitare 3 stringhe");
        System.out.println("Digita la prima");
        String a = scanner.next();
        System.out.println("Digita la seconda");
        String b = scanner.next();
        System.out.println("Digita la terza");
        String c = scanner.next();

        String d = a + " " + b + " " + c;
        String e = c + " " + b + " " + a;

        return "Ordinate: " + d + "\nAl contrario:" + e;
    }


    //ESERCIZIO 33
    static int perimetroRettangolo(int base, int altezza) {
        return (base + altezza) * 2;
    }

    static String pariOdispari() {
        System.out.println("inserisci un numero");
        double n = scanner.nextDouble();
        double result = n % 2;
        if (result == 0) return "il numero è pari";
        else return "Il numero è dispari";
    }

    static double areaTriangolo() {
        System.out.println("Inserisci i lati di un trianglo");
        System.out.println("Primo lato:");
        double a = scanner.nextDouble();
        System.out.println("Secondo lato");
        double b = scanner.nextDouble();
        System.out.println("Terzo lato");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2; //semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}


