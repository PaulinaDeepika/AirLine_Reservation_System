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

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;



public class adminhome {
	JTextField lu;
	
	JTable j;
	
	JButton b2,b3,b4,b5,b6;
	
	JLabel l2,src1,dst1,date,Class1,trv;
	
	JCalendar clnd;
	private TableRowSorter sorter;
	
	JComboBox<?> classes,travellers;
	

	private JFrame frame2=new JFrame("Airline Reservation System");
	public adminhome() 
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
        
        //*********************************************ADD EMPLOYEE GUI***********************************//
        JPanel add_emp=new JPanel();
        add_emp.setBounds(301,1,1234,791);
        add_emp.setLayout(null);
        add_emp.setBackground(Color.black);
        add_emp.setVisible(false);
        
        frame2.add(add_emp);
        
        JTextField eid=new JTextField();
        eid.setBackground(Color.white);
        eid.setForeground(Color.black);
        eid.setBounds(100,100,70,30);
        add_emp.add(eid);
        
        JTextField ename=new JTextField();
        ename.setBackground(Color.white);
        ename.setForeground(Color.black);
        ename.setBounds(200,100,70,30);
        add_emp.add(ename);
        
        JTextField eusername=new JTextField();
        eusername.setBackground(Color.white);
        eusername.setForeground(Color.black);
        eusername.setBounds(300,100,70,30);
        add_emp.add(eusername);
        
        JTextField epassword=new JTextField();
        epassword.setBackground(Color.white);
        epassword.setForeground(Color.black);
        epassword.setBounds(400,100,70,30);
        add_emp.add(epassword);
        
        
        String[] departments = {"Passenger Facilitation", "ATC", "Maintenance", "Baggage Handling", "Accounts"};
        JComboBox cb=new JComboBox(departments);    
        cb.setBackground(Color.white);
        cb.setForeground(Color.black);
        cb.setBounds(500,100,170,30);
        add_emp.add(cb);
        
        JButton checkin=new JButton("Add");
        checkin.setBackground(Color.white);
        checkin.setForeground(Color.black);
        checkin.setBounds(100,200,100,30);
        add_emp.add(checkin);
        //*********************************************ADD EMPLOYEE GUI***********************************//
        
        
        
        
        //*********************************************ADD FLIGHT GUI***********************************//
        JPanel add_flight=new JPanel();
        add_flight.setBounds(301,1,1234,791);
        add_flight.setLayout(null);
        add_flight.setBackground(Color.black);
        add_flight.setVisible(false);
        
        frame2.add(add_flight);
        
        JTextField ftname=new JTextField();
        ftname.setBackground(Color.white);
        ftname.setForeground(Color.black);
        ftname.setBounds(100,100,70,30);
        add_flight.add(ftname);
        
        JTextField ftno=new JTextField();
        ftno.setBackground(Color.white);
        ftno.setForeground(Color.black);
        ftno.setBounds(200,100,70,30);
        add_flight.add(ftno);
        
        JTextField deptime=new JTextField();
        deptime.setBackground(Color.white);
        deptime.setForeground(Color.black);
        deptime.setBounds(300,100,70,30);
        add_flight.add(deptime);
        
        JTextField arrtime=new JTextField();
        arrtime.setBackground(Color.white);
        arrtime.setForeground(Color.black);
        arrtime.setBounds(400,100,70,30);
        add_flight.add(arrtime);
        
        
        String[] ftsrc = {"Pune","Mumbai","New Delhi","Chandigarh","Banglore","Chennai","UAE","USA","Canada","Singapore","Malaysia"};
        JComboBox srccb=new JComboBox(ftsrc);    
        srccb.setBackground(Color.white);
        srccb.setForeground(Color.black);
        srccb.setBounds(500,100,200,30);
        add_flight.add(srccb);
        
        
        String[] ftdst = {"Pune","Mumbai","New Delhi","Chandigarh","Banglore","Chennai","UAE","USA","Canada","Singapore","Malaysia"};
        JComboBox dstcb=new JComboBox(ftdst);    
        dstcb.setBackground(Color.white);
        dstcb.setForeground(Color.black);
        dstcb.setBounds(730,100,200,30);
        add_flight.add(dstcb);
        
        
        JTextField ftfare=new JTextField();
        ftfare.setBackground(Color.white);
        ftfare.setForeground(Color.black);
        ftfare.setBounds(960,100,70,30);
        add_flight.add(ftfare);
        
        
        JButton addft=new JButton("Add");
        addft.setBackground(Color.white);
        addft.setForeground(Color.black);
        addft.setBounds(100,200,100,30);
        add_flight.add(addft);
        //*********************************************ADD FLIGHT GUI***********************************//
        
        
        
        
        
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
        
        
        String city[]= {"Pune","Mumbai","New Delhi","Chandigarh","Banglore","Chennai","UAE","USA","Canada","Singapore","Malaysia"};
        JComboBox<?> src=new JComboBox<Object>(city);
        JComboBox<?> dst=new JComboBox<Object>(city);
        src.setBounds(10,150,200,30);
        dst.setBounds(225,150,200,30);
        newacc.add(src);
        newacc.add(dst);
        
       
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
		
