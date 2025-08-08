package Day12JDBC;
import java.sql.*;
import java.util.Scanner;

public class PatientDetails {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    
      /*  try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb", "root", "Hema@123");

            String q = "INSERT INTO patient (name, age, disease, admission_date, doctor) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            String[][] patients = {
                {"Hema", "25", "Fever", "2025-08-02", "Dr. Ravi"},
                {"Charan", "32", "Infection", "2025-08-01", "Dr. Sita"},
                {"Bharati", "40", "Asthma", "2025-08-02", "Dr. Meena"}
            };

            for (String[] row : patients) {
                pstmt.setString(1, row[0]); 
                pstmt.setInt(2, Integer.parseInt(row[1])); 
                pstmt.setString(3, row[2]); 
                pstmt.setDate(4, Date.valueOf(row[3])); 
                pstmt.setString(5, row[4]); 
                pstmt.executeUpdate();
            }
            

            System.out.println("All patients registered successfully.");
            con.close();
            
            
          //toupdate
            // String query = "UPDATE patient SET disease = ?, WHERE name = ?";
           /* String[][] updateData = {
                    {"Hema", "Typhoid"},
                    {"Charan", "Cold"},
                    {"Bharati", "Allergy"}
                };

                // 5. Loop through the array and update records
                for (String[] p : updateData) {
                    pstmt.setString(1, p[1]); // disease
                    pstmt.setString(4, p[0]); // WHERE name = ?
                    pstmt.executeUpdate();
                }*/
            
    	try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb", "root", "Hema@123");

            String query = "INSERT INTO patient (name, age, disease, admission_date, doctor) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter Admission Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Enter Doctor Assigned: ");
            String doctor = sc.nextLine();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, disease);
            pstmt.setDate(4, Date.valueOf(date)); 
            pstmt.setString(5, doctor);

            pstmt.executeUpdate();

            System.out.println("Patient registered successfully.");

            pstmt.close();
            con.close();
            sc.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

