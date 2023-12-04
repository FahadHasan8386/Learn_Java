import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Registration extends JFrame {
		private Container c;
		private JLabel L1 ,L2 ,L3 ,L4 ,L5 ,L6 ,L7 ,L8 ,L9 ,L10;  ;
		private JTextField Tf1 ,Tf2 ,Tf3 ,Tf4 ,Tf5 ,Tf6 ,Tf7 ,Tf8 ,Tf9 ,Tf10;
	Registration(){
		loginInIt();
	}
	public void loginInIt(){
		c = this.getContentPane();
		c.setBackground(Color.GREEN);
		c.setLayout(null);
		
		L1 = new JLabel ("NAME ");
		L1.setBounds(40 ,20 ,100 ,50 );
		c.add(L1);
		
		Tf1 = new JTextField ();
		Tf1.setBounds(120,40 ,100 ,20);
		c.add(Tf1);
		
		L2 = new JLabel ("ID ");
		L2.setBounds(40 ,70 ,100 ,50 );
		c.add(L2);
		
		Tf2 = new JTextField ();
		Tf2.setBounds(120,90 ,100 ,20);
		c.add(Tf2);
		
		L3 = new JLabel ("CGPA");
		L3.setBounds(40 ,120 ,100 ,50 );
		c.add(L3);
		
		Tf3 = new JTextField ();
		Tf3.setBounds(120, 140 ,100 ,20);
		c.add(Tf3);
		
		L4 = new JLabel ("PROGRAM");
		L4.setBounds(40 ,170 ,100 ,50 );
		c.add(L4);
		
		Tf4 = new JTextField ();
		Tf4.setBounds(120, 190 ,100 ,20);
		c.add(Tf4);
		
		L5 = new JLabel ("EMAIL");
		L5.setBounds(40 ,220 ,100 ,50 );
		c.add(L5);
		
		Tf5 = new JTextField ();
		Tf5.setBounds(120, 240 ,100 ,20);
		c.add(Tf5);
		
		L6 = new JLabel ("PHONE NO");
		L6.setBounds(40 ,270 ,100 ,50 );
		c.add(L6);
		
		Tf6 = new JTextField ();
		Tf6.setBounds(120,290 ,100 ,20);
		c.add(Tf6);
		
		L7 = new JLabel ("DOB");
		L7.setBounds(40 ,320 ,100 ,50 );
		c.add(L7);
		
		Tf7 = new JTextField ();
		Tf7.setBounds(120,340 ,100 ,20);
		c.add(Tf7);
		
		L8 = new JLabel ("SEX");
		L8.setBounds(240 ,20 ,100 ,50 );
		c.add(L8);
		
		Tf8 = new JTextField ();
		Tf8.setBounds(310,40 ,100 ,20);
		c.add(Tf8);
		
		L9 = new JLabel ("RELIGION");
		L9.setBounds(240 ,70 ,100 ,50 );
		c.add(L9);
		
		Tf9 = new JTextField ();
		Tf9.setBounds(310,90 ,100 ,20);
		c.add(Tf9);
		
		L10 = new JLabel ("BLOOD GP");
		L10.setBounds(240 ,120 ,100 ,50  );
		c.add(L10);
		
		Tf10 = new JTextField ();
		Tf10.setBounds(310,140 ,100 ,20);
		c.add(Tf10);
		
		setBounds(100 ,50,800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Student Information");

	}
	
	public static void main(String[]args){
		
		new Registration();
		
	}
}