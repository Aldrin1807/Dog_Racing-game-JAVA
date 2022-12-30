import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.util.Random;

public class Loja_Gara{

	private JFrame frame;

	JLabel Dog_1;
	JLabel Dog_2;
	JLabel Dog_3;
	JLabel Dog_4;
	JLabel Dog_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	            try {
	                Loja_Gara window = new Loja_Gara();
	                window.frame.setVisible(true);
	            } catch (Exception e) {
	                e.getMessage();
	            }
	       
	}

	/**
	 * Create the application.
	 */
	public Loja_Gara() { 
	    initialize();
	}

	
	public class Dog_Thread extends Thread{
        private JLabel dogLabel;
        private int pozita;
        public Dog_Thread(JLabel dogLabel) {
            this.dogLabel = dogLabel;
            this.pozita = 44;
        }
        public void run() {
        	Random r = new Random();
            while (pozita < 950) {
               
                try {
                    Thread.sleep(r.nextInt(500));   
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
               
                pozita += 50;
               
                dogLabel.setBounds(pozita, dogLabel.getY(), 92, 42);
            }
            if (pozita >= 950) {
            	JOptionPane.showMessageDialog(null, dogLabel.getName()+" finished the race", "Finish", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }
	public void garo() {
	
		Dog_Thread dog1Thread = new Dog_Thread(Dog_1);
		Dog_Thread dog2Thread = new Dog_Thread(Dog_2);
		Dog_Thread dog3Thread = new Dog_Thread(Dog_3);
		Dog_Thread dog4Thread = new Dog_Thread(Dog_4);
		Dog_Thread dog5Thread = new Dog_Thread(Dog_5);
        
        dog1Thread.setPriority(10);
		
        dog1Thread.start();
        dog2Thread.start();
        dog3Thread.start();
        dog4Thread.start();
        dog5Thread.start();
        
        
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.setBounds(100, 100, 1152, 578);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);


	        Dog_1 = new JLabel("");
	        Dog_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngegg (1).png"));
	        Dog_1.setBounds(44,89, 92, 42);
	        frame.getContentPane().add(Dog_1);
	        
	        Dog_2 = new JLabel("");
	        Dog_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngegg (1).png"));
	        Dog_2.setBounds(44,142, 92, 42);
	        frame.getContentPane().add(Dog_2);
	        
	        Dog_3 = new JLabel("");
	        Dog_3.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngegg (1).png"));
	        Dog_3.setBounds(44,195, 92, 42);
	        frame.getContentPane().add(Dog_3);
	        
	        Dog_4 = new JLabel("");
	        Dog_4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngegg (1).png"));
	        Dog_4.setBounds(44,248, 92, 42);
	        frame.getContentPane().add(Dog_4);
	        
	        Dog_5 = new JLabel("");
	        Dog_5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngegg (1).png"));
	        Dog_5.setBounds(44,301, 92, 42);
	        frame.getContentPane().add(Dog_5);
	        
	        Dog_1.setName("Dog 1");
	        Dog_2.setName("Dog 2");
	        Dog_3.setName("Dog 3");
	        Dog_4.setName("Dog 4");
	        Dog_5.setName("Dog 5");
	        
	        JButton btnStart = new JButton("Start");
	        btnStart.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	                garo();
	            }
	        });
	        btnStart.setBounds(424, 462, 98, 37);
	        frame.getContentPane().add(btnStart);
	        
	        JButton   Reset = new JButton("Reset");
	        Reset.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {

	    
	        		 Dog_1.setBounds(44,89, 92, 42);
	        		 Dog_2.setBounds(44,142, 92, 42);
	        		 Dog_3.setBounds(44,195, 92, 42);
	        		 Dog_4.setBounds(44,248, 92, 42);
	        		 Dog_5.setBounds(44,301, 92, 42);
	        		 
	        	}
	        });
	        Reset.setBounds(544, 462, 92, 37);
	        frame.getContentPane().add(Reset);
	        
	        JSeparator separator = new JSeparator();
	        separator.setBounds(119, 129, 897, 2);
	        frame.getContentPane().add(separator);
	        
	        JSeparator separator_1 = new JSeparator();
	        separator_1.setBounds(119, 182, 897, 2);
	        frame.getContentPane().add(separator_1);
	        
	        JSeparator separator_2 = new JSeparator();
	        separator_2.setBounds(119, 235, 897, 2);
	        frame.getContentPane().add(separator_2);
	        
	        JSeparator separator_3 = new JSeparator();
	        separator_3.setBounds(119, 288, 897, 2);
	        frame.getContentPane().add(separator_3);
	       
	        JSeparator separator_4 = new JSeparator();
	        separator_4.setBounds(119, 341, 897, 2);
	        frame.getContentPane().add(separator_4);
	        
	        JLabel nr1 = new JLabel("1");
	        nr1.setFont(new Font("Tahoma", Font.BOLD, 25));
	        nr1.setBounds(522, 72, 16, 67);
	        frame.getContentPane().add(nr1);
	        
	        JLabel   nr2 = new JLabel("2");
	        nr2.setFont(new Font("Tahoma", Font.BOLD, 25));
	        nr2.setBounds(522, 117, 16, 67);
	        frame.getContentPane().add(nr2);
	        
	        JLabel   nr3 = new JLabel("3");
	        nr3.setFont(new Font("Tahoma", Font.BOLD, 25));
	        nr3.setBounds(522, 170, 16, 67);
	        frame.getContentPane().add(nr3);
	        
	        JLabel   nr4 = new JLabel("4");
	        nr4.setFont(new Font("Tahoma", Font.BOLD, 25));
	        nr4.setBounds(522, 223, 16, 67);
	        frame.getContentPane().add(nr4);
	        
	        JLabel  nr5 = new JLabel("5");
	        nr5.setFont(new Font("Tahoma", Font.BOLD, 25));
	        nr5.setBounds(522, 276, 16, 67);
	        frame.getContentPane().add(nr5);
	        
	        JSeparator separator_5 = new JSeparator();
	        separator_5.setOrientation(SwingConstants.VERTICAL);
	        separator_5.setForeground(Color.BLACK);
	        separator_5.setBackground(Color.BLACK);
	        separator_5.setBounds(1015, 89, 2, 254);
	        frame.getContentPane().add(separator_5);
	        
	        JSeparator	separator_6 = new JSeparator();
	        separator_6.setForeground(Color.BLACK);
	        separator_6.setBackground(Color.BLACK);
	        separator_6.setOrientation(SwingConstants.VERTICAL);
	        separator_6.setBounds(1079, 89, 66, 254);
	        frame.getContentPane().add(separator_6);
	        
	        JSeparator separator_7 = new JSeparator();
	        separator_7.setOrientation(SwingConstants.VERTICAL);
	        separator_7.setForeground(Color.BLACK);
	        separator_7.setBackground(Color.BLACK);
	        separator_7.setBounds(54, 89, 66, 254);
	        frame.getContentPane().add(separator_7);
	        
	        JSeparator separator_8 = new JSeparator();
	        separator_8.setOrientation(SwingConstants.VERTICAL);
	        separator_8.setForeground(Color.BLACK);
	        separator_8.setBackground(Color.BLACK);
	        separator_8.setBounds(115, 89, 66, 254);
	        frame.getContentPane().add(separator_8);
	    }
}