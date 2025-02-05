import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder;
public class login
{
	private JFrame frame1 = new JFrame("Airline Reservation System");
	
	public login()
	{
        
		ImageIcon icon = new ImageIcon("smart.jpg");
		JLabel l1 = new JLabel(icon);
		l1.setBounds(40,25,500,150);
		//ImageIcon iconn = new ImageIcon("back.png");
		//JLabel limg = new JLabel(iconn);
		//limg.setBounds(5,10,50,50);
		
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
		
		
		
		
		
		
		
		
		JLabel l4 = new JLabel("Don't have an account !");
		l4.setForeground(Color.decode("#B768A2"));
		l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l4.setBounds(220,328,450,20);	
		
		l4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame1.setVisible(false);
                new signup();
            }

        });
		
		frame1.add(l1);
		frame1.add(tb1);
		frame1.add(tb2);
		frame1.add(l2);
		frame1.add(l3);
		frame1.add(l4);
		frame1.add(b1);
		//frame1.add(limg);
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
						PreparedStatement ps = conn.prepareStatement("Select username, password from authentication where username=? and password=?;");
						ps.setString(1,userName);
						ps.setString(2, password);
						ResultSet rs = ps.executeQuery();
						
						
						
						 if (rs.next()) {
							 
							
							    try (Statement stmt = conn.createStatement()) {
							     
							      
							        try
							        { 
							        	
							        	
							        
							        	JOptionPane.showMessageDialog(frame1, "You have successfully logged in");
							             Statement statement = conn.createStatement();
							             statement.executeUpdate("UPDATE authentication SET status = 'YES' WHERE username = '"+userName+"'");
							             frame1.setVisible(false);
							             home h=new home();
							             h.l1.setText(tb1.getText());
							        	
							        	
							        }
							        
				             catch (SQLException eee) {
						         System.out.print(eee);
				             }
							 
				             
				         } }
									
						    
						 
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
		new login();
	}
	
	
	
	

}


