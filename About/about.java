package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
import javax.swing.ImageIcon; 
public class about extends JFrame {
		 
		 private Container c;
		 private JLabel l1 ,l2 ,l3 ,l4  ;
		 private JTextField tf1 ,tf2 ,tf3 ,tf4;
		 private ImageIcon img;
		 private JTextArea ta1 ,ta2 ,ta3 ,ta4, ta5 ,ta6;
		 private Font font ,font2;
		 
	public about()
	{
		//Method
		frameInIt();
	}
	//Void type Method
	public void frameInIt()
	{
		c = this.getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		font = new Font("Arial",Font.BOLD,24);
		font2 = new Font("Arial",Font.BOLD,20);
		
		l1 = new JLabel ("About");
		l1.setBounds(550, 80 ,150 ,50);
		l1.setFont(font);
		c.add(l1);
		
		img = new ImageIcon(getClass().getResource("Homeicon.png"));
		
		this.setIconImage(img.getImage());
		
		ta1 = new JTextArea("Information");
		ta1.setBounds(100 ,160 ,320 ,220);
		ta1.setFont(font);
		ta1.setBackground(new Color (0 ,115 ,183));
		c.add(ta1);
		
		ta2 = new JTextArea("General Information");
		ta2.setBounds(480 ,160 ,320 ,220);
		ta2.setFont(font);
		ta2.setBackground(new Color (0 ,192 ,239));
		c.add(ta2);
		
		ta3 = new JTextArea("Resources");
		ta3.setBounds(100 ,400 ,320 ,220);
		ta3.setFont(font);
		ta3.setBackground(new Color (0 ,166 ,90));
		c.add(ta3);
		
		ta4 = new JTextArea("Convacation");
		ta4.setBounds(480 ,400 ,320 ,220);
		ta4.setFont(font);
		ta4.setBackground(new Color (0 ,178 ,158));
		c.add(ta4);
		
		ta5 = new JTextArea("Why Study At AIUB?");
		ta5.setBounds(860 ,160 ,320 ,220);
		ta5.setFont(font);
		ta5.setBackground(new Color (186 ,121 ,203));
		c.add(ta5);
		
		ta6 = new JTextArea("Career Opportunity");
		ta6.setBounds(860 ,400 ,320 ,220);
		ta6.setFont(font);
		ta6.setBackground(new Color (220 ,94 ,75));
		c.add(ta6);
		
		
		
		
	}	
	public static void main (String []args){
		about ab = new about();
		ab.setVisible(true);
		ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ab.setBounds(0,0,1280,680);
		ab.setTitle("About");
		
	}
}