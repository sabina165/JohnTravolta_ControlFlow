/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class JohnTravolta {
    int jam_normal, gaji_normal;
    double gaji_lembur, gaji;
    
    public JohnTravolta() {
        
    }
    
    public double hitung_gaji(int jam_kerja){
        jam_normal=40;
        gaji_normal = 15000;
        gaji_lembur= 1.5*15000;
        
        if(jam_kerja>jam_normal){
            gaji=(jam_normal*gaji_normal)+((jam_kerja-jam_normal)*gaji_lembur);
            System.out.println(gaji);
        }
        else{
            gaji=jam_kerja*gaji_normal;
            System.out.println(gaji);
        }
        return gaji;
    }
        public int nabung (int pengeluaran){
            int message =0;
            if (gaji > pengeluaran){
                message=1;
                System.out.println("John bisa menabung sebesar "+(gaji-pengeluaran));
            }
            else if (gaji==pengeluaran){
                message=2;
                System.out.println("John tidak bisa menabung");
            }
            else{
                message=3;
                System.out.println("John butuh cari uang");
            }
            return message;
        }
}

         
//         try:
//    jam_kerja = int(input('Jam kerja minggu ini = '))
//    if jam_kerja > jam_normal:
//        gaji_total = int((jam_normal * gaji_normal) + ((jam_kerja - jam_normal) * gaji_lembur))
//    else:
//        gaji_total = int(jam_kerja * gaji_normal)
//
//    print('Gaji John Transvolta minggu ini = Rp' + str(gaji_total))
//
//    try:
//        pengeluaran = int(input('Pengeluaran John minggu ini = Rp'))
//        if gaji_total > pengeluaran:
//            print("John BISA MENABUNG sebesar Rp" + str(gaji_total - pengeluaran))
//        elif gaji_total == pengeluaran:
//            print('John TIDAK BISA MENABUNG')
//        else:
//            print('John butuh CARI TAMBAHAN')
//    except:
//        print("Input yang anda masukkan tidak valid")
//except:
//    print("Input yang anda masukkan tidak valid")
//        Scanner input = new Scanner(System.in);