		JLabel l3=new JLabel("Name: ");
		l3.setForeground(Color.WHITE);
		l3.setBounds(535,200,40,30);
		panel1.add(l3);
		JLabel l4=new JLabel("Mobile: ");
		l4.setForeground(Color.WHITE);
		l4.setBounds(535,235,50,30);
		panel1.add(l4);
		JLabel name = new JLabel();
		name.setForeground(Color.WHITE);
	    name.setBounds(576,200,100,30);
		panel1.add(name);
		JLabel mobile = new JLabel();
		mobile.setForeground(Color.WHITE);
		mobile.setBounds(582,235,100,30);
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
		
		
		
		
		b2=new JButton("Add Employee");
		b2.setFocusPainted(false);
		b2.setBounds(0,300,300,30);
		b2.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		//b2.setBackground(Color.decode("#B768A2"));
		panel.add(b2);
		JButton bflight=new JButton("Add Flight");
		bflight.setFocusPainted(false);
		bflight.setBounds(0,340,300,30);
		bflight.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		//b2.setBackground(Color.decode("#B768A2"));
		panel.add(bflight);
		b3=new JButton("Bookings");
		b3.setFocusPainted(false);
		b3.setBounds(0,380,300,30);
		b3.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b3);
		b4=new JButton("Users");
		b4.setFocusPainted(false);
		b4.setBounds(0,420,300,30);
		b4.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b4);
		JButton bftlist=new JButton("Flights");
		bftlist.setFocusPainted(false);
		bftlist.setBounds(0,460,300,30);
		bftlist.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(bftlist);
		JButton bemp=new JButton("Employees");
		bemp.setFocusPainted(false);
		bemp.setBounds(0,500,300,30);
		bemp.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(bemp);
		b5=new JButton("Account");
		b5.setFocusPainted(false);
		b5.setBounds(0,540,300,30);
		b5.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b5);
		b6=new JButton("Maintenance");
		b6.setFocusPainted(false);
		b6.setBounds(0,580,300,30);
		b6.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b6);
		
		
		
		frame2.add(panel);
		frame2.add(newacc);
		frame2.add(bookings);
		
		
		
		
		//..................................................Booking Records..........................................//

		b4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  panel1.setVisible(false);
			  newacc.setVisible(false);
			  ticket.setVisible(false);
			  add_emp.setVisible(false);
			  add_flight.setVisible(false);
			  bookings.removeAll();
			 
			  try
			  {
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "Gayu123@");
				    
			      String query = "SELECT * FROM authentication";
			    
			      Statement stm = con.createStatement();
			      ResultSet res = stm.executeQuery(query);
			    
			      String columns[] = { "Name", "Mobile-No", "Username","Password" };
			      String data[] = new String[4];
			      
			      DefaultTableModel model = new DefaultTableModel();
			        model.setColumnIdentifiers(columns);
			    
			      int i = 0;
			      while (res.next()) {
			        String n = res.getString("Name");
			        String fnm = res.getString("mobileno");
			        String fno = res.getString("Username");
			        String dt = res.getString("Password");
			       
			        model.addRow(new Object[]{n, fnm, fno, dt});
	                i++;
			      }
			    
			      JTextField srch=new JTextField();
				     srch.setBackground(Color.white);
				        srch.setForeground(Color.black);
				        srch.setBounds(1132,2,100,30);
				        bookings.add(srch);
			      
			      
			      JTable table = new JTable(model);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
			      table.setBackground(Color.black);
			      table.setForeground(Color.decode("#B768A2"));
			      
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
			      table.getTableHeader().setBackground(Color.decode("#B768A2"));
			      table.getTableHeader().setForeground(Color.decode("#00002f"));
			      table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
			      table.setEnabled(false);
			      
			     pane.setBounds(2,35,1230,1220);
			     
			        
			     
			      bookings.add(pane);
			     

			             
			  }
			  
			  catch(Exception e3)
			  {
				  
			  }
						
			
			 bookings.setVisible(true);

		  }
		});
		
		//.................................................Booking Records............................................//
   	      
   	      
		
		
		JLabel srcfl = new JLabel("Souce");
        srcfl.setForeground(Color.black);
        srcfl.setBounds(10,3,50,30);
        fl.add(srcfl);
        
        
        
        JLabel dstfl = new JLabel("Destination");
        dstfl.setForeground(Color.black);
        dstfl.setBounds(100,3,70,30);
        fl.add(dstfl);
        
        
        
        
        JLabel datefl = new JLabel("Date");
        datefl.setForeground(Color.black);
        datefl.setBounds(210,3,50,30);
        fl.add(datefl);
        
        JLabel classfl = new JLabel("Class");
        classfl.setForeground(Color.black);
        classfl.setBounds(300,3,70,30);
        fl.add(classfl);
        
        JLabel flightnamefl = new JLabel("Flight Name");
        flightnamefl.setForeground(Color.black);
        flightnamefl.setBounds(450,3,150,30);
        fl.add(flightnamefl);
        
        JLabel flightnofl = new JLabel("Flight-No");
        flightnofl.setForeground(Color.black);
        flightnofl.setBounds(690,3,70,30);
        fl.add(flightnofl);
        
        JLabel depfl = new JLabel("Departure");
        depfl.setForeground(Color.black);
        depfl.setBounds(790,3,70,30);
        fl.add(depfl);
        
        JLabel arrfl = new JLabel("Arrival");
        arrfl.setForeground(Color.black);
        arrfl.setBounds(900,3,70,30);
        fl.add(arrfl);
        
        JLabel farefl = new JLabel();
        farefl.setForeground(Color.black);
        farefl.setBounds(1020,3,70,90);
        fl.add(farefl);
        
        JButton bfl =new JButton("Book Ticket");
		bfl.setBounds(1100,33,120,30);
		bfl.setBackground(Color.red);
		bfl.setForeground(Color.white);
		bfl.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
		fl.add(bfl);
		
		newacc.add(fl);
		
		
		
		
		
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
						

						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
						PreparedStatement ps = conn.prepareStatement("Select name,mobileno from admin where username=?;");
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
		
		
		b3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  panel1.setVisible(false);
			  newacc.setVisible(false);
			  ticket.setVisible(false);
			  add_emp.setVisible(false);
			  add_flight.setVisible(false);
			  
			  bookings.removeAll();
			  
			  try
			  {
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "");
				    
			      String query = "SELECT * FROM bookings";
			    
			      Statement stm = con.createStatement();
			      ResultSet res = stm.executeQuery(query);
			    
			      String columns[] = { "Name","Flight_Name","Flight_No","Date","Departure","Arrival","Source","Destination","Class","PNR","Check-In" };
			      String data[] = new String[11];
			    
			      DefaultTableModel model = new DefaultTableModel();
			        model.setColumnIdentifiers(columns);
			      
			      int i = 0;
			      while (res.next()) {
			        String n = res.getString("Name");
			        String fnm = res.getString("Flight_name");
			        String fno = res.getString("Flight_no");
			        String dt = res.getString("Date");
			        String dp = res.getString("Departure");
			        String ar = res.getString("Arrival");
			        String sr = res.getString("Source");
			        String dst = res.getString("Destination");
			        String cl = res.getString("Class");
			        String pnr = res.getString("PNR");	
			        String checkin = res.getString("Check_In");
			        model.addRow(new Object[]{n, fnm, fno, dt, dp, ar, sr, dst, cl, pnr, checkin});
	                i++;
			      }
			      JTextField srch=new JTextField();
				     srch.setBackground(Color.white);
				        srch.setForeground(Color.black);
				        srch.setBounds(1132,2,100,30);
				        bookings.add(srch);
			    
			      
			      JTable table = new JTable(model);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
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
			      
			     pane.setBounds(2,35,1230,1220);
			     
			      bookings.add(pane);
			     
				       
			     

			             
			  }
			  
			  catch(Exception e3)
			  {
				  
			  }
						
			
			 bookings.setVisible(true);

		    
		  }
		});
		
		
		bemp.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  panel1.setVisible(false);
			  newacc.setVisible(false);
			  ticket.setVisible(false);
			  add_emp.setVisible(false);
			  bookings.removeAll();
			  
			  try
			  {
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "");
				    
			      String query = "SELECT * FROM employees";
			    
			      Statement stm = con.createStatement();
			      ResultSet res = stm.executeQuery(query);
			    
			      String columns[] = { "Employee-ID","Name","Usrname","Password","Department"};
			      String data[] = new String[5];
			      
			      DefaultTableModel model = new DefaultTableModel();
			        model.setColumnIdentifiers(columns);
			    
			      int i = 0;
			      while (res.next()) {
			        String n = res.getString("empid");
			        String fnm = res.getString("name");
			        String fno = res.getString("username");
			        String dt = res.getString("password");
			        String dp = res.getString("department");
			       
			       
			        model.addRow(new Object[]{n, fnm, fno, dt, dp});
			        i++;
			      }
			    
			      JTextField srch=new JTextField();
				     srch.setBackground(Color.white);
				        srch.setForeground(Color.black);
				        srch.setBounds(1132,2,100,30);
				        bookings.add(srch);
			      
			     
			      JTable table = new JTable(model);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
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
			      
			     pane.setBounds(2,35,1230,1220);
			     
			      bookings.add(pane);
			      
				        
			     

			             
			  }
			  
			  catch(Exception e3)
			  {
				  
			  }
						
			
			 bookings.setVisible(true);

		    
		  }
		});
		
		
		
		bftlist.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  panel1.setVisible(false);
			  newacc.setVisible(false);
			  ticket.setVisible(false);
			  add_emp.setVisible(false);
			  add_flight.setVisible(false);
			  bookings.removeAll();
			  
			  try
			  {
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "");
				    
			      String query = "SELECT * FROM flights";
			    
			      Statement stm = con.createStatement();
			      ResultSet res = stm.executeQuery(query);
			    
			      String columns[] = { "Flight-Name","Flight-No","Departure","Arrival","Source","Destination","Fare"};
			      String data[] = new String[7];
			    
			      DefaultTableModel model = new DefaultTableModel();
			        model.setColumnIdentifiers(columns);

			      
			      int i = 0;
			      while (res.next()) {
			        String n = res.getString("fname");
			        String fnm = res.getString("fno");
			        String fno = res.getString("departure");
			        String dt = res.getString("arrival");
			        String dp = res.getString("src");
			        String dq = res.getString("dst");
			        String dr = res.getString("fare");
			       
			        
			        model.addRow(new Object[]{n, fnm, fno, dt, dp, dq, dr});
			        i++;
			      }
			      
			      JTextField srch=new JTextField();
				     srch.setBackground(Color.white);
				        srch.setForeground(Color.black);
				        srch.setBounds(1132,2,100,30);
				        bookings.add(srch);
			    
			     
			      JTable table = new JTable(model);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
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
			      
			     pane.setBounds(2,35,1230,1220);
			     
			      bookings.add(pane);
			      
				        

			             
			  }
			  
			  catch(Exception e3)
			  {
				  
			  }
						
			
			 bookings.setVisible(true);

		    
		  }
		});
		
		
		
		
		
		b5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  add_emp.setVisible(false);
				  add_flight.setVisible(false);
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
		
		
		
		JLabel rsrcfl = new JLabel();
	    rsrcfl.setBounds(10,35,80,30);
	    fl.add(rsrcfl);
	    
	    JLabel rdstfl = new JLabel();
	    rdstfl.setBounds(100,35,120,30);
	    fl.add(rdstfl);
	    
	    JLabel rdatefl = new JLabel();
	    rdatefl.setBounds(210,35,120,30);
	    fl.add(rdatefl);
	    
	    JLabel rclassfl = new JLabel();
	    rclassfl.setBounds(300,35,200,30);
	    fl.add(rclassfl);
	    
	    JLabel rnamefl = new JLabel();
	    rnamefl.setBounds(450,35,200,30);
	    fl.add(rnamefl);
	    
	    JLabel rnofl = new JLabel();
	    rnofl.setBounds(690,35,70,30);
	    fl.add(rnofl);
	    
	    JLabel rdepfl = new JLabel();
	    rdepfl.setBounds(790,35,70,30);
	    fl.add(rdepfl);
	    
	    JLabel rarrfl = new JLabel();
	    rarrfl.setBounds(900,35,70,30);
	    fl.add(rarrfl);
	    
	    JLabel rfarefl = new JLabel();
	    rfarefl.setBounds(1020,35,70,30);
	    fl.add(rfarefl);
	    
	
		b1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  fl.setVisible(true);
				  String item =src.getSelectedItem().toString();
				  
				  rsrcfl.setForeground(Color.red);
				  rsrcfl.setFont(new Font("Arial", Font.BOLD, 13));
				  
		           rsrcfl.setText(item);
		           String item1 =dst.getSelectedItem().toString();
		           rdstfl.setForeground(Color.red);
		           rdstfl.setFont(new Font("Arial", Font.BOLD, 13));
		           rdstfl.setText(item1);
		           String item2 = classes.getSelectedItem().toString();
		           rclassfl.setForeground(Color.red);
		           rclassfl.setFont(new Font("Arial", Font.BOLD, 13));
		           rclassfl.setText(item2);
		           
		           String srcdb=rsrcfl.getText();
		           String dstdb=rdstfl.getText();
		           Class.forName("com.mysql.cj.jdbc.Driver");
				   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
				   PreparedStatement ps = conn.prepareStatement("Select fname, fno, departure, arrival, fare from flights where src=? and dst=?;");
				   ps.setString(1,srcdb);
				   ps.setString(2, dstdb);
				   ResultSet rs = ps.executeQuery();
				   if (rs.next()) {
						 
			             
					   rnamefl.setForeground(Color.red);
			           rnamefl.setFont(new Font("Arial", Font.BOLD, 13));
			             rnamefl.setText(rs.getString(1));
			             
			             rnofl.setForeground(Color.red);
				           rnofl.setFont(new Font("Arial", Font.BOLD, 13));
				             rnofl.setText(rs.getString(2));
				             
				             rdepfl.setForeground(Color.red);
					           rdepfl.setFont(new Font("Arial", Font.BOLD, 13));
					             rdepfl.setText(rs.getString(3));
					             
					             rarrfl.setForeground(Color.red);
						           rarrfl.setFont(new Font("Arial", Font.BOLD, 13));
						             rarrfl.setText(rs.getString(4));
						             
						             rfarefl.setForeground(Color.red);
							           rfarefl.setFont(new Font("Arial", Font.BOLD, 20));
							             rfarefl.setText("₹"+rs.getString(5));
						             
							             
										  SimpleDateFormat dcn = new SimpleDateFormat("dd-MM-YYYY");
										    String date = dcn.format(d.getDate() );
										    rdatefl.setForeground(Color.red);
									           rdatefl.setFont(new Font("Arial", Font.BOLD, 13));
										    rdatefl.setText(date.toString());
										  
						 
			             
			         } 
		           
					
					b1.setText("Modify Search");
		           
		           
		           
		           if(rsrcfl.getText()==rdstfl.getText())
		           {
		        	   fl.setVisible(false);
		        	   b1.setText("Search");
		        	   JOptionPane.showMessageDialog(null,"Source & Destination Can't be same");
		        	  
		           }
		        	   else
		           {
		        	   
		           }
		            
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
		
		
		
		//confirmation page code//*****************************************************
		
		JPanel info=new JPanel();
		info.setBounds(1,60,1300,200);
		info.setBackground(Color.WHITE);
		info.setLayout(null);
		cnfrm.add(info);
		
		
		JLabel title=new JLabel("You're almost done!");
		title.setForeground(Color.white);
		title.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		title.setBounds(500,2,250,50);
		cnfrm.add(title);
		
		JLabel dot=new JLabel(".......2h 15m.......");
		dot.setBounds(107,55,152,30);
		dot.setFont(new Font("Arial", Font.BOLD, 20));
		dot.setForeground(Color.black);
		info.add(dot);
		
		JTextField classtf=new JTextField();
		classtf.setBounds(370,60,200,30);
		classtf.setBackground(Color.black);
		classtf.setHorizontalAlignment(JTextField.CENTER);
		classtf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(classtf);
		
		JTextField flnametf=new JTextField();
		flnametf.setBounds(590,60,300,30);
		flnametf.setBackground(Color.black);
		flnametf.setHorizontalAlignment(JTextField.CENTER);
		flnametf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(flnametf);
		
		JTextField flnotf=new JTextField();
		flnotf.setBounds(910,60,70,30);
		flnotf.setBackground(Color.black);
		flnotf.setHorizontalAlignment(JTextField.CENTER);
		flnotf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(flnotf);
		
		JTextField fldatetf=new JTextField();
		fldatetf.setBounds(1000,60,140,30);
		fldatetf.setBackground(Color.black);
		fldatetf.setHorizontalAlignment(JTextField.CENTER);
		fldatetf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(fldatetf);
		
		
		JTextField srctf=new JTextField();
		srctf.setBounds(7,60,100,30);
		srctf.setForeground(Color.red);
		srctf.setBackground(Color.black);
		srctf.setHorizontalAlignment(JTextField.CENTER);
		srctf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(srctf);
		
		JTextField dsttf=new JTextField();
		dsttf.setBounds(253,60,100,30);
		dsttf.setForeground(Color.red);
		dsttf.setBackground(Color.black);
		dsttf.setHorizontalAlignment(JTextField.CENTER);
		dsttf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(dsttf);
		
		JLabel deptf=new JLabel();
		deptf.setBounds(31,35,100,30);
		deptf.setForeground(Color.red);
		deptf.setFont(new Font("Arial", Font.BOLD, 12));
		info.add(deptf);
		
		JLabel arrtf=new JLabel();
		arrtf.setBounds(277,35,100,30);
		arrtf.setForeground(Color.red);
		arrtf.setFont(new Font("Arial", Font.BOLD, 12));
		info.add(arrtf);
		
		
		JTextField namecnf=new JTextField(100);
		namecnf.setBounds(100,350,200,30);
		namecnf.setBackground(Color.white);
		namecnf.setForeground(Color.black);
		namecnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cnfrm.add(namecnf);
		
		JButton bookcnf=new JButton("Book");
		bookcnf.setBounds(320,350,70,30);
		bookcnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		ImageIcon iconcfrm=new ImageIcon("ap.png");
		JLabel iconcfm=new JLabel(iconcfrm);
		iconcfm.setBounds(310, 5, 600, 400);
		//info.add(iconcfm);
		
	
		
		
		
		
		bfl.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
		           fl.setVisible(false);
		           newacc.setVisible(false);
		           add_emp.setVisible(false);
		           add_flight.setVisible(false);
		           cnfrm.setVisible(false);
		           cnfrm.setVisible(true);
		           srctf.setText(rsrcfl.getText());
		           srctf.setEnabled(false);
		           dsttf.setText(rdstfl.getText());
		           dsttf.setEnabled(false);
		           classtf.setText(rclassfl.getText());
		           classtf.setEnabled(false);
		           flnametf.setText(rnamefl.getText());
		           flnametf.setEnabled(false);
		           flnotf.setText(rnofl.getText());
		           flnotf.setEnabled(false);
		           deptf.setText(rdepfl.getText());
		           arrtf.setText(rarrfl.getText());
		           fldatetf.setText(rdatefl.getText());
		           fldatetf.setEnabled(false);
		           cnfrm.add(bookcnf);
		           bookcnf.setVisible(true);
		           namecnf.setText(null);
		           
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		bookcnf.addActionListener(new ActionListener()//...................To be continued.......
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  ticket.setVisible(true);
			  newacc.setVisible(false);
			  panel1.setVisible(false);
			  bookings.setVisible(false);
			  bookcnf.setVisible(false);
			  add_emp.setVisible(false);
			  add_flight.setVisible(false);
			  cnfrm.setVisible(false);
			
			  try {
		          
				  Random rnd = new Random();
				    
					int number = rnd.nextInt(999999);
				    Class.forName("com.mysql.cj.jdbc.Driver");
				  

					Connection connn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
					  Statement statementt = connn.createStatement();
					System.out.print("Database is connected !"+lu.getText());
					
					 String tableN=String.format("INSERT INTO %s(Name,PNR,Flight_name,Flight_no,Departure,Arrival,Source,Destination,Class,Date) VALUES('" +namecnf.getText()+"','"+number+"','"+flnametf.getText()+"','"+flnotf.getText()+"','"+deptf.getText()+"','"+arrtf.getText()+"','"+srctf.getText()+"','"+dsttf.getText()+"','"+classtf.getText()+"','"+fldatetf.getText()+"')",lu.getText());
				        statementt.execute(tableN);
				        
				       
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
			  ticket.setVisible(true);
		  }
		});
		
		
		printb.addActionListener(new ActionListener()//...................To be continued.......
				{
				  public void actionPerformed(ActionEvent e)
				  {
					  printb.setVisible(false);
					 
					  PrinterJob job = PrinterJob.getPrinterJob();
			           
						job.setJobName("E-Ticket");
			            
			            job.setPrintable((Printable) new Printable(){
			            public int print(Graphics pg,PageFormat pf, int pageNum){
			                    pf.setOrientation(PageFormat.LANDSCAPE);
			                 if(pageNum > 0){
			                    return Printable.NO_SUCH_PAGE;
			                }
			                
			                Graphics2D g2 = (Graphics2D)pg;
			                g2.translate(pf.getImageableX(), pf.getImageableY());
			                g2.scale(0.47,0.47);
			                
			                ticket.print(g2);
			         
			               
			                return Printable.PAGE_EXISTS;
			                         
			                
			            }
			    });
			            boolean ok = job.printDialog();
			        if(ok){
			        try{
			            
			        job.print();
			        }
			        catch (PrinterException ex){
				ex.printStackTrace();
			}
			        }
				  }
				});
		
		
