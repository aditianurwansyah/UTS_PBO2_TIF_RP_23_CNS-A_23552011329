/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */
public abstract class Asuransi {
    protected int id;
    protected int nasabahId;
    protected String jenis;
    protected double premi;

    public Asuransi(int nasabahId, String jenis, double premi) {
        this.nasabahId = nasabahId; 
        this.jenis = jenis;
        this.premi = premi;
    }  
     public abstract double hitungPremi(); 
     
     public int getId() { 
         return id; 
     }
    public void setId(int id) { 
        this.id = id; 
    }
    public int getNasabahId() { 
        return nasabahId; 
    }
    public void setNasabahId(int nasabahId) { 
        this.nasabahId = nasabahId; 
    }
    public String getJenis() { 
        return jenis; 
    }
    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }
    public double getPremi() { 
        return premi; 
    }
    public void setPremi(double premi) { 
        this.premi = premi; 
    } 
}
