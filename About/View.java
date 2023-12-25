package myproject;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class View extends about {

    private Container c;
    private ImageIcon image;

    public View() {
        //Method
        frameInIt();
    }

    //Void type Method
    public void frameInIt() {
        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        image = new ImageIcon(getClass().getResource("Fahad.jpg"));

        this.setIconImage(image.getImage());

    }

    public static void main(String[] args) {
        View ab = new View();
        ab.setVisible(true);
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ab.setBounds(0, 0, 1280, 680);
        ab.setTitle("About");

    }
}