/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */
public class Jiwa extends Asuransi { 
    public Jiwa(int nasabahId, String jenis, double premi){
        super(nasabahId, jenis, premi);  
    }
     @Override
    public double hitungPremi() {
        // Contoh perhitungan premi asuransi jiwa
        return premi; 
    }
}
  