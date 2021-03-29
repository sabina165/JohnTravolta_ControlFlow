/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
/**
 *
 * @author Asus
 */
public class JohnTravolta {
    double gaji;
    
    public JohnTravolta() {
        
    }
    
    public double hitung_gaji(int jam_kerja){
        int jam_normal=40;
        int gaji_normal = 15000;
        double gaji_lembur= 1.5*15000;
        
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
    
    public String nabung (int gaji, int pengeluaran){
        String message;
        if (gaji > pengeluaran){
            message = "John Bisa Menabung Sebesar "+(gaji - pengeluaran);
            System.out.println(message);
        }
        else if (gaji==pengeluaran){
            message = "John Tidak Bisa Menabung";
            System.out.println(message);
        }
        else{
            message = "John Butuh Cari Uang!";
            System.out.println(message);
        }
        return message;
    }
}