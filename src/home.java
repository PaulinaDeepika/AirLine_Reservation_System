import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.ScrollPaneConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class home {
	JTextField l1;
	
	JTable j;
	
	JButton b2,b3,b4,b5,b6;
	
	JLabel l2,src1,dst1,date,Class1,trv;
	
	JCalendar clnd;
	
	JComboBox<?> classes,travellers;
	JLabel horloge;
	
	 public class MyPanel extends JPanel 
	    {
	       

	       public MyPanel() {
	    	   setLayout(null);
	    	   setBounds(0,0, 1234, 791);
	    	   setBackground(Color.black);
	         
	         horloge = new JLabel();
	         horloge.setHorizontalAlignment(JLabel.CENTER);
	         horloge.setBounds(985, 0, 250, 40);
	         horloge.setForeground(Color.white);
	         horloge.setFont(
	           UIManager.getFont("Label.font").deriveFont(Font.BOLD, 20f)
	         );
	         horloge.setText(
	           DateFormat.getDateTimeInstance().format(new Date())
	         );
	         add(horloge);

	         Timer t = new Timer(500, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	              horloge.setText(
	                 DateFormat.getDateTimeInstance().format(new Date())
	              );
	            }
	         });
	         t.setRepeats(true);
	         t.setCoalesce(true);
	         t.setInitialDelay(0);
	         t.start();
	       }
	    }
	
	
	
	

	private JFrame frame2=new JFrame("Airline Reservation System");
	public home() 
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
        
        JPanel inspectionstatus=new JPanel();
        inspectionstatus.setBounds(301, 1, 1234, 791);
        inspectionstatus.setLayout(null);
        inspectionstatus.setBackground(Color.black); 
        inspectionstatus.setVisible(false);
        frame2.add(inspectionstatus);
        
        JPanel newacc=new JPanel();
        newacc.setBounds(301, 1, 1234, 791);
        newacc.setLayout(null);
        newacc.setBackground(Color.black); 
        newacc.setVisible(false);
        
        JTextField efnot=new JTextField();
        efnot.setBounds(150,10,150,30);
        inspectionstatus.add(efnot);
        
        JLabel efno=new JLabel("Enter Flight Number:");
        efno.setForeground(Color.white);
        efno.setBackground(Color.white);
        efno.setBounds(5,10,150,30);
        inspectionstatus.add(efno);
        
        JButton checkstatus=new JButton("Check Status");
        checkstatus.setForeground(Color.black);
        checkstatus.setBackground(Color.decode("#B768A2"));
        checkstatus.setBounds(320,10,150,30);
        checkstatus.setFocusPainted(false);
        inspectionstatus.add(checkstatus);
        
        //********************************************Inspection-Report GUI*****************************//
        
        JPanel report=new JPanel();
        report.setBounds(1,100,1234,450);
        report.setBackground(Color.WHITE);
        report.setLayout(null);
        report.setVisible(false);
        inspectionstatus.add(report);
        
        JLabel hdng=new JLabel("Inspection Report");
        hdng.setBounds(500,5,200,30);
        hdng.setFont(new Font("Algerian", Font.BOLD, 20));
        hdng.setForeground(Color.BLACK);
        report.add(hdng);
        
        JLabel inspdetail=new JLabel("This is to inform you that smart-airlines have successfully conducted a pre-take-off inspection of your aircraft");
        inspdetail.setBounds(5,50,1000,100);
        inspdetail.setFont(new Font("Arial", Font.BOLD, 13));
        inspdetail.setForeground(Color.BLACK);
        report.add(inspdetail);
        
        JLabel insparam1=new JLabel("Sufficient Fuel");
        insparam1.setBounds(10,150,200,100);
        insparam1.setFont(new Font("Arial", Font.BOLD, 14));
        insparam1.setForeground(Color.BLACK);
        report.add(insparam1);
        
        ImageIcon tick1=new ImageIcon("tick.png");
        
        JLabel insparam1tick=new JLabel(tick1);
        insparam1tick.setBounds(113,175,30,30);
        report.add(insparam1tick);
        
        
        JLabel insparam2=new JLabel("Sufficient Tyre-Pressure");
        insparam2.setBounds(10,180,200,100);
        insparam2.setFont(new Font("Arial", Font.BOLD, 14));
        insparam2.setForeground(Color.BLACK);
        report.add(insparam2);
        
        ImageIcon tick2=new ImageIcon("tick.png");
        
        JLabel insparam2tick=new JLabel(tick2);
        insparam2tick.setBounds(180,206,30,30);
        report.add(insparam2tick);
        
        JLabel insparam3=new JLabel("Sufficient Oil");
        insparam3.setBounds(10,210,200,100);
        insparam3.setFont(new Font("Arial", Font.BOLD, 14));
        insparam3.setForeground(Color.BLACK);
        report.add(insparam3);
        
        ImageIcon tick3=new ImageIcon("tick.png");
        
        JLabel insparam3tick=new JLabel(tick3);
        insparam3tick.setBounds(103,238,30,30);
        report.add(insparam3tick);
        
        
        JLabel insparam4=new JLabel("Sufficient Oxygen");
        insparam4.setBounds(10,240,200,100);
        insparam4.setFont(new Font("Arial", Font.BOLD, 14));
        insparam4.setForeground(Color.BLACK);
        report.add(insparam4);
        
        ImageIcon tick4=new ImageIcon("tick.png");
        
        JLabel insparam4tick=new JLabel(tick4);
        insparam4tick.setBounds(137,268,30,30);
        report.add(insparam4tick);
        
        
       
        ImageIcon stamp=new ImageIcon("stamp.png");
        
        JLabel stampp=new JLabel(stamp);
        stampp.setBounds(5,300,350,140);
        report.add(stampp);
        
        ImageIcon circlestamp=new ImageIcon("circlestamp.png");
        
        JLabel circlestampp=new JLabel(circlestamp);
        circlestampp.setBounds(980,230,280,220);
        report.add(circlestampp);
        
        
        //********************************************Inspection-Report GUI*****************************//
        
        
        
        //*********************************************WEB CHECK-IN GUI***********************************//
        JPanel web=new JPanel();
        web.setBounds(301,1,1234,791);
        web.setLayout(null);
        web.setBackground(Color.black);
        web.setVisible(false);
        
        JPanel seatmap = new JPanel();
        seatmap.setBounds(1,200,1234,591);
        seatmap.setLayout(null);
        seatmap.setBackground(Color.black);
        JLabel passname=new JLabel();
		 passname.setForeground(Color.black);
		 passname.setFont(new Font("Arial", Font.BOLD, 20));
		 passname.setBounds(533,250,200,30);
		 seatmap.add(passname);
		 JLabel passdate=new JLabel();
		 passdate.setForeground(Color.black);
		 passdate.setFont(new Font("Arial", Font.BOLD, 20));
		 passdate.setBounds(533,340,200,30);
		 seatmap.add(passdate);
		 JLabel passdept=new JLabel();
		 passdept.setForeground(Color.white);
		 passdept.setFont(new Font("Arial", Font.BOLD, 24));
		 passdept.setBounds(70,295,200,30);
		 seatmap.add(passdept);
		 JLabel passarr=new JLabel();
		 passarr.setForeground(Color.white);
		 passarr.setFont(new Font("Arial", Font.BOLD, 24));
		 passarr.setBounds(345,295,200,30);
		 seatmap.add(passarr);
		 JLabel passdepttime=new JLabel();
		 passdepttime.setForeground(Color.white);
		 passdepttime.setFont(new Font("Arial", Font.BOLD, 22));
		 passdepttime.setBounds(82,400,200,30);
		 seatmap.add(passdepttime);
		 JLabel passarrtime=new JLabel();
		 passarrtime.setForeground(Color.white);
		 passarrtime.setFont(new Font("Arial", Font.BOLD, 22));
		 passarrtime.setBounds(345,400,200,30);
		 seatmap.add(passarrtime);
		 JLabel passdepttimee=new JLabel();
		 passdepttimee.setForeground(Color.black);
		 passdepttimee.setFont(new Font("Arial", Font.BOLD, 22));
		 passdepttimee.setBounds(860,340,200,30);
		 seatmap.add(passdepttimee);
		 JLabel passarrtimee=new JLabel();
		 passarrtimee.setForeground(Color.black);
		 passarrtimee.setFont(new Font("Arial", Font.BOLD, 22));
		 passarrtimee.setBounds(1066,340,200,30);
		 seatmap.add(passarrtimee);
        ImageIcon iconnn = new ImageIcon("pas.png");
		JLabel icc=new JLabel(iconnn);
		icc.setBounds(17,50,1200,434);
		seatmap.add(icc);
        web.add(seatmap);
        seatmap.setVisible(false);
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             

               web.add(new MyPanel());
               
                
              
               
            }
        });
        
        frame2.add(web);
        
        JLabel epnrl=new JLabel();
        epnrl.setText("Enter PNR");
        epnrl.setBackground(Color.black);
        epnrl.setForeground(Color.white);
        epnrl.setBounds(10,100,70,30);
        web.add(epnrl);
        
        JTextField epnr=new JTextField();
        epnr.setBackground(Color.white);
        epnr.setForeground(Color.black);
        epnr.setBounds(80,100,70,30);
        web.add(epnr);
        
        JButton checkin=new JButton("Check-In");
        checkin.setBackground(Color.white);
        checkin.setForeground(Color.black);
        checkin.setBounds(160,100,100,30);
        web.add(checkin);
        
        JButton printbp=new JButton("Print");
        printbp.setBackground(Color.white);
        printbp.setForeground(Color.black);
        printbp.setBounds(1130,100,100,30);
        printbp.setVisible(false);
        web.add(printbp);
        //*********************************************WEB CHECK-IN GUI***********************************//
        
        
        //*********************************************Ticket-Print GUI**********************************//
        
        JPanel ticket=new JPanel();
        ticket.setBounds(301,1,1234,791);
        ticket.setBackground(Color.white);
        ticket.setLayout(null);
        frame2.add(ticket); 
        ticket.setVisible(false);
        
        JLabel heading=new JLabel("E-Ticket Receipt & Itinerary");
        heading.setForeground(Color.black);
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setBounds(300,40,1000,30);
        ticket.add(heading);
        
        
        
        JPanel header=new JPanel();
        header.setBounds(0,0,1300,115);
        header.setBackground(Color.decode("#b491c8"));
        header.setLayout(null);
        ticket.add(header);
        
        ImageIcon headerimg=new ImageIcon("smart.jpg");
        JLabel lheader=new JLabel(headerimg);
        lheader.setBounds(0,7,290,100);
        header.add(lheader);
        
        ImageIcon barcode=new ImageIcon("barcode.png");
        JLabel barc=new JLabel(barcode);
        barc.setBounds(830,7,400,100);
        header.add(barc);
        
        JLabel instruction1=new JLabel("* This is your E-Ticket Itinerary Receipt. You must bring it with you to the airport for check-in, and it is recommended you to retain a copy for your records.");
        instruction1.setForeground(Color.decode("#6a6a6a"));
        instruction1.setFont(new Font("Arial", Font.BOLD, 13));
        instruction1.setBounds(5,180,1000,30);
        ticket.add(instruction1);
        
        JLabel instruction2=new JLabel("* Each passenger travelling needs a printed copy of this document for immigration, customs, airport security checks and duty free purchases.");
        instruction2.setForeground(Color.decode("#6a6a6a"));
        instruction2.setFont(new Font("Arial", Font.BOLD, 13));
        instruction2.setBounds(5,200,1000,30);
        ticket.add(instruction2);
        
        JLabel instruction3=new JLabel("* Please check with departure airport for restrictions on the carriage of liquids, aerosols and gels in hand baggage.");
        instruction3.setForeground(Color.decode("#6a6a6a"));
        instruction3.setFont(new Font("Arial", Font.BOLD, 13));
        instruction3.setBounds(5,220,1000,30);
        ticket.add(instruction3);
        
        JLabel instruction4=new JLabel("* Smart-Airline's check-in counters open no less than three hours before the flight. You should check in no later than 90 minutes before departure.");
        instruction4.setForeground(Color.decode("#6a6a6a"));
        instruction4.setFont(new Font("Arial", Font.BOLD, 13));
        instruction4.setBounds(5,240,1000,30);
        ticket.add(instruction4);
        
        JLabel instruction5=new JLabel("* Boarding starts 45 minutes before your flight and gates close 20 minutes before departure. If you report late we will not beable to accept you for travel.");
        instruction5.setForeground(Color.decode("#6a6a6a"));
        instruction5.setFont(new Font("Arial", Font.BOLD, 13));
        instruction5.setBounds(5,260,1000,30);
        ticket.add(instruction5);
        
        
        //*******************************************Labels***************************************//
        
        JPanel nameinfo=new JPanel();
        nameinfo.setLayout(null);
        nameinfo.setBackground(Color.decode("#b491c8"));
        nameinfo.setBounds(0,300,1300,40);
        ticket.add(nameinfo);
        
        JLabel h1=new JLabel("PASSENGER  AND  TICKET  INFORMATION");
        h1.setForeground(Color.black);
        h1.setFont(new Font("Arial", Font.BOLD, 16));
        h1.setBounds(5,5,400,30);
        nameinfo.add(h1);
        
        JLabel prtname=new JLabel("PASSENGER NAME: ");
        prtname.setForeground(Color.decode("#6a6a6a"));
        prtname.setFont(new Font("Arial", Font.BOLD, 13));
        prtname.setBounds(5,360,200,30);
        ticket.add(prtname);
        
        JLabel prtage=new JLabel("PASSENGER AGE: ");
        prtage.setForeground(Color.decode("#6a6a6a"));
        prtage.setFont(new Font("Arial", Font.BOLD, 13));
        prtage.setBounds(5,400,200,30);
        ticket.add(prtage);
        
        JLabel prtmobile=new JLabel("PASSENGER MOBILE-NO: ");
        prtmobile.setForeground(Color.decode("#6a6a6a"));
        prtmobile.setFont(new Font("Arial", Font.BOLD, 13));
        prtmobile.setBounds(5,440,200,30);
        ticket.add(prtmobile);
        
        JLabel prtemail=new JLabel("PASSENGER EMAIL-ID: ");
        prtemail.setForeground(Color.decode("#6a6a6a"));
        prtemail.setFont(new Font("Arial", Font.BOLD, 13));
        prtemail.setBounds(5,480,200,30);
        ticket.add(prtemail);
        
        
        JLabel prtsource=new JLabel("SOURCE: ");
        prtsource.setForeground(Color.decode("#6a6a6a"));
        prtsource.setFont(new Font("Arial", Font.BOLD, 13));
        prtsource.setBounds(500,360,200,30);
        ticket.add(prtsource);
        
        JLabel prtdestination=new JLabel("DESTINATION: ");
        prtdestination.setForeground(Color.decode("#6a6a6a"));
        prtdestination.setFont(new Font("Arial", Font.BOLD, 13));
        prtdestination.setBounds(500,400,200,30);
        ticket.add(prtdestination);
        
        JLabel prtdeparture=new JLabel("DEPARTURE: ");
        prtdeparture.setForeground(Color.decode("#6a6a6a"));
        prtdeparture.setFont(new Font("Arial", Font.BOLD, 13));
        prtdeparture.setBounds(500,440,200,30);
        ticket.add(prtdeparture);
        
        JLabel prtarrival=new JLabel("ARRIVAL: ");
        prtarrival.setForeground(Color.decode("#6a6a6a"));
        prtarrival.setFont(new Font("Arial", Font.BOLD, 13));
        prtarrival.setBounds(500,480,200,30);
        ticket.add(prtarrival);
        
        JLabel prtflnumber=new JLabel("FLIGHT-NUMBER: ");
        prtflnumber.setForeground(Color.decode("#6a6a6a"));
        prtflnumber.setFont(new Font("Arial", Font.BOLD, 13));
        prtflnumber.setBounds(995,360,200,30);
        ticket.add(prtflnumber);
        
        JLabel prtpnr=new JLabel("PNR-NUMBER: ");
        prtpnr.setForeground(Color.decode("#6a6a6a"));
        prtpnr.setFont(new Font("Arial", Font.BOLD, 13));
        prtpnr.setBounds(995,400,200,30);
        ticket.add(prtpnr);
        
        JLabel prtclass=new JLabel("CLASS: ");
        prtclass.setForeground(Color.decode("#6a6a6a"));
        prtclass.setFont(new Font("Arial", Font.BOLD, 13));
        prtclass.setBounds(995,440,200,30);
        ticket.add(prtclass);
        
        JLabel prtdate=new JLabel("DATE: ");
        prtdate.setForeground(Color.decode("#6a6a6a"));
        prtdate.setFont(new Font("Arial", Font.BOLD, 13));
        prtdate.setBounds(995,480,200,30);
        ticket.add(prtdate);
        
        JPanel fareinfo=new JPanel();
        fareinfo.setLayout(null);
        fareinfo.setBackground(Color.decode("#b491c8"));
        fareinfo.setBounds(0,525,1300,40);
        ticket.add(fareinfo);
        
        JLabel hh1=new JLabel("FARE  AND  ADDITIONAL  INFORMATION");
        hh1.setForeground(Color.black);
        hh1.setFont(new Font("Arial", Font.BOLD, 16));
        hh1.setBounds(5,5,400,30);
        fareinfo.add(hh1);
        
        JLabel prtfare=new JLabel("FARE: ");
        prtfare.setForeground(Color.decode("#6a6a6a"));
        prtfare.setFont(new Font("Arial", Font.BOLD, 13));
        prtfare.setBounds(5,585,400,30);
        ticket.add(prtfare);
        
        JLabel prttax=new JLabel("TAX: ");
        prttax.setForeground(Color.decode("#6a6a6a"));
        prttax.setFont(new Font("Arial", Font.BOLD, 13));
        prttax.setBounds(500,585,400,30);
        ticket.add(prttax);
        
        JPanel guidelines=new JPanel();
        guidelines.setLayout(null);
        guidelines.setBackground(Color.decode("#b491c8"));
        guidelines.setBounds(0,630,1300,40);
        ticket.add(guidelines);
        
        JLabel hhh1=new JLabel("TRAVEL ADVISORY & GUIDELINES");
        hhh1.setForeground(Color.black);
        hhh1.setFont(new Font("Arial", Font.BOLD, 16));
        hhh1.setBounds(5,5,400,30);
        guidelines.add(hhh1);
        
        JLabel gd1=new JLabel("* Submit self-declaration form on the Air Suvidha portal");
        gd1.setForeground(Color.decode("#6a6a6a"));
        gd1.setFont(new Font("Arial", Font.BOLD, 13));
        gd1.setBounds(5,680,1000,30);
        ticket.add(gd1);
        
        JLabel gd2=new JLabel("* Mention the date of vaccination or RT PCR test conducted, while filling the Self declaration form");
        gd2.setForeground(Color.decode("#6a6a6a"));
        gd2.setFont(new Font("Arial", Font.BOLD, 13));
        gd2.setBounds(5,700,1000,30);
        ticket.add(gd2);
        
        JLabel gd3=new JLabel("* Carry the negative report of COVID-19 RT-PCR test conducted within 72 hrs prior to undertaking the journey");
        gd3.setForeground(Color.decode("#6a6a6a"));
        gd3.setFont(new Font("Arial", Font.BOLD, 13));
        gd3.setBounds(5,720,1200,30);
        ticket.add(gd3);
        
        JLabel gd4=new JLabel("* Carry a Certificate of completing *full primary vaccination schedule of COVID-19 vaccination");
        gd4.setForeground(Color.decode("#6a6a6a"));
        gd4.setFont(new Font("Arial", Font.BOLD, 13));
        gd4.setBounds(5,740,1200,30);
        ticket.add(gd4);
        
        JLabel gd5=new JLabel("* Self-monitor their health for next 14 days of arrival, thank-you for travelling with Smart-Airlines, see you again soon !");
        gd5.setForeground(Color.decode("#6a6a6a"));
        gd5.setFont(new Font("Arial", Font.BOLD, 13));
        gd5.setBounds(5,760,1000,30);
        ticket.add(gd5);
        
       //**************************************************Labels*******************************************//
        
        //************************************************Details********************************************//
        
        JLabel detailname=new JLabel();
        detailname.setForeground(Color.black);
        detailname.setFont(new Font("Arial", Font.BOLD, 13));
        detailname.setBounds(135,360,200,30);
        ticket.add(detailname);
        
        JLabel detailage=new JLabel();
        detailage.setForeground(Color.black);
        detailage.setFont(new Font("Arial", Font.BOLD, 13));
        detailage.setBounds(125,400,200,30);
        ticket.add(detailage);
        
        JLabel detailemail=new JLabel();
        detailemail.setForeground(Color.black);
        detailemail.setFont(new Font("Arial", Font.BOLD, 13));
        detailemail.setBounds(170,440,250,30);
        ticket.add(detailemail);
        
        JLabel detailmobile=new JLabel();
        detailmobile.setForeground(Color.black);
        detailmobile.setFont(new Font("Arial", Font.BOLD, 13));
        detailmobile.setBounds(155,480,200,30);
        ticket.add(detailmobile);
        
        JLabel detailsource=new JLabel();
        detailsource.setForeground(Color.black);
        detailsource.setFont(new Font("Arial", Font.BOLD, 13));
        detailsource.setBounds(565,360,200,30);
        ticket.add(detailsource);
        
        JLabel detaildestination=new JLabel();
        detaildestination.setForeground(Color.black);
        detaildestination.setFont(new Font("Arial", Font.BOLD, 13));
        detaildestination.setBounds(595,400,200,30);
        ticket.add(detaildestination);
        
        JLabel detaildeparture=new JLabel();
        detaildeparture.setForeground(Color.black);
        detaildeparture.setFont(new Font("Arial", Font.BOLD, 13));
        detaildeparture.setBounds(590,440,200,30);
        ticket.add(detaildeparture);
        
        JLabel detailarrival=new JLabel();
        detailarrival.setForeground(Color.black);
        detailarrival.setFont(new Font("Arial", Font.BOLD, 13));
        detailarrival.setBounds(565,480,200,30);
        ticket.add(detailarrival);
        
        JLabel detailflno=new JLabel();
        detailflno.setForeground(Color.black);
        detailflno.setFont(new Font("Arial", Font.BOLD, 13));
        detailflno.setBounds(1110,360,200,30);
        ticket.add(detailflno);
        
        JLabel detailpnrno=new JLabel();
        detailpnrno.setForeground(Color.black);
        detailpnrno.setFont(new Font("Arial", Font.BOLD, 13));
        detailpnrno.setBounds(1092,400,200,30);
        ticket.add(detailpnrno);
        
        JLabel detailclass=new JLabel();
        detailclass.setForeground(Color.black);
        detailclass.setFont(new Font("Arial", Font.BOLD, 13));
        detailclass.setBounds(1048,440,200,30);
        ticket.add(detailclass);
        
        JLabel detaildate=new JLabel();
        detaildate.setForeground(Color.black);
        detaildate.setFont(new Font("Arial", Font.BOLD, 13));
        detaildate.setBounds(1040,480,200,30);
        ticket.add(detaildate);
        
        JLabel detailfare=new JLabel();
        detailfare.setForeground(Color.black);
        detailfare.setFont(new Font("Arial", Font.BOLD, 13));
        detailfare.setBounds(50,585,400,30);
        ticket.add(detailfare);
        
        JLabel detailtax=new JLabel();
        detailtax.setForeground(Color.black);
        detailtax.setFont(new Font("Arial", Font.BOLD, 13));
        detailtax.setBounds(537,585,400,30);
        ticket.add(detailtax);
        
        JButton printb=new JButton("Print");
        printb.setBackground(Color.decode("#b491c8"));
        printb.setBounds(1162,759,70,30);
        ticket.add(printb);
        
        //************************************************Details*******************************************//
        
        //********************************************Ticket Print-GUI**********************************//
        
        
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
		
		
		l1 = new JTextField(40);
		l1.setFont(new Font("Arial", Font.BOLD, 16));
		l1.setBackground(Color.black);
		l1.setForeground(Color.white);
		l1.setHorizontalAlignment(JTextField.CENTER);
		l1.setBounds(0,180,300,30);
		l1.setEnabled(false);
		panel.add(l1);
		
		
		
		
		b2=new JButton("Web Check-In");
		b2.setFocusPainted(false);
		b2.setBounds(0,300,300,30);
		b2.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		//b2.setBackground(Color.decode("#B768A2"));
		panel.add(b2);
		b3=new JButton("Book Ticket");
		b3.setFocusPainted(false);
		b3.setBounds(0,340,300,30);
		b3.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b3);
		b4=new JButton("Bookings");
		b4.setFocusPainted(false);
		b4.setBounds(0,380,300,30);
		b4.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b4);
		b6=new JButton("Inspection Status");
		b6.setFocusPainted(false);
		b6.setBounds(0,420,300,30);
		b6.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b6);
		b5=new JButton("Account");
		b5.setFocusPainted(false);
		b5.setBounds(0,460,300,30);
		b5.setBorder(new MatteBorder(2, 2, 2, 2, Color.decode("#B768A2")));
		panel.add(b5);
		
		
		
		frame2.add(panel);
		frame2.add(newacc);
		frame2.add(bookings);
		
		
		
		
		//..................................................Booking Records..........................................//

		b4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  panel1.setVisible(false);
			  inspectionstatus.setVisible(false);
			  newacc.setVisible(false);
			  ticket.setVisible(false);
			  web.setVisible(false);
			  bookings.removeAll();
			  String nm=l1.getText();
			  try
			  {
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/raw","root", "Gayu123@");
				    
			      String query = "SELECT * FROM `" + nm + "`";
			    
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
			    
			     
			      JTable table = new JTable(model);
			      table.setShowGrid(true);
			      table.setShowVerticalLines(true);
			      table.setBackground(Color.black);
			      table.setForeground(Color.cyan);
			     
			      JScrollPane pane = new JScrollPane(table);
			      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			      centerRenderer.setHorizontalAlignment( JLabel.CENTER );
			      table.setDefaultRenderer(String.class, centerRenderer);
			     table.setFont(new Font("Arial", Font.BOLD, 12));
			      table.getTableHeader().setBackground(Color.red);
			      table.getTableHeader().setForeground(Color.white);
			      table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
			      table.setEnabled(false);
			      
			     pane.setBounds(2,0,1230,1220);
			     
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
				  
					String username = l1.getText();
					
					try
					{
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						

						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
						PreparedStatement ps = conn.prepareStatement("Select name,mobileno from authentication where username=?;");
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
			  try {
		           panel1.setVisible(false);
		           bookings.setVisible(false);
		           ticket.setVisible(false);
		           web.setVisible(false);
		           cnfrm.setVisible(false);
		           newacc.setVisible(true);
		           
		            
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		b5.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  web.setVisible(false);
		           newacc.setVisible(false);
		           bookings.setVisible(false);
		           ticket.setVisible(false);
		           cnfrm.setVisible(false);
		           inspectionstatus.setVisible(false);
		           panel1.setVisible(true);
		            
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		b6.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
		           panel1.setVisible(false);
		           bookings.setVisible(false);
		           ticket.setVisible(false);
		           web.setVisible(false);
		           cnfrm.setVisible(false);
		           newacc.setVisible(false);
                   inspectionstatus.setVisible(true);
		           
		            
		        }
			  catch (Exception e1) {  
			        JOptionPane.showMessageDialog(null, e1);  
			    }  
		    
		  }
		});
		
		
		
		checkstatus.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
				   PreparedStatement ps = conn.prepareStatement("Select Oxygen from maintenance_records where Number=?;");
				   ps.setString(1,efnot.getText());
				   
				   ResultSet rs = ps.executeQuery();
				   if (rs.next()) {
						 
			             
					   
			            
			            	 JOptionPane.showMessageDialog(null, "Inspection Done");
			            	 report.setVisible(true);
			            

		           
				   }  
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
				  Connection conn =        DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
				  Statement statement = conn.createStatement();
		             statement.executeUpdate("UPDATE authentication SET status = 'NO' WHERE Username = '"+l1.getText()+"'");
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
		
		JTextField flfaretf=new JTextField();
		flfaretf.setBounds(1160,60,70,30);
		flfaretf.setBackground(Color.black);
		flfaretf.setHorizontalAlignment(JTextField.CENTER);
		flfaretf.setFont(new Font("Arial", Font.BOLD, 15));
		info.add(flfaretf);
		
		
		JLabel enternamecnf=new JLabel("Enter Passenger Name");
		enternamecnf.setBounds(5,350,220,30);
		enternamecnf.setForeground(Color.white);
		enternamecnf.setFont(new Font("Arial", Font.BOLD, 15));
		cnfrm.add(enternamecnf);
		
		
		JTextField namecnf=new JTextField(100);
		namecnf.setBounds(208,350,225,30);
		namecnf.setBackground(Color.white);
		namecnf.setForeground(Color.black);
		namecnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cnfrm.add(namecnf);
		
		JLabel enteragecnf=new JLabel("Enter Passenger Age");
		enteragecnf.setBounds(5,390,220,30);
		enteragecnf.setForeground(Color.white);
		enteragecnf.setFont(new Font("Arial", Font.BOLD, 15));
		cnfrm.add(enteragecnf);
		
		
		JTextField agecnf=new JTextField(100);
		agecnf.setBounds(208,390,225,30);
		agecnf.setBackground(Color.white);
		agecnf.setForeground(Color.black);
		agecnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cnfrm.add(agecnf);
		
		JLabel enteremailcnf=new JLabel("Enter Passenger Email-ID");
		enteremailcnf.setBounds(5,430,220,30);
		enteremailcnf.setForeground(Color.white);
		enteremailcnf.setFont(new Font("Arial", Font.BOLD, 15));
		cnfrm.add(enteremailcnf);
		
		
		JTextField emailcnf=new JTextField(100);
		emailcnf.setBounds(208,430,225,30);
		emailcnf.setBackground(Color.white);
		emailcnf.setForeground(Color.black);
		emailcnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cnfrm.add(emailcnf);
		
		JLabel entermobilecnf=new JLabel("Enter Passenger Mobile-No");
		entermobilecnf.setBounds(5,470,220,30);
		entermobilecnf.setForeground(Color.white);
		entermobilecnf.setFont(new Font("Arial", Font.BOLD, 15));
		cnfrm.add(entermobilecnf);
		
		
		JTextField mobilecnf=new JTextField(100);
		mobilecnf.setBounds(208,470,225,30);
		mobilecnf.setBackground(Color.white);
		mobilecnf.setForeground(Color.black);
		mobilecnf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cnfrm.add(mobilecnf);
		
		
		
		
		JButton bookcnf=new JButton("Book");
		bookcnf.setBounds(364,520,70,30);
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
		           web.setVisible(false);
		           cnfrm.setVisible(false);
		           cnfrm.setVisible(true);
		           srctf.setText(rsrcfl.getText());
		           srctf.setEnabled(false);
		           dsttf.setText(rdstfl.getText());
		           dsttf.setEnabled(false);
		           classtf.setText(rclassfl.getText());
		           classtf.setEnabled(false);
		           flfaretf.setText(rfarefl.getText());
		           flfaretf.setEnabled(false);
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
			  inspectionstatus.setVisible(false);
			  newacc.setVisible(false);
			  panel1.setVisible(false);
			  bookings.setVisible(false);
			  bookcnf.setVisible(false);
			  web.setVisible(false);
			  cnfrm.setVisible(false);
			  String vl=flfaretf.getText();
			  String intvl = vl.replaceAll("[^0-9]", "");
			
			  try {
				  
				  Random rnd = new Random();
				    
					int number = rnd.nextInt(999999);
				  
				  String naame=namecnf.getText();
				  detailname.setText(naame);
				  
				  String aage=agecnf.getText();
				  detailage.setText(aage);
				  
				  String emaail=emailcnf.getText();
				  detailemail.setText(emaail);
				  
				  String moobile=mobilecnf.getText();
				  detailmobile.setText(moobile);
				  
				  String srccc=srctf.getText();
				  detailsource.setText(srccc);
				  
				  String dsttt=dsttf.getText();
				  detaildestination.setText(dsttt);
				  
				  String deptt=deptf.getText();
				  detaildeparture.setText(deptt);
				  
				  String arrr=arrtf.getText();
				  detailarrival.setText(arrr);
				  
				  String flnoo=flnotf.getText();
				  detailflno.setText(flnoo);
				 
				  detailpnrno.setText(String.valueOf(number));
				  
				  String classs=classtf.getText();
				  detailclass.setText(classs);
				  
				  String datee=fldatetf.getText();
				  detaildate.setText(datee);
				  
				  String faree=flfaretf.getText();
				  detailfare.setText(faree);
				  
				  detailtax.setText("GST: 8.5%");
		          
				  
				    Class.forName("com.mysql.cj.jdbc.Driver");
				  

					Connection connn = DriverManager.getConnection("jdbc:mysql://localhost/raw","root","");
					  Statement statementt = connn.createStatement();
					System.out.print("Database is connected !"+l1.getText());
					
					 String tableN=String.format("INSERT INTO %s(Name,PNR,Flight_name,Flight_no,Departure,Arrival,Source,Destination,Class,Date,fare) VALUES('" +namecnf.getText()+"','"+number+"','"+flnametf.getText()+"','"+flnotf.getText()+"','"+deptf.getText()+"','"+arrtf.getText()+"','"+srctf.getText()+"','"+dsttf.getText()+"','"+classtf.getText()+"','"+fldatetf.getText()+"','"+intvl+"')",l1.getText());
					 String tableM=String.format("INSERT INTO bookings(Name,PNR,Flight_name,Flight_no,Departure,Arrival,Source,Destination,Class,Date,fare) VALUES('" +namecnf.getText()+"','"+number+"','"+flnametf.getText()+"','"+flnotf.getText()+"','"+deptf.getText()+"','"+arrtf.getText()+"','"+srctf.getText()+"','"+dsttf.getText()+"','"+classtf.getText()+"','"+fldatetf.getText()+"','"+intvl+"')");
				        statementt.execute(tableN);
				        statementt.execute(tableM);
				        
				       
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
				  web.setVisible(true);
				  inspectionstatus.setVisible(false);
				  ticket.setVisible(false);
				  newacc.setVisible(false);
				  panel1.setVisible(false);
				  bookings.setVisible(false);
				  bookcnf.setVisible(false);
				  fl.setVisible(false);
				  cnfrm.setVisible(false);
				  seatmap.setVisible(false);
				  printbp.setVisible(false);
		           
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
							
							
							 
						        
						        PreparedStatement ps = connn.prepareStatement("Select name, source, destination, date, Check_In, departure, arrival from bookings where pnr=?;");
								   ps.setString(1,epnr.getText());
								   
								   ResultSet rs = ps.executeQuery();
								   if (rs.next()) 
								   {
									  
									   passname.setText(rs.getString(1));
									   passdept.setText(rs.getString(2));
									   passarr.setText(rs.getString(3));
									   passdepttime.setText(rs.getString(6));
									   passarrtime.setText(rs.getString(7));
									   passdepttimee.setText(rs.getString(6));
									   passarrtimee.setText(rs.getString(7));
									   passdate.setText(rs.getString(4));
									  
									  
									   String fetchdate=rs.getString(4);
									   String fetchsubdate=fetchdate.substring(0, 02);
									   String checkinstatus=rs.getString(5);
									   String date=horloge.getText();
									   String subdate=date.substring(0, 2);
									   int subdatee=Integer.parseInt(subdate);
									   int noexceedfetchdate=Integer.parseInt(fetchsubdate);
									   int reqdate=Integer.parseInt(fetchsubdate)-2;
									   
									   if(subdatee>=reqdate && subdatee<=noexceedfetchdate)
									   {
										   String tableN=String.format("UPDATE %s SET Check_In='YES' WHERE pnr='"+epnr.getText()+"'",l1.getText());
											 String tableM=String.format("UPDATE bookings SET Check_In='YES' WHERE pnr='"+epnr.getText()+"' ");
											 JOptionPane.showMessageDialog(frame2, "Checked-In Successfully");
										        statementt.execute(tableM);
										        statementt.execute(tableN);
										   seatmap.setVisible(true);
										   printbp.setVisible(true);
									   }
									   
									   
									  
									   else
									   {
										   JOptionPane.showMessageDialog(frame2, "No Web-Checkin Allowed");
									   }
									   
									   if(checkinstatus=="YES")
									   {
										   System.out.print("Already Checked-In");
										   seatmap.setVisible(true);
									   }
									 
									   
						      
						             
						             
									 
						        epnr.setText(null);
								   }
								   else
								   {
									   JOptionPane.showMessageDialog(frame2, "Wrong PNR");
								   }
						        
						       
				        }
					  catch (Exception e1) {  
					        JOptionPane.showMessageDialog(null, e1);  
					    }  
					 
				  }
				});
		
		
		printbp.addActionListener(new ActionListener()//...................To be continued.......
				{
				  public void actionPerformed(ActionEvent e)
				  {
					 
					 
					  PrinterJob job = PrinterJob.getPrinterJob();
			           
						job.setJobName("Boarding-Pass");
			            
			            job.setPrintable((Printable) new Printable(){
			            public int print(Graphics pg,PageFormat pf, int pageNum){
			                    pf.setOrientation(PageFormat.LANDSCAPE);
			                 if(pageNum > 0){
			                    return Printable.NO_SUCH_PAGE;
			                }
			                
			                Graphics2D g2 = (Graphics2D)pg;
			                g2.translate(pf.getImageableX(), pf.getImageableY());
			                g2.scale(0.50,0.47);
			                
			                seatmap.print(g2);
			         
			               
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
		
		
		
		
		
		
		
		
		frame2.add(cnfrm);
	}

			
	
		
		
	
	public static void main(String args[])
	{
		new home();
	}

}
