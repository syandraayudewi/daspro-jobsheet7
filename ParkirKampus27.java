import java.util.Scanner;

public class ParkirKampus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis;
        int durasi;
        int total = 0; 
        int bayarSaatIni = 0; 
        
        System.out.println("--- PROGRAM PARKIR KAMPUS ---");
        
        while (true) {
            
            System.out.println("-------------------------------------");
            System.out.println("Total Akumulasi Saat Ini: Rp" + total);
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilihan (1/2/0): ");
            
            jenis = sc.nextInt();
            
            if (jenis == 0) {
                break;
            }
            
            if (jenis == 1 || jenis == 2) {
                
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                
                if (durasi > 5) {
                    bayarSaatIni = 12500;
                    total += bayarSaatIni; 
                } else {
                    if (jenis == 1) {
                        bayarSaatIni = durasi * 3000;
                        total += bayarSaatIni; 
                    } 
                    else if (jenis == 2) { 
                        bayarSaatIni = durasi * 2000;
                        total += bayarSaatIni; 
                    } 
                }
                
                System.out.println("Transaksi ini bayar: Rp" + bayarSaatIni);
                
            } else {
                System.out.println("❌ Jenis kendaraan TIDAK VALID. Masukkan 1, 2, atau 0.");
            }
        } 
        
        System.out.println("\n--- PROGRAM SELESAI ---");
        System.out.println("TOTAL KESELURUHAN PEMBAYARAN: Rp" + total);

        sc.close();
    }
    
}
