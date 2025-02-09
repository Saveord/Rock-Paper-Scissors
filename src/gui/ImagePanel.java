package gui;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends Panel
{
    public JButton addImages(String name, String path, int w, int h)
    {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(w, h, Image.SCALE_AREA_AVERAGING);
        icon.setImage(img);
        JButton btn = new JButton(icon);
        btn.setName(name);
        add(btn);
        return btn;
    }
}
