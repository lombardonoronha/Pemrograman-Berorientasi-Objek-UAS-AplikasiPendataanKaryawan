/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apikasipendataankaryawan;

import static apppendataankaryawan.AppPendataanKaryawan.dataKaryawan;
import static apppendataankaryawan.AppPendataanKaryawan.input;
/**
 *
 * @author Cracker
 */
public class CariData {
    public static void CariData(){
        System.out.print("Masukkan Kode Karyawan:  ");
        String kode = input.next();
        
        JenisKaryawan cariKaryawan = new JenisKaryawan();
 
        for(int i = 0; i < dataKaryawan.size();i++){
            cariKaryawan = dataKaryawan.get(i);
            if(cariKaryawan.getKode().equals(kode)){
                break;
            }
        }
        
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("-----------------------------------");
        System.out.println("Kode Karyawan          :" + cariKaryawan.getKode());
        System.out.println("Nama Karyawan          :" + cariKaryawan.getNama());
        System.out.println("Golongan               :" +  cariKaryawan.getGolongan());
        System.out.println("Umur                   :" +  cariKaryawan.getUmur());
        System.out.println("Status kawin           :" +  cariKaryawan.getStatusKaryawan());
        System.out.println("Jumlah Anak            :" +  cariKaryawan.getJumlahAnak());
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok             :Rp" + cariKaryawan.hitungGajiPokok());
        System.out.println("Tunjangan Istri/Suami  :Rp" + cariKaryawan.tunjanganMenikah());
        System.out.println("Tunjangan Pegawai      :Rp" + cariKaryawan.tunjanganPegawai());
        System.out.println("Tunjangan Anak         :Rp" + cariKaryawan.tunjanganAnak());
        System.out.println("----------------------------------- +");
        System.out.println("Gaji Kotor             :Rp" + cariKaryawan.hitungGajiKotor());
        System.out.println("Potongan               :Rp" + cariKaryawan.potongan());
        System.out.println("----------------------------------- -");
        System.out.println("Gaji Bersih            :Rp" + cariKaryawan.hitungGajiBersih()); 
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