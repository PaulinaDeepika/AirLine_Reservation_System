import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.xdevapi.Table;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;



public class accountshome {
	JTextField lu;
	
	JTable j;
	
	JButton b2,b3,b4,b5,b6;
	
	JLabel l2,src1,dst1,date,Class1,trv;
	
	JCalendar clnd;
	private TableRowSorter sorter;
	
	JComboBox<?> classes,travellers;
	

	private JFrame frame2=new JFrame("Airline Reservation System");
	public accountshome() 
	{
		 
		JPanel panel=new JPanel();  
        panel.setBounds(1,1,300,791);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#00002f")); 
        
        JPanel panel1=new JPanel();
        panel1.setBounds(301, 1, 1234, 791);
        panel1.setLayout(null);
        panel1.setBackground(Color.black); 
        panel1.setVisible(false);
        
        
        JPanel newacc=new JPanel();
        newacc.setBounds(301, 1, 1234, 791);
        newacc.setLayout(null);
        newacc.setBackground(Color.black); 
        newacc.setVisible(false);
        
        
        //*********************************************TRACK REVENUE GUI***********************************//
        
        
        
        
        JPanel tr=new JPanel();//...Track Revenue Menu Pannel...//
        tr.setBounds(301,1,1234,791);
        tr.setLayout(null);
        tr.setBackground(Color.black);
        tr.setVisible(false);
        
        JPanel sr=new JPanel();//...Upper Half...//
        sr.setBounds(301,1,1234,220);
        sr.setLayout(null);
        sr.setBackground(Color.decode("#fdfaf1"));
        sr.setVisible(false);
        frame2.add(sr);
        frame2.add(tr);
        
        
        JPanel srd=new JPanel();//...Lower Half...//
        srd.setBounds(301,230,1234,561);
        srd.setLayout(null);
        srd.setBackground(Color.decode("#fdfaf1"));
        srd.setVisible(false);
        frame2.add(srd);
        
        JLabel srclabuh=new JLabel("Source");
		srclabuh.setForeground(Color.black);
		srclabuh.setBounds(2,180,42,30);
		srclabuh.setVisible(true);
		sr.add(srclabuh);
		
		JLabel dstlabuh=new JLabel("Destination");
		dstlabuh.setForeground(Color.black);
		dstlabuh.setBounds(370,180,100,30);
		dstlabuh.setVisible(true);
		sr.add(dstlabuh);
		
		JLabel datelabuh=new JLabel("Date");
		datelabuh.setForeground(Color.black);
		datelabuh.setBounds(760,180,100,30);
		datelabuh.setVisible(true);
		sr.add(datelabuh);
        
        
        String cityy[]= {"Pune","Mumbai","New Delhi","Chandigarh","Banglore","Chennai","UAE","USA","Canada","Singapore","Malaysia"};
        JComboBox<?> srcc=new JComboBox<Object>(cityy);
        JComboBox<?> dstt=new JComboBox<Object>(cityy);
        srcc.setBounds(50,180,200,30);
        dstt.setBounds(440,180,200,30);
        sr.add(srcc);
        sr.add(dstt);
        
        
        String trmenu[]= {"Single Route (24X7)", "Multi-Route (24X7)", "TOTAL ESTIMATION"};
        JComboBox<?> trmnu=new JComboBox<Object>(trmenu);
        trmnu.setBounds(2,180,200,30);
        tr.add(trmnu);
        
        JDateChooser dd=new JDateChooser();
        dd.setBounds(790,180,200,30);
        sr.add(dd);
        
        JTextField srchh=new JTextField();
	    srchh.setBackground(Color.white);
	    srchh.setForeground(Color.black);
	    srchh.setBounds(645,10,70,30);
	    srchh.setVisible(false);
	    srd.add(srchh);
        
        JButton prtt=new JButton("Print");
	    prtt.setBackground(Color.white);
	    prtt.setForeground(Color.black);
	    prtt.setBounds(647,450,70,30);
	    prtt.setFocusPainted(false);
	    prtt.setVisible(false);
	    srd.add(prtt);
	        
	    JLabel total=new JLabel("TOTAL = ");
		total.setBackground(Color.black);
		total.setForeground(Color.black);
		total.setBounds(2,20,70,30);
		total.setVisible(false);
		srd.add(total);
		
		JLabel ttl=new JLabel();
	    ttl.setBackground(Color.black);
	    ttl.setForeground(Color.black);
	    ttl.setBounds(60,20,70,30);
	    ttl.setVisible(false);
	    srd.add(ttl);
        
        JButton trackk=new JButton("Track");
        trackk.setForeground(Color.black);
        trackk.setBounds(1150,180,70,30);
        sr.add(trackk);
        //*********************************************TRACK REVENUE GUI***********************************//
        
        
        
        
        
        //*********************************************TRACK BOOKINGS GUI***********************************//
        JPanel tb=new JPanel();
        tb.setBounds(301,1,1234,791);
        tb.setLayout(null);
        tb.setBackground(Color.black);
        tb.setVisible(false);
        
        JPanel tb1=new JPanel();
        tb1.setBounds(301,1,1234,220);
        tb1.setLayout(null);
        tb1.setBackground(Color.cyan);
        tb1.setVisible(false);
        frame2.add(tb1);
        
        
        
        JPanel tb2=new JPanel();
        tb2.setBounds(301,230,1234,561);
        tb2.setLayout(null);
        tb2.setBackground(Color.cyan);
        tb2.setVisible(false);
        frame2.add(tb2);
        
        
        frame2.add(tb);
        
        String city[]= {"Pune","Mumbai","New Delhi","Chandigarh","Banglore","Chennai","UAE","USA","Canada","Singapore","Malaysia"};
        JComboBox<?> src=new JComboBox<Object>(city);
        JComboBox<?> dst=new JComboBox<Object>(city);
        src.setBounds(2,180,200,30);
        dst.setBounds(217,180,200,30);
        tb1.add(src);
        tb1.add(dst);
        
        JTextField srch=new JTextField();
	     srch.setBackground(Color.white);
	        srch.setForeground(Color.black);
	        srch.setBounds(1132,2,100,30);
	        srch.setVisible(false);
	        tb2.add(srch);
        
        JButton prt=new JButton("Print");
	     prt.setBackground(Color.white);
	        prt.setForeground(Color.black);
	        prt.setBounds(1160,745,70,30);
	        prt.setVisible(false);
	        tb2.add(prt);
        
        JButton track=new JButton("Track");
        track.setBackground(Color.white);
        track.setForeground(Color.black);
        track.setBounds(440,150,70,30);
        tb1.add(track);
        //*********************************************TRACK BOOKINGS GUI***********************************//
        
        
        
        
        JPanel ticket=new JPanel();
        ticket.setBounds(301,1,1234,791);
        ticket.setBackground(Color.white);
        ticket.setLayout(null);
        frame2.add(ticket);
        ticket.setVisible(false);
        
        JPanel header=new JPanel();
        header.setBounds(0,0,1300,115);
        header.setBackground(Color.decode("#ff6600"));
        header.setLayout(null);
        ticket.add(header);
        
        ImageIcon headerimg=new ImageIcon("headerfinal.png");
        JLabel lheader=new JLabel(headerimg);
        lheader.setBounds(2,2,800,100);
        header.add(lheader);
        
        JPanel nameinfo=new JPanel();
        nameinfo.setLayout(null);
        nameinfo.setBackground(Color.decode("#ff6600"));
        nameinfo.setBounds(0,300,1300,40);
        ticket.add(nameinfo);
        
        JLabel h1=new JLabel("PASSENGER  AND  TICKET  INFORMATION");
        h1.setForeground(Color.black);
        h1.setFont(new Font("Arial", Font.BOLD, 16));
        h1.setBounds(5,5,400,30);
        nameinfo.add(h1);
        
        
        JPanel fl=new JPanel();
        fl.setBounds(5,405,1225,100);
        fl.setBackground(Color.white);
        fl.setLayout(null);
        fl.setVisible(false);
        
        JPanel bookings=new JPanel();
        bookings.setBounds(301,1,1234,791);
        bookings.setLayout(null);
        bookings.setBackground(Color.white);
        
        bookings.setBackground(Color.black);
        //bookings.setBorder(blackline);
        bookings.setVisible(false);
        
        
        JButton printb=new JButton("Print");
        printb.setBounds(100,200,70,30);
        ticket.add(printb);
        
        JButton logout=new JButton("Logout");
        logout.setForeground(Color.black);
        logout.setBackground(Color.white);
        logout.setBounds(550,280,100,30);
        panel1.add(logout);
        
        JPanel cnfrm = new JPanel();
        cnfrm.setBounds(301,1,1234,791);
        cnfrm.setLayout(null);
        cnfrm.setBackground(Color.black);
        cnfrm.setVisible(false);
        
        
       
        
       
        JDateChooser d=new JDateChooser();
        d.setBounds(440,150,200,30);
        newacc.add(d);
        
        String clas[]= {"Economy","Premium Economy","Business","First Class"};
        classes=new JComboBox<Object>(clas);
        classes.setBounds(655,150,200,30);
        newacc.add(classes);
        
        

        String trvl[]= {"1","2","3"};
        travellers=new JComboBox<Object>(trvl);
        travellers.setBounds(870,150,200,30);
        newacc.add(travellers);
        
        src1=new JLabel("Source*");
        src1.setForeground(Color.white);
        src1.setBounds(10,120,100,30);
        newacc.add(src1);
        dst1=new JLabel("Destination*");
        dst1.setForeground(Color.white);
        dst1.setBounds(225,120,100,30);
        newacc.add(dst1);
        date=new JLabel("Date");
        date.setForeground(Color.white);
        date.setBounds(440,120,100,30);
        newacc.add(date);
        Class1=new JLabel("Class");
        Class1.setForeground(Color.white);
        Class1.setBounds(655,120,100,30);
        newacc.add(Class1);
        trv=new JLabel("Travellers");
        trv.setForeground(Color.white);
        trv.setBounds(870,120,100,30);
        newacc.add(trv);
        
        JButton b1 =new JButton("Search");
		b1.setBounds(1085,150,100,30);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b1.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		newacc.add(b1);
        
        
        ImageIcon icon = new ImageIcon("circle.png");
		JLabel l = new JLabel(icon);
		l.setBounds(490,0,220,220);
		panel1.add(l);
		
		
		ImageIcon iconn = new ImageIcon("smart.jpg");
		JLabel ic=new JLabel(iconn);
		ic.setBounds(50,16,205,150);
		panel.add(ic);
		
		JLabel l3=new JLabel("E_ID: ");
		l3.setForeground(Color.WHITE);
		l3.setBounds(535,200,40,30);
		panel1.add(l3);
		JLabel l4=new JLabel("Dept: ");
		l4.setForeground(Color.WHITE);
		l4.setBounds(535,235,50,30);
		panel1.add(l4);
		JLabel name = new JLabel();
		name.setForeground(Color.WHITE);
	    name.setBounds(570,200,100,30);
		panel1.add(name);
		JLabel mobile = new JLabel();
		mobile.setForeground(Color.WHITE);
		mobile.setBounds(572,235,100,30);
		panel1.add(mobile);
		
		JLabel l2=new JLabel("International Flight Booking");
		l2.setFont(new Font("Arial", Font.BOLD, 20));
		l2.setForeground(Color.red);
		l2.setBounds(480,10,270,30);
		newacc.add(l2);
		
		
		lu = new JTextField(40);
		lu.setFont(new Font("Arial", Font.BOLD, 16));
		lu.setBackground(Color.black);
		lu.setForeground(Color.white);
		lu.setHorizontalAlignment(JTextField.CENTER);
		lu.setBounds(0,180,300,30);
		lu.setEnabled(false);
		panel.add(lu);
		
		
		
		
		b2=new JButton("Track Revenue");
		b2.setFocusPainted(false);
		b2.setBounds(0,300,300,30);
		b2.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		//b2.setBackground(Color.decode("#B768A2"));
		panel.add(b2);
		b3=new JButton("Track Bookings");
		b3.setFocusPainted(false);
		b3.setBounds(0,340,300,30);
		b3.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b3);
		b4=new JButton("Users");
		b4.setFocusPainted(false);
		b4.setBounds(0,380,300,30);
		b4.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b4);
		b5=new JButton("Account");
		b5.setFocusPainted(false);
		b5.setBounds(0,420,300,30);
		b5.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b5);
		b6=new JButton("Maintenance");
		b6.setFocusPainted(false);
		b6.setBounds(0,460,300,30);
		b6.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b6);
		
		
		
		frame2.add(panel);
		frame2.add(newacc);
		frame2.add(bookings);
		
		
		
		
		
   	      
		
		
		
		
		
		
		
		frame2.add(panel1);
		frame2.setLayout(null);
		frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame2.setVisible(true);
		frame2.getContentPane().setBackground(Color.BLACK);
		
		
		
		
		
		b5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  
					String username = lu.getText();
					
					try
					{
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						

						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","Gayu123@");
						PreparedStatement ps = conn.prepareStatement("Select empid,department from employees where username=?;");
						ps.setString(1,username);
						
						ResultSet rs = ps.executeQuery();
						if (rs.next()) {
				             
				            
				             name.setText(rs.getString(1));
				             mobile.setText(rs.getString(2));
				             
				             
				              
				             
				         }
						
						
					}
					catch(Exception e1)
					{
						System.out.println("Connection Unsuccessfull");
						JOptionPane.showMessageDialog(frame2, "Database Error");
					}
		        }
		        catch(Exception e1) {
		            System.out.print("Do not connect to DB - Error:"+e1);
		        }
		  }
		});
		
		
		
		
		
		b5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  tb.setVisible(false);
				  tr.setVisible(false);
				  tb1.setVisible(false);
		           newacc.setVisible(false);
		           bookings.setVisible(false);
		           ticket.setVisible(false);
		           cnfrm.setVisible(false);
		           panel1.setVisible(true);
		            
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		
		
	    
	
		
		
		logout.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
		           frame2.setVisible(false);
		           new choice();
		            
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		

		
//***********************************************************TRACK REVENUE RECORDS**************************************************//		
				b2.addActionListener(new ActionListener()
				{
				  public void actionPerformed(ActionEvent e)
				  {
					  try {
						  srcc.setSelectedItem(null);
	                        dstt.setSelectedItem(null);
	                        
						 sr.setVisible(false);
						 srd.setVisible(false);
						  tr.setVisible(true);
						  tb.setVisible(false);
						  ticket.setVisible(false);
						  newacc.setVisible(false);
						  panel1.setVisible(false);
						  bookings.setVisible(false);
						 
						  fl.setVisible(false);
						  cnfrm.setVisible(false);
						  
						  
						  
						  
						  
						  
						  trmnu.addActionListener(new ActionListener() {//add actionlistner to listen for change
					            @Override
					            public void actionPerformed(ActionEvent e) {    
					                String s = (String) trmnu.getSelectedItem();//get the selected item    
					                switch (s) {//check for a match
					                    case "Single Route (24X7)":
					                        tr.setVisible(false);
					                        tb2.setVisible(false);
					                        srd.removeAll();
					                        sr.setVisible(true);
					                        
					                        
					                        break;
					                    //case "Week":
					                      //  emailvalue = 4;                            
					                      //  break;
					                   // case "Month":
					                      //  emailvalue = 1;
					                      //  System.out.println("Month selected, emailvalue:" + emailvalue);
					                      //  break;      
					                        
					                        
					                        
					                        
					                        
					                        
					                        
					                        
					                        
					                }
					           
						  
						  
						  
						  trackk.addActionListener(new ActionListener()
							{
							  public void actionPerformed(ActionEvent e)
							  {
								  SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-YYYY");
								  
								  String sc=(String) srcc.getSelectedItem();
								  String dt=(String) dstt.getSelectedItem();
								
								
								  try
								  {
									 
									  if(sc.equals(null)&&dt.equals(null))
									  {
										  JOptionPane.showMessageDialog(null, e);  
									  }
									  String dte=dcn.format(dd.getDate());
									  
									 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "");
									    
								      PreparedStatement ps = con.prepareStatement("SELECT * FROM bookings where source=? and destination=? and date=?;");
								      ps.setString(1,sc);
									   ps.setString(2, dt);
									   ps.setString(3, dte);
								    
								      con.createStatement();
								      ResultSet res = ps.executeQuery();
								    
								      String columns[] = { "NAME","Flight_No","PNR","FARE" };
								      DefaultTableModel modell = new DefaultTableModel();
								        modell.setColumnIdentifiers(columns);
								        srd.setVisible(true);
								      
								      while (res.next()) {
								        
								    	String nmm = res.getString("Name");
								    	String fnno = res.getString("flight_no");
								        String pnr = res.getString("PNR");	
								        String checkin = res.getString("fare");
								        modell.addRow(new Object[]{nmm,fnno, pnr, checkin});
						                
						                prtt.setVisible(true);
						                srchh.setVisible(true);
						               
						               
						                total.setVisible(true);
						                ttl.setVisible(true);
						                
						                
						                
									      JTable tablee = new JTable(modell);
									      tablee.setShowGrid(true);
									      tablee.setShowVerticalLines(true);
									      tablee.setBackground(Color.black);
									      tablee.setForeground(Color.cyan);
									      sorter = new TableRowSorter<>(modell);
									      tablee.setRowSorter(sorter);
									      
									     
									      
									     
									    
													  
													  int sum = 0;
												        for(int ii = 0; ii < tablee.getRowCount(); ii++)
												        {
												            sum = sum + Integer.parseInt(tablee.getValueAt(ii, 3).toString());
												        }
												        ttl.setText(null);
												        ttl.setText(Integer.toString(sum));
												        
												        
												        JScrollPane pane = new JScrollPane(tablee);
													      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
													      centerRenderer.setHorizontalAlignment( JLabel.CENTER );
													      tablee.setDefaultRenderer(String.class, centerRenderer);
													     tablee.setFont(new Font("Arial", Font.BOLD, 12));
													      tablee.getTableHeader().setBackground(Color.red);
													      tablee.getTableHeader().setForeground(Color.white);
													      tablee.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
													      tablee.setEnabled(false);
													      
													      pane.setBounds(2,71,1234,400);
														     
													      srd.add(pane);
													      
												   
									      
									    
									      
									      
									      
									      prt.addActionListener(new ActionListener()
											{
											  public void actionPerformed(ActionEvent e)
											  {
												  try {
													 tablee.print(JTable.PrintMode.NORMAL);
											           
											        }
												  catch (Exception e1) {  
												        JOptionPane.showMessageDialog(null, e1);  
												    }  
											    
											  }
											});
									     
									      
						                
								      }
								      
									        
									        
								    
								     
								      
								      
								      srchh.getDocument().addDocumentListener(new DocumentListener() {
								          @Override
								          public void insertUpdate(DocumentEvent e) {
								             search(srchh.getText());
								          }
								          @Override
								          public void removeUpdate(DocumentEvent e) {
								             search(srchh.getText());
								          }
								          @Override
								          public void changedUpdate(DocumentEvent e) {
								             search(srchh.getText());
								          }
								          public void search(String str) {
								             if (str.length() == 0) {
								                sorter.setRowFilter(null);
								             } else {
								                sorter.setRowFilter(RowFilter.regexFilter(str));
								             }
								          }
								       });
								      
								      
								      
								     
								     
								     
									       
								     

								             
								  }
								  
								  catch(Exception e3)
								  {
									  
								  }
											
								
								 
								 
							  }
							});
					
					
						  
					            }
					        });
						  
				           
				        }
					            
					  catch (Exception e1) {  
					        JOptionPane.showMessageDialog(null, e1);  
					    }  
					  
				    
				  }
				});
						  
						  
				
				
				
				
				
				
