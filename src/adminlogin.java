import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.MatteBorder;
public class adminlogin
{
	private JFrame frame1 = new JFrame("Airline Reservation System");
	
	public adminlogin()
	{
        
		ImageIcon icon = new ImageIcon("smart.jpg");
		JLabel l1 = new JLabel(icon);
		l1.setBounds(40,25,500,150);
		JTextField tb1 = new JTextField(20);
		tb1.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb1.setBounds(270,200,180,25);
		JTextField tb2 = new JTextField(20);
		tb2.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb2.setBounds(270,240,180,25);
		JLabel l2 =new JLabel("USERNAME ");
		l2.setForeground(Color.WHITE);
		l2.setBounds(180,200,180,25);
		JLabel l3 =new JLabel("PASSWORD ");
		l3.setForeground(Color.WHITE);
		l3.setBounds(180,240,180,25);
		JButton b1 =new JButton("LOGIN");
		b1.setBounds(220,300,80,25);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        b1.setBackground(Color.decode("#B768A2"));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        b1.setBackground(UIManager.getColor("control"));
		    }
		});
		
		
		
		
		
		
		
		
	
		
		frame1.add(l1);
		frame1.add(tb1);
		frame1.add(tb2);
		frame1.add(l2);
		frame1.add(l3);
		
		frame1.add(b1);
		
		frame1.setLayout(null);
		frame1.setSize(600,600);
		frame1.setLocationRelativeTo(null);
		frame1.getContentPane().setBackground(Color.decode("#00002f"));
		frame1.setVisible(true);
		
		
		b1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  String userName = tb1.getText();
					String password = tb2.getText();
					if(userName=="" && password=="")
					{
						JOptionPane.showMessageDialog(frame1, "Invalid Input");
					}
					try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						

						Connection conn =        DriverManager.getConnection("jdbc:mysql://localhost/raw","root","Gayu123@");
						PreparedStatement ps = conn.prepareStatement("Select username, password from admin where username=? and password=?;");
						ps.setString(1,userName);
						ps.setString(2, password);
						ResultSet rs = ps.executeQuery();
						
						 if (rs.next()) {
							 
				             
				             JOptionPane.showMessageDialog(frame1, "You have successfully logged in");
				             frame1.setVisible(false);
				             adminhome h=new adminhome();
				             h.lu.setText(tb1.getText());
							 
				             
				         } 
						 
						 
						 else {
				             JOptionPane.showMessageDialog(frame1, "Invalid Credentials");
				             tb1.setText(null);
				             tb2.setText(null);
				         }
						
					}
					catch(Exception e1)
					{
						System.out.println("Connection Unsuccessfull");
						JOptionPane.showMessageDialog(frame1, "Database Error");
					}
		        }
		        catch(Exception e1) {
		            System.out.print("Do not connect to DB - Error:"+e1);
		        }
		  }
		});
		
	
	}
	public static void main(String args[])
	{
		new adminlogin();
	}
	
	
	
	

}





