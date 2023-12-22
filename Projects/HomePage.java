import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    private Container c;

    HomePage()
    {
        frameInIt();
    }
    public void frameInIt(){

        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.Layout(null);
    }

    public static void main(String[]args){

        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homepage.setBounds(100, 40, 700, 400);

    }
}