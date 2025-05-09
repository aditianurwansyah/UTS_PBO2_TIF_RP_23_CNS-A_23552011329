/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */
public class Polis {
   private int id;
    private int nasabahId;
    private String jenis;
    private double premi;
    public Polis(int id, int nasabahId, String jenis, double premi) {
        this.id = id;
        this.nasabahId = nasabahId;
        this.jenis = jenis;
        this.premi = premi;
    }

    public int getId() {
        return id;
    }

    public int getNasabahId() {
        return nasabahId;
    }
    public void setNasabahId(int nasabahId){
        this.nasabahId = nasabahId; 
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public double getPremi() {
        return premi;
    } 
    public void setPremi(double premi){
        this.premi = premi; 
    }
} 
