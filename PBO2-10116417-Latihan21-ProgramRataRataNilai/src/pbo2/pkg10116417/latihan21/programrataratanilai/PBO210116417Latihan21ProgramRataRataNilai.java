/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author Akmal
 * `NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM Rata - Rata Nilai
 */
public class PBO210116417Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
        int nBanyak, jml, nilai[];
        float rata, jumlah = 0;

        System.out.print("Masukan Jumlah Mahasiswa : ");
        nBanyak = input.nextInt();

        nilai = new int[nBanyak];

        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        for (int j = 0; j <= nBanyak - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        rata = jumlah / nBanyak;
        System.out.println();
        System.out.println("Maka, rata rata nilainya adalah " + rata);
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
    }
    
}
