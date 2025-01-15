package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
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
        Container panel = frame.getContentPane();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBackground(Color.BLUE);
        frame.setSize(1000,800);
        frame.setLocationRelativeTo(null);
        JLabel lbl = new JLabel("Rock Paper Scissors");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl.setFont(new Font("Serif", Font.BOLD, 50));
        lbl.setForeground(Color.WHITE);
        //lbl.setIcon(icon);
        frame.add(lbl);
        ImagePanel bleh = new ImagePanel();
        ActionListener listener = new ButtonClickHandler("rock");
        bleh.addImages("rock", "C:\\Program Files\\IntelliJ\\IdeaProjects\\game\\src\\resources\\rock.jpg", 250, 250)
                .addActionListener(listener);
        bleh.addImages("paper", "C:\\Program Files\\IntelliJ\\IdeaProjects\\game\\src\\resources\\paper.jpg", 250, 250)
                .addActionListener(listener);;
        bleh.addImages("scissors", "C:\\Program Files\\IntelliJ\\IdeaProjects\\game\\src\\resources\\scissors.jpg", 250, 250)
                .addActionListener(listener);;
        frame.add(bleh);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
