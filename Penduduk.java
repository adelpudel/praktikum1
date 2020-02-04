package pbo5;

import java.util.*;

public class Penduduk {

    ArrayList<PBO5> latihan = new ArrayList<>();
    PBO5 penduduk = new PBO5();

    public static void main(String[] args) {
        Penduduk p = new Penduduk();
        p.menu();
    }

    public void menu() {
        System.out.println("----Selamat Datang----");
        System.out.println("1. Mengisi Data");
        System.out.println("2. Mencetak Data");
        System.out.println("3. Tambah Data");
        System.out.println("4. Keluar");
        System.out.print("\nPilihan : ");
        String pilihan = new Scanner(System.in).nextLine();
        switch (pilihan) {
            case "1":
                data();
                break;
            case "2":
                cetak();
                break;
            case "3":
                tambah();
                break;
            case "4":
                System.out.println("---TERIMAKASIH---");
        }
    }

    public void lanjut() {
        System.out.println("\nIngin melanjutkan? (yes/no)");
        String pilih = new Scanner(System.in).nextLine();
        switch (pilih) {
            case "yes":
                menu();
                break;
            case "no":
                System.out.println("---TERIMAKASIH---");
        }
    }

    public void data() {
        System.out.println("\nISI DATA BERIKUT");
        System.out.print("Nama            : ");
        String nama = new Scanner(System.in).nextLine();
        System.out.print("NIK             : ");
        String nik = new Scanner(System.in).nextLine();
        System.out.print("TTL             : ");
        String ttl = new Scanner(System.in).nextLine();
        System.out.print("Jenis Kelamin   : ");
        String jk = new Scanner(System.in).nextLine();
        System.out.println("\n1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.print("4. O");
        System.out.print("\nGolongan Darah  : ");
        int gol = new Scanner(System.in).nextInt();
        if (gol == 1) {
            System.out.println("Golongan Darah A");
        } else if (gol == 2) {
            System.out.println("Golongan Darah B");
        } else if (gol == 3) {
            System.out.println("Golongan Darah AB");
        } else if (gol == 4) {
            System.out.println("Golongan Darah O");
        }
        latihan.add(penduduk);
        penduduk.setNama(nama);
        penduduk.setNik(nik);
        penduduk.setTtl(ttl);
        penduduk.setJk(jk);
        penduduk.setGol(gol);
        lanjut();
    }

    public void cetak() {
        for (int d = 0; d < latihan.size(); d++) {
            System.out.println("\nNama            : " + latihan.get(d).getNama());
            System.out.println("NIK             : " + latihan.get(d).getNik());
            System.out.println("TTL             : " + latihan.get(d).getTtl());
            System.out.println("Jenis Kelamin   : " + latihan.get(d).getJk());
            System.out.println("Golongan Darah  : " + latihan.get(d).getGol());
        }
        lanjut();
    }

    public void tambah() {
        System.out.println("\nIngin mengisi data lagi?(yes/no)");
        String pilih = new Scanner(System.in).nextLine();
        switch (pilih) {
            case "yes":
                data();
                break;
            case "no":
                System.out.println("\n-------TERIMAKASIH-------");
        }

    }
}
