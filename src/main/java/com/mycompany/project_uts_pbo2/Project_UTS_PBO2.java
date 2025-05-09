/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */

import java.util.Scanner; 
import java.sql.SQLException;  
import java.util.Date; 
import java.sql.*; 
public class Project_UTS_PBO2 {

    public static void main(String[] args) {
        
        NasabahDAO nasabahDAO = new NasabahDAO(); 
        PolisDAO polisDAO = new PolisDAO();
        KlaimDAO klaimDAO = new KlaimDAO(); 
        Scanner scan = new Scanner(System.in); 
        while(true){
            System.out.println("===== Selamat datang di kasir Asuransi ===========");
            System.out.println("Tuan dan nyonya apakah ada yang bisa dibantu? ====");
            System.out.println("====== 1. Tambah Nasabah =========================");
            System.out.println("====== 2. Tambah Polis ===========================");
            System.out.println("====== 3. Tambah Klaim ===========================");
            System.out.println("====== 4. Keluar =================================");
            System.out.println("Masukan pilihan anda: ");
            int pilihan = scan.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("Masukan ID: ");
                    int nasabahid = scan.nextInt();
                    System.out.println("Masukan Nama: ");
                    String nama = scan.next();
                    System.out.println("Masukan Umur: ");
                    int umur = scan.nextInt();
                    Nasabah nasabah = new Nasabah(nasabahid, nama, umur); 
                if (nasabahDAO.insert(nasabah)) {
                System.out.println("Nasabah berhasil disimpan.");
            } else {
                System.out.println("Gagal menyimpan Nasabah.");
                return; 
            }
            break;
                case 2:
                    System.out.println("Masukan ID polis: ");
                    int idpolis = scan.nextInt();
                    System.out.println("Masukan ID nasabah: ");
                    int idnasabah = scan.nextInt();
                    System.out.println("Jenis Asuransi: ");
                    String jenis = scan.next();
                    System.out.println("Biaya Premi: ");
                    Double premi = scan.nextDouble();
                    Polis polis = new Polis(idpolis, idnasabah, jenis, premi);
                    if (polisDAO.insert(polis)) {
                System.out.println("Polis berhasil disimpan.");
            } else {
                System.out.println("Gagal menyimpan Polis.");
                return;  
            } 
            break;
                case 3:
                    System.out.println("Masukan ID Klaim: ");
                    int ik = scan.nextInt();
                    System.out.println("Masukan ID polis: ");
                    int poid = scan.nextInt(); 
                    System.out.println("Masukan Tanggal: ");
                    String tanggal = scan.next(); 
                    System.out.println("Masukan status: ");
                    String status = scan.next();  
                 Klaim klaim = new Klaim(ik, poid, tanggal, status); 
                   if (klaimDAO.insert(klaim)) { 
                System.out.println("Klaim berhasil disimpan.");
            } else {
                System.out.println("Gagal menyimpan Klaim.");
                return; 
            }
                   break; 
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");    
            }
        }
}  
} 