package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import game.Play;

public class ButtonClickHandler implements ActionListener
{
    private String msg;

    public ButtonClickHandler(String msg)
    {
        this.msg = msg;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(msg);
        Play p = new Play();
        p.playing(msg);
    }
}
