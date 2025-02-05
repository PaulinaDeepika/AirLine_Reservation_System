import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

public class test {

   
   

    public class MyPanel extends JPanel 
    {
       private JLabel horloge;

       public MyPanel() {
    	   setLayout(null);
    	   setBounds(0,0, 500, 500);
         
         horloge = new JLabel();
         horloge.setHorizontalAlignment(JLabel.CENTER);
         horloge.setBounds(10, 10, 250, 40);
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
    public test() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             

                JFrame frame = new JFrame("Real time date/time");
                frame.setLayout(null);
                frame.setSize(500,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame.add(new MyPanel());
              
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        new test();
    }

}