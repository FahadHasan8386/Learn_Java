import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener{
		 
		 private Container c;
		 private JLabel imgLabel, L1 ,L2  ;
		 private JTextField Tf1 ;
		 private JPasswordField Jp1;
		 private ImageIcon img;
		 private JButton B1 ,B2, B3 ;
		 
	Frame()
	{
		frameInIt();
	}
	public void frameInIt()
	{
		c = this.getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		img = new ImageIcon(getClass().getResource("img.jpg"));
		
		this.setIconImage(img.getImage());
		
		imgLabel = new JLabel (img);
		imgLabel.setBounds(300,50 ,img.getIconWidth(),img.getIconHeight());
		c.add(imgLabel);
		
		L1 = new JLabel ("User ID ");
		L1.setBounds(300 ,260 ,100 ,50 );
		c.add(L1);
		
		Tf1 = new JTextField ();
		Tf1.setBounds(370,280 ,100 ,20);
		c.add(Tf1);
		
		L2= new JLabel ("Password");
		L2.setBounds(300 ,310 ,100 ,50 );
		c.add(L2);	

		Jp1 = new JPasswordField ();
		Jp1.setBounds(370,330 ,100 ,20);
		c.add(Jp1);
		
		B1 = new JButton ("Create New");
		B1.setBounds(300 ,400 , 120 ,20 );
		B1.addActionListener(this);
		c.add(B1);
		
		B2 = new JButton ("Log In");
		B2.setBounds(420 ,400 , 120 ,20 );
		c.add(B2);
		
		B3 = new JButton("Cancel");
		B3.setBounds(360 ,425 ,100 ,20);
		c.add(B3);
		
	}
	public void actionPerformed(ActionEvent ae) {
        setVisible(false);
		new Registration();
    }
	
	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,100,800,500);
		frame.setTitle("AIUB PORTAL");
		frame.setLocationRelativeTo(null); 
		
	}
}