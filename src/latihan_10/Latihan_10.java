/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_10;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Latihan_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner masukan = new Scanner(System.in);
        //Input data dalam variabel lokal oleh user
        System.out.print("Masukkan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        //Perulangan
        for (int i=1; i<=batas; i++)
        hasil += i;
        //Memanggil hasil perhitungan untuk ditampilkan 
        System.out.println("Total jumlahnya adalah : "+hasil);
    }
    
}
