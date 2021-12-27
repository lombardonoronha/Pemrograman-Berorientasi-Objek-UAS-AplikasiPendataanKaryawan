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
public class HapusData {
    public static void HapusData(){
        System.out.print("Kode Karyawan yang mau dihapus:  ");
        String kode = input.next();
         
        for(int i = 0; i < dataKaryawan.size();i++){
            JenisKaryawan karyawanHapus = dataKaryawan.get(i);
            if(karyawanHapus.getKode().equals(kode)){
                dataKaryawan.remove(i);
            }
        }
        
        System.out.println(dataKaryawan.size());
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println("2.Hapus Data Kembali");
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        int submenu = input.nextInt();
        switch(submenu){
            case 1:
                Menu.Menu();
            case 2:
                HapusData();
        }
    }
}