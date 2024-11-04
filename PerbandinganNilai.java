/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.util.Scanner;

public class PerbandinganNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi aktivitas? (Ya/Tidak): ");
            String ulangi = scanner.next();

            if (!ulangi.equalsIgnoreCase("Ya")) {
                break;
            }
        }
    }
}