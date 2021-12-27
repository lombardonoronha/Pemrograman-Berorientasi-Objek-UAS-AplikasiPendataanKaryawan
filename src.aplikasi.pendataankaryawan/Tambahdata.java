/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipendataankaryawan;

import static apppendataankaryawan.AppPendataanKaryawan.input;
import static apppendataankaryawan.AppPendataanKaryawan.dataKaryawan;
/**
 *
 * @author Cracker
 */
public class TambahData {
    public static void TambahData(){
        System.out.println(" ");
        System.out.print("Masukkan Kode Karyawan             : ");
        String kode = input.next();

        System.out.print("Masukkan Nama Karyawan             : ");
        String nama = input.next();

        System.out.print("Masukkan Alamat                    : ");
        String alamat = input.next();

        System.out.print("Masukkan Tanggal Lahir             : ");
        String  tglLahir = input.next();

        System.out.print("Masukkan Golongan                  : ");
        String golongan = input.next();

        System.out.print("Masukkan Status kawin              : ");
        int status = input.nextInt();

        int jumlahAnak = 0;
        if(status == 1){
            System.out.print("Masukkan Jumlah Anak               : ");
            jumlahAnak = input.nextInt();
        }

        JenisKaryawan karyawan = new JenisKaryawan(kode, nama, alamat, tglLahir, golongan, status, jumlahAnak);
        dataKaryawan.add(karyawan);
        
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println("2.Tambah Data kembali");
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        int submenu = input.nextInt();
        switch(submenu){
            case 1:
                Menu.Menu();
            case 2:
                TambahData();
        }
    }
}