import java.util.Scanner;

public class PengelolaBioskop27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int harga = 50000;
        
        double totalJual = 0;
        double totalDuit = 0;
        
        int tiketSaatIni;
        
        System.out.println("--- PROGRAM KASIR BIOSKOP SEMENTARA ---");
        
        do {
            System.out.println("----------------------------------------");
            System.out.print("Input tiket dibeli (0 buat tutup kasir): ");
            tiketSaatIni = s.nextInt();
            
            if (tiketSaatIni == 0) {
                System.out.println("Kasir ditutup!");
                break;
            }

            if (tiketSaatIni < 0) {
                System.out.println("❌❌ ERROR! Input gak boleh minus. Ulangi!");
                continue;
            }
            
            double subtotal = tiketSaatIni * harga;
            double diskon = 0;
            
            if (tiketSaatIni > 10) {
                diskon = 0.15;
                System.out.println("Anda beli banyak, DISKON GEDE 15%!");
            } else if (tiketSaatIni > 4) {
                diskon = 0.10;
                System.out.println("Diskon lumayan, 10%!");
            } else {
                System.out.println("Gak ada diskon. Makasih.");
            }
            
            double bayar = subtotal - (subtotal * diskon);
            
            System.out.println("Total Bayar: Rp" + bayar);
            
            totalJual = totalJual + tiketSaatIni;
            totalDuit = totalDuit + bayar;
            
        } while (true);
        
        System.out.println("\n===== REKAP HARI INI =====");
        System.out.println("Total Tiket Terjual: " + (int)totalJual + " tiket");
        System.out.println("Total Uang Masuk: Rp" + (int)totalDuit);
        System.out.println("==========================");
        
        s.close();
    }
 {
 }    
}
