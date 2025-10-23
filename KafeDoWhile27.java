import java.util.Scanner;
public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;
        int totalHarga;
        String namaPelanggan;
    
        final int hargaKopi = 12000;
        final int hargaTeh = 7000;
        final int hargaRoti = 20000;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = sc.nextLine();
            
            
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan."); 
                break; 
            }
            
           
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            
            System.out.print("Jumlah roti: "); 
            roti = sc.nextInt();
            
            
            sc.nextLine(); 
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            
            
            
        } while (true); 
        
        System.out.println("Semua transaksi selesai.");
        
        sc.close();
    }
}