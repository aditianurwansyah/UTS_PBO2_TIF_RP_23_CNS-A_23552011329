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


public class PolisDAO {
   public boolean insert(Polis polis) {
        String sql = "INSERT INTO polis (id, nasabah_id, jenis, premi) VALUES (?, ?, ?, ?)"; 
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, polis.getId());
            stmt.setInt(2, polis.getNasabahId());
            stmt.setString(3, polis.getJenis());
            stmt.setDouble(4, polis.getPremi());

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

