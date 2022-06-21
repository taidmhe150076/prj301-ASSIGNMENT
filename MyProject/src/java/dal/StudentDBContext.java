/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author Tai
 */
public class StudentDBContext extends DBContext<Student>{
 
   
    
    
    
    @Override
    public ArrayList<Student> list() {
        ArrayList<Student> students = new ArrayList<>();
        
        try {
            String sql = "select *from Student";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
            Student s = new Student();
            s.setStudentid(rs.getInt("StudentID"));
            s.setFirstname(rs.getString("FirstName"));
            s.setLastname(rs.getString("LastName"));
            s.setGender(rs.getBoolean("Gender"));
            s.setDate(rs.getDate("Dob"));
            students.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
    public static void main(String[] args) {
        StudentDBContext db = new StudentDBContext();
        ArrayList<Student> students = db.list();
        System.out.println(students.get(0).getStudentid());
    }

    @Override
    public Student get(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
