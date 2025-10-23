import java.util.Scanner;

public class ModifikasiSiakad27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nilainya, max = 0, min = 100.0;
        int jmlLulus = 0; 
        int tidakLulus = 0; 

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilainya = sc.nextDouble();

            
            if (nilainya > max) {
                max = nilainya; 
            }
            if (nilainya < min) {
                min = nilainya; 
            }

            
            if (nilainya >= 60) {
                jmlLulus++; 
            } else { 
                tidakLulus++; 
            }
            
        } 

        
        System.out.println("\n\n\n");
        System.out.println("--- HASIL AKHIR SEMENTARA ---");
        System.out.println("Nilai tertinggi di kelas ini: " + max);
        System.out.println("Nilai terendah di kelas ini: " + min);
        
        
        System.out.println("\n");
        System.out.println("Total mahasiswa yang LULUS (dapet 60 ke atas): " + jmlLulus);
        System.out.println("Total mahasiswa yang TIDAK LULUS (kurang dari 60): " + tidakLulus);
        
         
    }
}