import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int mat,fizik,turkce,kimya,muzik;
        double  i = 0,ort=0,t=0;
	    System.out.print("Matematik notunuzu giriniz : ");
	    mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

       // double ort = (mat+fizik+turkce+kimya+muzik) / 5 ;

        if (mat >0 && mat <=100) {
            ort +=mat;
            i++;
        }
        if (turkce >0 && turkce <=100) {
            ort +=turkce;
            i++;
        }
        if (fizik >0 && fizik <=100) {
            ort +=fizik;
            i++;
        }
        if (kimya >0 && kimya <=100) {
            ort +=kimya;
            i++;
        }
        if (muzik >0 && muzik <=100) {
            ort +=muzik;
            i++;
        }
        t=ort / i;
        if (ort >=55) {
            System.out.print("Ortalamanız : " + t + " Tebrikler,sınıfı geçtiniz...");
        }
        else {
            System.out.print("Ortalamanız : " + t + " Sınıfta kaldınız...");
        }
    }
}
