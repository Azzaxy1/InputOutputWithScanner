/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UTS;

import java.util.Scanner;

/**
 *
 * @author azis
 */
public class Datamahasiswa {

        public static void main(String[] args) {
                String nama, alamat, prodi;
                int umur, npm;

                // Membuat objek dari Class Scanner            
                Scanner input = new Scanner(System.in);

                System.out.println("-------------------------- ");
                System.out.println("===== DATA MAHASISWA ===== ");
                System.out.println("-------------------------- ");

                // Ini adalah Inputan
                System.out.print("Masukan NPM Anda       :  ");
                npm = input.nextInt();
                // Ini agar ketika setelah input int > string hasil output tidak kesamping 
                input.nextLine();
                System.out.print("Masukan Nama Anda      :  ");
                nama = input.nextLine();
                System.out.print("Masukan Prodi Anda     :  ");
                prodi = input.nextLine();
                System.out.print("Masukan Alamat Anda    :  ");
                alamat = input.nextLine();
                System.out.print("Masukan Umur Anda      :  ");
                umur = input.nextInt();

                // Ini adalah Output/Hasil inputan
                System.out.println();
                System.out.println("-------------------------- ");
                System.out.println("== HASIL DATA MAHASISWA == ");
                System.out.println("-------------------------- ");
                System.out.println("NPM                    : " + npm);
                System.out.println("Nama                   : " + nama);
                System.out.println("Prodi                  : " + prodi);
                System.out.println("Alamat                 : " + alamat);
                System.out.println("Umur                   : " + umur);
                System.out.println();
                System.out.println("(: TERIMA KASIH TELAH MENGISI :)");

        }
}