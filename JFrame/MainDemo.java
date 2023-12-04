import javax.swing.*;
import java.awt.*;

public class MainDemo extends JFrame{
		 
		 private Container c;
		 private JLabel L1 ,L2 ,L3 ,L4 ;
		 private JTextField Tf1 ,Tf2 ,Tf3 ,Tf4;
		 private JButton B1 ,B2, B3 ;
		 
	MainDemo()
	{
		frameInIt();
	}
	public void frameInIt()
	{
		c = this.getContentPane();
		c.setBackground(new Color(184, 255, 51));
		c.setLayout(null);
		
		L1 = new JLabel ("First Name ");
		L1.setBounds(40 ,20 ,100 ,50 );
		c.add(L1);
		
		Tf1 = new JTextField ();
		Tf1.setBounds(120,40 ,100 ,20);
		c.add(Tf1);
		
		L2= new JLabel ("Last Name ");
		L2.setBounds(40 ,50 ,200 ,50 );
		c.add(L2);
		
		Tf2 = new JTextField ();
		Tf2.setBounds(120,70 ,100 ,20);
		c.add(Tf2);
		
		L3 = new JLabel("Age");
		L3.setBounds(40 , 80, 300 ,50);
		c.add(L3);
		
		Tf3 = new JTextField();
		Tf3.setBounds(120 , 100 ,100 ,20);
		c.add(Tf3);
		
		L4 = new JLabel("Qualification");
		L4.setBounds(40 ,110 ,400 ,50);
		c.add(L4);
		
		Tf4 = new JTextField();
		Tf4.setBounds(120 , 130 ,100 ,20);
		c.add(Tf4);
		
		B1 = new JButton (" Ok");
		B1.setBounds(50 ,200 , 100 ,20 );
		c.add(B1);
		
		B2 = new JButton ("Close");
		B2.setBounds(150 ,200 , 100 ,20 );
		c.add(B2);
		
		B3 = new JButton("Save");
		B3.setBounds(250 ,200 ,100 ,20);
		c.add(B3);
		
		
		
	}
	
	public static void main(String[]args){
		
		MainDemo frame = new MainDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,100,600,400);
		
		
	}
}