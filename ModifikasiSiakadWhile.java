import java.util.Scanner;
public class ModifikasiSiakadWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double nilai = 0; // Inisialisasi agar nilai bisa digunakan
        int jml; // Mengubah jml menjadi int
        int i=0; // Mengubah i menjadi int
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt(); 

    while (i < jml){
        
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
        nilai = sc.nextDouble(); // Menggunakan nextDouble()
    
        if ( nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
            continue;
        }
        
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiwa ke-" + (i + 1)+ " adalah A");
            System.out.println("Bagus, pertahankan nilainya!"); // MODIFIKASI: Pesan tambahan
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1)+ " adalah B+");
        } else if (nilai > 65 && nilai<= 73) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1)+ " adalah B");
        } else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1)+ " adalah C+");
        } else if (nilai > 50 && nilai <=60) {
            System.out.println("Nilai mahasiswa ke-"+ (i + 1) +" adalah C"); 
        } else if (nilai > 39 && nilai <= 50) {
            System.out.println("Nilai mahasiswa ke-"+ (i + 1) +" adalah D");
        } else {
            System.out.println("Nilai mahasiswa ke-"+ (i + 1) +" adalah E");
        }
        
        i++; // Penambahan counter di akhir loop
    }
    
    sc.close();
    }
}