/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */

import java.util.Date;  
public class Klaim {
    private int id;
    private int polisId;
    private String tanggal;
    private String status;
    public Klaim(int id, int polisId, String tanggal, String status) {
        this.id = id; 
        this.polisId = polisId;
        this.tanggal = tanggal;
        this.status = status;
    }
    // Getter dan Setter
    public int getId() { 
        return id; 
    }
    public int getPolisId() { 
        return polisId; 
    }
    public void setPolisId(int polisId) { 
        this.polisId = polisId; 
    }
    public String getTanggal() {  
        return tanggal;  
    } 
    public void setTanggal(String tanggal){
        this.tanggal = tanggal; 
    }
    public String getStatus() { 
        return status; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    } 
}
 