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
import java.util.ArrayList;
import java.util.List;
public class NasabahDAO {
        public boolean insert(Nasabah nasabah) {
        String sql = "INSERT INTO nasabah (id, nama, umur) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, nasabah.getId());
            stmt.setString(2, nasabah.getNama());
            stmt.setInt(3, nasabah.getUmur());
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
        // Get Nasabah by Id
    public Nasabah getById(int id) {
        String sql = "SELECT * FROM nasabah WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Nasabah( 
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getInt("umur"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }
        // Update Nasabah
    public boolean update(Nasabah nasabah) {
        String sql = "UPDATE nasabah SET nama = ?, umur = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nasabah.getNama());
            stmt.setInt(2, nasabah.getUmur());
            stmt.setInt(3, nasabah.getId());
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete Nasabah
    public boolean delete(int id) {
        String sql = "DELETE FROM nasabah WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

} 
}