//***********************************************************WEB CHECK-IN**************************************************//		
		b2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  add_emp.setVisible(true);
				  add_flight.setVisible(false);
				  ticket.setVisible(false);
				  newacc.setVisible(false);
				  panel1.setVisible(false);
				  bookings.setVisible(false);
				  bookcnf.setVisible(false);
				  fl.setVisible(false);
				  cnfrm.setVisible(false);
		           
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		bflight.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  add_flight.setVisible(true);
				  add_emp.setVisible(false);
				  ticket.setVisible(false);
				  newacc.setVisible(false);
				  panel1.setVisible(false);
				  bookings.setVisible(false);
				  bookcnf.setVisible(false);
				  fl.setVisible(false);
				  cnfrm.setVisible(false);
		           
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		
		
		
		checkin.addActionListener(new ActionListener()//...................To be continued.......
				{
				  public void actionPerformed(ActionEvent e)
				  {
					  
					
					  try {
				          
						
						    Class.forName("com.mysql.cj.jdbc.Driver");
						  

							Connection connn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
							  Statement statementt = connn.createStatement();
							
							
							 String tableN=String.format("INSERT INTO employees VALUES('" + eid.getText() + "','" + ename.getText() + "','" + eusername.getText() + "','" + epassword.getText() + "','" + cb.getSelectedItem() + "')");
						        statementt.execute(tableN);
						        
						      
						             
						             JOptionPane.showMessageDialog(frame2, "Employee Added Successfully");
						            
									 
						             
						       
						        
						        eid.setText(null);
						        ename.setText(null);
						        eusername.setText(null);
						        epassword.setText(null);
						        
						       
				        }
					  catch (Exception e1) {  
					        JOptionPane.showMessageDialog(null, e1);  
					    }  
					 
				  }
				});
		
		
		
		
		
		addft.addActionListener(new ActionListener()//...................To be continued.......
				{
				  public void actionPerformed(ActionEvent e)
				  {
					  
					
					  try {
				          
						
						    Class.forName("com.mysql.cj.jdbc.Driver");
						  

							Connection connn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
							  Statement statementt = connn.createStatement();
							
							
							 String tableN=String.format("INSERT INTO flights VALUES('" + ftname.getText() + "','" + ftno.getText() + "','" + deptime.getText() + "','" + arrtime.getText() + "','" + srccb.getSelectedItem() + "','" + dstcb.getSelectedItem() + "','" + ftfare.getText() + "')");
						        statementt.execute(tableN);
						        
						      
						             
						             JOptionPane.showMessageDialog(frame2, "Flight Added Successfully");
						            
									 
						             
						       
						        
						        ftname.setText(null);
						        ftno.setText(null);
						        deptime.setText(null);
						        arrtime.setText(null);
						        ftfare.setText(null);
						        
						       
				        }
					  catch (Exception e1) {  
					        JOptionPane.showMessageDialog(null, e1);  
					    }  
					 
				  }
				});
		
		
//***********************************************************WEB CHECK-IN**************************************************//		
		
		
		
		
		
		
		
		
		frame2.add(cnfrm);
	}

			
	
		
		
	
	public static void main(String args[])
	{
		new adminhome();
	}

}
