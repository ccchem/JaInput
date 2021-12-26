package ek.jainput.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyScrollBarUI extends BasicScrollBarUI
{
    public MyScrollBarUI()
    {
    }

    @Override
    protected void configureScrollBarColors()
    {
        this.thumbColor = Color.DARK_GRAY;
    }
    
    @Override
    protected JButton createIncreaseButton(int orientation)
    {
        JButton btn = new JButton();
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.BLACK);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

    @Override
    protected JButton createDecreaseButton(int orientation)
    {
        JButton btn = new JButton();
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.BLACK);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

}
