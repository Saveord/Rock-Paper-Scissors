package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import game.Play;

import javax.swing.*;

public class ButtonClickHandler implements ActionListener
{
    private String msg;
    Play p = new Play(7);

    public ButtonClickHandler(String msg)
    {
        this.msg = msg;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton btn = (JButton)e.getSource();
        System.out.println(btn.getName());
        p.playing(msg);
    }
}
