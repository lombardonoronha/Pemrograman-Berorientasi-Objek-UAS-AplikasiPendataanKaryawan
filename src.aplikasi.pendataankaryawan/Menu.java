/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipendataankaryawan;

import static apppendataankaryawan.AppPendataanKaryawan.input;

/**
 *
 * @author Cracker
 */
public class Menu {
    public static void Menu(){     
        System.out.println("Menu Utama");
        System.out.println("1.Tambah Data");
        System.out.println("2.Hapus Data");
        System.out.println("3.Cari Data");
        System.out.println("4.Lihat Data");
        System.out.println("5.Exit");
        System.out.println(" ");
        System.out.print("Menu pilihan: ");
        int menu = input.nextInt();
        switch(menu){
            case 1:
                TambahData.TambahData();
            case 2:
                HapusData.HapusData();
            case 3:
                CariData.CariData();
            case 4:
                LihatData.LihatData();
            case 5:
                System.exit(0);
        }
    }
}