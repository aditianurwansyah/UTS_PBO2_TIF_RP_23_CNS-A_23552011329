/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */
public class Nasabah {
    private int id;
    private String nama;
    private int umur;
    public Nasabah(int id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }
    public int getId() { 
        return id; 
    } 
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public int getUmur() { 
        return umur; 
    }
    public void setUmur(int umur) {
        this.umur = umur; 
    } 
}

