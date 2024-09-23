import java.util.Scanner;

public class Tugas2 {
    public static double hitungLuas (int sisi ){
        return  sisi*sisi;
    }
    public static double hitungLuas (int panjang, int lebar){
        return panjang*lebar;
    }
    public static double hitungLuas (int jarijari, double Pi ) {
        return Pi*jarijari*jarijari;
    }
    public static double hitungKeliling (int sisi){
        return sisi*4;
    }
    public static double hitungKeliling (int panjang, int lebar){
        return 2* (panjang+ lebar);
    }
    public static double hitungKeliling (int jarijari, double Pi){
        return 2*Pi*jarijari;
    }

    public static void piliJenisBangunDatar(){
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.println("Masukan sisi persegi : ");
                int sisi = input.nextInt();
                System.out.println("Luas persegi : " + hitungLuas(sisi) + "\n" + "Keliling persegi : " hitungKeliling(sisi));
                break;
            case 2:
                System.out.println("Masukan panjang persegi : ");
                int panjang = input.nextInt();
                System.out.println("Masukan lebar persegi : ");
                int lebar = input.nextInt();
                System.out.println("Luas persegi panjang : " + hitungLuas(panjang,lebar) + "\n" + "Keliling persegi panjang : " + hitungKeliling(panjang,lebar));
                break;
            case 3:
                System.out.println("Masukan jari-jari lingkaran: ");
                int jarijari = input.nextInt();
                System.out.println("Luas lingkaran : " + hitungLuas(jariJari,Math.PI) + "\n" + "Keliling lingkaran : " + hitungKeliling(jariJari,Math.PI));
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Masukan bangun datar : \n");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.print("3.Lingkaran\nMasukan pilihan : ");
        pilihJenisBangunDatar();
    }
    }
}
