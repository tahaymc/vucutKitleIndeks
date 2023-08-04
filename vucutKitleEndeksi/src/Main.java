import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy, kg, indeks;

        Scanner deger= new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = deger.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kg= deger.nextDouble();

        indeks = kg / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: "+indeks);



    }
}