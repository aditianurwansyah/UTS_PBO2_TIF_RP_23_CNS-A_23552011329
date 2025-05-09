/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_uts_pbo2;

/**
 *
 * @author Aditia Nurwansyah
 */
import java.sql.*;

import java.time.LocalDate;
import java.time.ZoneId;

public class KlaimDAO {
     public boolean insert(Klaim klaim) {
        String sql = "INSERT INTO klaim (id, polis_id, tanggal, status) VALUES (?, ?, ?, ?)"; 
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, klaim.getId());
            stmt.setInt(2, klaim.getPolisId());
            stmt.setString(3, klaim.getTanggal());  
            stmt.setString(4, klaim.getStatus());

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
}
