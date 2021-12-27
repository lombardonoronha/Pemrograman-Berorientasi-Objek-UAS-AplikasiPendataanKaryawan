/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipendataankaryawan;

import aplikasipendataankaryawan.JenisKaryawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cracker
 */
public class AppPendataanKaryawan {
    static ArrayList<JenisKaryawan> dataKaryawan = new ArrayList<JenisKaryawan>();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Menu.Menu();
    }
}