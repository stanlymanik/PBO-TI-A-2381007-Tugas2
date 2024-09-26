import java.util.Scanner;

public class tugas2 {

    public static int hitungLuasPersegi(int sisi) {
        int luasPersegi = sisi * sisi;
        return luasPersegi;
    }

    public static int hitungKelilingPersegi(int sisi) {
        int kelilingPersegi = 4 * sisi;
        return kelilingPersegi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        double luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        double kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;  // Menggunakan Math.PI untuk π
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;  // Menggunakan Math.PI untuk π
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1, 2 atau 3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            // Menjalankan program persegi
            System.out.print("Masukkan panjang sisi persegi: ");
            int sisi = input.nextInt();

            int luasPersegi = hitungLuasPersegi(sisi);
            int kelilingPersegi = hitungKelilingPersegi(sisi);

            System.out.println("Luas persegi: " + luasPersegi);
            System.out.println("Keliling persegi: " + kelilingPersegi);
        } else if (pilihan == 2) {
            System.out.println("Masukkan panjang persegi panjang: ");
            int panjang = input.nextInt();

            System.out.println("Masukkan lebar persegi panjang: ");
            int lebar = input.nextInt();

            double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
            double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);

            System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
            System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
        } else if (pilihan == 3) {
            System.out.println("Masukkan jari-jari lingkaran: ");
            int jariJari = input.nextInt();

            double luasLingkaran = hitungLuasLingkaran(jariJari);
            double kelilingLingkaran = hitungKelilingLingkaran(jariJari);

            System.out.println("Luas lingkaran: " + luasLingkaran);
            System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
