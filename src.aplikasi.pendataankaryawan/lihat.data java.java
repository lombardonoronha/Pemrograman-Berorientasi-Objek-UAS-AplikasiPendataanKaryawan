/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipendataankaryawan;

import static apppendataankaryawan.AppPendataanKaryawan.dataKaryawan;
import static apppendataankaryawan.AppPendataanKaryawan.input;

/**
 *
 * @author Cracker
 */
public class LihatData {
    public static void LihatData(){
        JenisKaryawan karyawanLihat = new JenisKaryawan();
         
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("KODE KARY    NAMA KARY      GOL     USIA    STATUS KAWIN        JUMLAH ANAK");
        System.out.println("---------------------------------------------------------------------------");
        for(int i = 0; i < dataKaryawan.size();i++){
            karyawanLihat = dataKaryawan.get(i);
            System.out.println(karyawanLihat.getKode() + "          " + karyawanLihat.getNama() + "            " + karyawanLihat.getGolongan() + "        " + karyawanLihat.getUmur() + "      " + karyawanLihat.getStatusKaryawan() + "           "  +
                    karyawanLihat.getJumlahAnak());
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Jumlah data: " + dataKaryawan.size()); 
        System.out.println(" ");
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println(" ");
         
        System.out.print("Menu pilihan: ");
        int submenu = input.nextInt();
        switch(submenu){
            case 1:
                Menu.Menu();
        }
    } 
}