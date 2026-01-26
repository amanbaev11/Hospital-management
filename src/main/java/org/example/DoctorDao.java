package org.example;

import java.sql.*;

public class DoctorDao {

    public void insert(int id, String name, String sex, int age, String action) throws SQLException {
        String sql = "INSERT INTO doctors(doctor_id, name, sex, age, do_action) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Db.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, sex);
            ps.setInt(4, age);
            ps.setString(5, action);
            ps.executeUpdate();
        }
    }

    public void printAll() throws SQLException {
        String sql = "SELECT doctor_id, name, sex, age, do_action FROM doctors ORDER BY doctor_id";
        try (Connection con = Db.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("doctor_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("sex") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getString("do_action")
                );
            }
        }
    }

    public void updateAction(int id, String newAction) throws SQLException {
        String sql = "UPDATE doctors SET do_action = ? WHERE doctor_id = ?";
        try (Connection con = Db.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, newAction);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM doctors WHERE doctor_id = ?";
        try (Connection con = Db.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}