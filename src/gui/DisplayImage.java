package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage
{
    public static void main(String avg[]) throws IOException
    {
        DisplayImage abc=new DisplayImage();
    }

    public DisplayImage() throws IOException
    {
        //BufferedImage img= ImageIO.read(new File("C:\\Users\\alexa\\IdeaProjects\\game\\src\\resources\\options.jpg"));
        //ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setSize(1000,800);
        frame.setLocationRelativeTo(null);
        JLabel lbl=new JLabel("Rock Paper Scissors");
        lbl.setFont(new Font("Serif", Font.BOLD, 50));
        lbl.setForeground(Color.WHITE);
        //lbl.setIcon(icon);
        frame.add(lbl);
        JPanel bleh = new JPanel();
        bleh.setBackground(Color.orange);
        frame.add(bleh);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
