import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayEmpData
{
  public static void main(String[] args) 
  {
    try 
  {
      
    
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "Gayu123@");
    
      String query = "SELECT * FROM authentication";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "Name", "Mobile-No", "Username","Password" };
      String data[][] = new String[8][4];
    
      int i = 0;
      while (res.next()) {
        String id = res.getString("Name");
        String nom = res.getString("mobileno");
        String age = res.getString("Username");
        String pass = res.getString("Password");
        
        data[i][0] = id + "";
        data[i][1] = nom;
        data[i][2] = age;
        data[i][3] = pass;
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Populate JTable from Database");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setSize(500, 250);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}