//***********************************************************TRACK REVENUE RECORDS**************************************************//		
						
	
		
		
	
		
		
		
		
		
		
		
//***********************************************************TRACK BOOKINGS RECORDS**************************************************//		
	
		
		
		
		b3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  tb1.add(src);
			  tb1.setVisible(true);
			  tb2.removeAll();
			  srd.setVisible(false);
			  src.setSelectedItem(null);
			  dst.setSelectedItem(null);
			  tr.setVisible(false);
			  sr.setVisible(false);
			  ticket.setVisible(false);
			  newacc.setVisible(false);
			  panel1.setVisible(false);
			  bookings.setVisible(false);
			  tb.setVisible(true);
			  
			  
			  fl.setVisible(false);
			  cnfrm.setVisible(false);
			  JTable table = new JTable();
			  table.setModel(new DefaultTableModel(null,new String[] {"Name","Flight_Name","Flight_No","Date","Departure","Arrival","Source","Destination","Class","PNR","Check-In"}));
			  
			  try {
				  
				  
				  
				  
				  
				  track.addActionListener(new ActionListener()
					{
					  public void actionPerformed(ActionEvent e)
					  {
						  
						  tb2.setVisible(true);
						  table.setVisible(false);
						  String sc=(String) src.getSelectedItem();
						  String dt=(String) dst.getSelectedItem();
						
						  try
						  {
							 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "");
							    
						      PreparedStatement ps = con.prepareStatement("SELECT * FROM bookings where source=? and destination=?;");
						      ps.setString(1,sc);
							   ps.setString(2, dt);
						    
						      con.createStatement();
						      ResultSet res = ps.executeQuery();
						    
						      String columns[] = { "Name","Flight_Name","Flight_No","Date","Departure","Arrival","Source","Destination","Class","PNR","Check-In" };
						      DefaultTableModel model = new DefaultTableModel();
						        model.setColumnIdentifiers(columns);
						      
						      while (res.next()) {
						    	  
						        String n = res.getString("Name");
						        String fnm = res.getString("Flight_name");
						        String fno = res.getString("Flight_no");
						        String dtt = res.getString("Date");
						        String dp = res.getString("Departure");
						        String ar = res.getString("Arrival");
						        String sr = res.getString("Source");
						        String dst = res.getString("Destination");
						        String cl = res.getString("Class");
						        String pnr = res.getString("PNR");	
						        String checkin = res.getString("Check_In");
						        model.addRow(new Object[]{n, fnm, fno, dtt, dp, ar, sr, dst, cl, pnr, checkin});
				                prt.setVisible(true);
				                srch.setVisible(true);
				                
						      }
						      
							        
							        
						    
						      
						      
						      
						      table.setModel(model);
						      table.setShowGrid(true);
						      table.setShowVerticalLines(true);
						      table.setShowHorizontalLines(true);
						      table.setBackground(Color.black);
						      table.setForeground(Color.cyan);
						      sorter = new TableRowSorter<>(model);
						      table.setRowSorter(sorter);
						      
						      srch.getDocument().addDocumentListener(new DocumentListener() {
						          @Override
						          public void insertUpdate(DocumentEvent e) {
						             search(srch.getText());
						          }
						          @Override
						          public void removeUpdate(DocumentEvent e) {
						             search(srch.getText());
						          }
						          @Override
						          public void changedUpdate(DocumentEvent e) {
						             search(srch.getText());
						          }
						          public void search(String str) {
						             if (str.length() == 0) {
						                sorter.setRowFilter(null);
						             } else {
						                sorter.setRowFilter(RowFilter.regexFilter(str));
						             }
						          }
						       });
						      
						      
						      
						     
						      JScrollPane pane = new JScrollPane(table);
						      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
						      centerRenderer.setHorizontalAlignment( JLabel.CENTER );
						      table.setDefaultRenderer(String.class, centerRenderer);
						     table.setFont(new Font("Arial", Font.BOLD, 12));
						      table.getTableHeader().setBackground(Color.red);
						      table.getTableHeader().setForeground(Color.white);
						      table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
						      table.setEnabled(false);
						      table.setVisible(true);
						      
						     pane.setBounds(2,50,715,400);
						     
						      tb2.add(pane);
						      
						      prt.addActionListener(new ActionListener()
								{
								  
								public void actionPerformed(ActionEvent e)
								  {
									  try {
										 table.print(JTable.PrintMode.NORMAL);
								           
								        }
									  catch (Exception e1) {  
									        JOptionPane.showMessageDialog(null, e1);  
									    }  
									
									  
								  }
								});
						     
							       
						     

						             
						  }
						  
						  catch(Exception e3)
						  {
							  
						  }
									
						  
						  
						 
					  }
					});
			
				  
				  
				  
		           
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
			  
			 
		  }
		});
		
		
		
		
		
//***********************************************************TRACK BOOKINGS RECORDS**************************************************//		
		
		
		
		
		
		
		
		
		frame2.add(cnfrm);
	}

			
	
		
		
	
	public static void main(String args[])
	{
		new accountshome();
	}

}

