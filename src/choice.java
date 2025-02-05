import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.border.MatteBorder;

public class choice {
	choice()
	{
		JFrame frame=new JFrame();
		
		ImageIcon icon = new ImageIcon("smart.jpg");
		JLabel l1 = new JLabel(icon);
		l1.setBounds(40,25,500,150);
		
		JButton b1=new JButton("Passenger Login");
		JButton b2=new JButton("Department Login");
		JButton b3=new JButton("Admin Login");
		b1.setBounds(195,200,200,30);
		b2.setBounds(195,250,200,30);
		b3.setBounds(195,300,200,30);
		b1.setBackground(Color.decode("#B768A2"));
		b1.setForeground(Color.BLACK);
		b1.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		b2.setBackground(Color.decode("#B768A2"));
		b2.setForeground(Color.BLACK);
		b2.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		b3.setBackground(Color.decode("#B768A2"));
		b3.setForeground(Color.BLACK);
		b3.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		b3.setFocusPainted(false);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(l1);
		
		
		b1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		
			  try {
				  frame.setVisible(false);
				  new login();
				 
			  }
			  
			  catch(Exception e2) {
				  
			  }
		  
		  }
		});
		
		
		b2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  
			 
			  try {
				  frame.setVisible(false);
				  new employeelogin();
				 
			  }
			  
			  catch(Exception e2) {
				  
			  }
				  
					  
		            
    
					  
			   
			  
		    
		  }
		});
		
		
		
		b3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  
			 
			  try {
				  frame.setVisible(false);
				  new adminlogin();
				 
			  }
			  
			  catch(Exception e2) {
				  
			  }
				  
					  
		            
    
					  
			   
			  
		    
		  }
		});
		
		
		
		
		//frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.decode("#B768A2")));
		//frame.setUndecorated(true);
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.decode("#00002f"));
		frame.setVisible(true);
		frame.setLayout(null);
		
	}
	public static void main(String args[])
	{
		new choice();
	}

}
