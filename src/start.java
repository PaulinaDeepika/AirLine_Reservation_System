                                                                        import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class start {
	start()
	{
		JFrame frame=new JFrame();
		
		ImageIcon imageIcon = new ImageIcon("sa.gif");
		JLabel label = new JLabel(imageIcon);
		label.setBounds(0,0,500,490);
	frame.add(label);
	JProgressBar progressBar=new JProgressBar();
	   progressBar.setBounds(0,490,500,10);//Setting Location and size
       progressBar.setBorderPainted(true);//Setting border painted property
       progressBar.setStringPainted(true);//Setting String painted property
       progressBar.setBackground(Color.white);//setting background color
       progressBar.setForeground(Color.decode("#B768A2"));//setting foreground color
       progressBar.setValue(0);//setting progress bar current value
       frame.add(progressBar);
       
		
	frame.getContentPane().setBackground(Color.BLACK);
	//frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.decode("#B768A2")));
		frame.setUndecorated(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

	       int i=0;//Creating an integer variable and intializing it to 0
	       
	       while( i<=100)
	       {
	           try{
	               Thread.sleep(40);//Pausing execution for 50 milliseconds
	               progressBar.setValue(i);//Setting value of Progress Bar
	       
	               i++;
	               if(i==100)
	            	   
	                   frame.setVisible(false);
	               else if(i>=100)
	            	   new choice();
	              
	               
	           }
	       
	           catch(Exception e){
	               e.printStackTrace();
	           }
	           finally
	           {
	           }

	           

	       }
		
		
	}
	public static void main(String args[])
	{
		new start();
	}

}
