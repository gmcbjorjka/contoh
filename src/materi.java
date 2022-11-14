import java.util.Scanner;

public class materi {
    public static void main(String[] args) {
        for (int angka = 1; angka <=2;angka++){
            System.out.println(angka);
        }
        int faktorial =1 ;
        Scanner teguh = new Scanner(System.in);
        System.out.print("masukan angka : ");
        int input = teguh.nextInt();
        for (int a=1;a<=input;a++){
            faktorial = faktorial*a;

        }
        System.out.println("hasil :"+faktorial);


    }
    //buat untuk menghitung faktorial dari angka yang di input
    //masukan angka =4


}
