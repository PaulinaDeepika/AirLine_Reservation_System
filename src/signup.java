 import java.awt.Color;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder;
public class signup
{
	private JFrame frame = new JFrame("Airline Reservation System");
	JTextField tb3;
	public signup()
	{
		
		
		
		
		
		ImageIcon icon = new ImageIcon("smart.jpg");
		JLabel l1 = new JLabel(icon);
		l1.setBounds(40,25,500,150);
		JTextField tb1 = new JTextField(40);
		tb1.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb1.setBounds(270,200,180,25);
		JTextField tb2 = new JTextField(40);
		tb2.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb2.setBounds(270,240,180,25);
		JLabel l2 =new JLabel("NAME ");
		l2.setForeground(Color.WHITE);
		l2.setBounds(180,200,180,25);
		JLabel l3 =new JLabel("MOBILE-NO ");
		l3.setForeground(Color.WHITE);
		l3.setBounds(180,240,180,25);
		
		tb3 = new JTextField(40);//need to be continued*********************//
		tb3.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb3.setBounds(270,280,180,25);
		JTextField tb4 = new JTextField(40);
		tb4.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		tb4.setBounds(270,320,180,25);
		JLabel l4 =new JLabel("USERNAME ");
		l4.setForeground(Color.WHITE);
		l4.setBounds(180,280,180,25);
		JLabel l5 =new JLabel("PASSWORD ");
		l5.setForeground(Color.WHITE);
		l5.setBounds(180,320,180,25);
		
		JButton b1 =new JButton("SIGN UP");
		b1.setBounds(220,360,80,25);
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
		
		
		
		
		b1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  
			 
			  try {
				  String tname=tb3.getText();
					  Class.forName("com.mysql.jdbc.Driver");
			            Connection conn = null;
			            conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "Gayu123@");
			            System.out.print("Database is connected !");
			            Statement statement = conn.createStatement();
			           
			            statement.executeUpdate("INSERT INTO authentication VALUES('" + tb1.getText() + "','" + tb2.getText() + "','" + tb3.getText() + "','" + tb4.getText() + "','"+"No"+"')");  
			            String tableN=String.format("CREATE TABLE %s(name varchar(50), flight_name varchar(100), flight_no varchar(10), date varchar(40), departure varchar(15), arrival varchar(15), source varchar(20), destination varchar(20), pnr varchar(11), class varchar(40), Check_In varchar(10) DEFAULT 'No', fare integer(10) )",tname);
				        statement.execute(tableN);
				           
				             
			            	JOptionPane.showMessageDialog(null, "Sign-UP Successfull..."); 
			            	frame.setVisible(false);
			            	new login();
				            statement.close();  
				            tb1.setText(null);
				            tb2.setText(null);
				            tb3.setText(null);
				            tb4.setText(null);
				            conn.close();
				 
			  }
			  
			  catch(Exception e2) {
				  
			  }
				  
					  
		            
    
					  
			   
			  
		    
		  }
		});
		
		
		
		
		
		
		
		
		
		JLabel l6 = new JLabel("Already have an account !");
		l6.setForeground(Color.decode("#B768A2"));
		l6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l6.setBounds(220,387,450,20);	
		
		l6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               frame.setVisible(false);
               new login();
            }

        });
		
		
		frame.add(l1);
		frame.add(tb1);
		frame.add(tb2);
		frame.add(tb3);
		frame.add(tb4);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(b1);
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.decode("#00002f"));
		frame.setVisible(true);
		
		
		
	
	

	}
	public static void main(String args[])
	{
		new signup();
	}
	
	
	

}


