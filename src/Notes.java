import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        int mat;
        int fizik;
        int kimya;
        int tarih;
        int muzik;
        int ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        ortalama = (mat + fizik + kimya + tarih + muzik) / 5;

        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
