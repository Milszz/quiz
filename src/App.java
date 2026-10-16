import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //elbasa
        
        int n = input.nextInt();
        int angka = input.nextInt();

        int angkaTerbesar = angka;
        int angkaTerkecil = angka;

        for (int i = 1; i < n; i++) {
            angka = input.nextInt();

            if (angka > angkaTerbesar) {
                angkaTerbesar = angka;
            }
            if (angka < angkaTerkecil) {
                angkaTerkecil = angka;
            }
        }

        System.out.println("Nilai Terbesar: " + angkaTerbesar);
        System.out.println("Nilai Terkecil: " + angkaTerkecil);

        input.close();
    }
}