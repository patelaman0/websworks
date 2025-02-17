import java.sql.*;
import java.util.*;

class Slip20 {
    static int n;
    static Scanner s = new Scanner(System.in);

    public static void main(String obj[]) {
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish Connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("Connected!");

            // Create Table: Mobile (Model_No, Company_Name, Price, Color)
            PreparedStatement st = con.prepareStatement(
                "CREATE TABLE Mobile (Model_No VARCHAR(20), Company_Name VARCHAR(30), Price NUMBER, Color VARCHAR(20))"
            );
            st.executeUpdate();
            System.out.println("Table 'Mobile' Created!");

            // Insert Records
            System.out.print("\nEnter No of records you want to insert: ");
            n = s.nextInt();
            s.nextLine(); // Consume newline

            PreparedStatement st1 = con.prepareStatement("INSERT INTO Mobile VALUES(?, ?, ?, ?)");

            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter Model No: ");
                String modelNo = s.nextLine();
                System.out.print("Enter Company Name: ");
                String companyName = s.nextLine();
                System.out.print("Enter Price: ");
                double price = s.nextDouble();
                s.nextLine(); // Consume newline
                System.out.print("Enter Color: ");
                String color = s.nextLine();

                // Set values and execute insertion
                st1.setString(1, modelNo);
                st1.setString(2, companyName);
                st1.setDouble(3, price);
                st1.setString(4, color);
                st1.executeUpdate();

                System.out.println("Record Inserted!");
            }

            // Retrieve and Display Mobile Records with Price > 20000
            PreparedStatement st2 = con.prepareStatement("SELECT * FROM Mobile WHERE Price > 20000");
            ResultSet rs = st2.executeQuery();

            System.out.println("\n- Mobile Details with Price > 20000 -");
            while (rs.next()) {
                System.out.println(
                    "Model No: " + rs.getString(1) +
                    ", Company: " + rs.getString(2) +
                    ", Price: " + rs.getDouble(3) +
                    ", Color: " + rs.getString(4)
                );
            }

            // Close resources
            rs.close();
            st.close();
            st1.close();
            st2.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
