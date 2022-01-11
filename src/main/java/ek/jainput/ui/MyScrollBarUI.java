package ek.jainput.ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyScrollBarUI extends BasicScrollBarUI
{
    private Color btnColor = new Color(30, 30, 30);
    
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
        //JButton btn = new MyArrowButton(orientation, btnColor, Color.GRAY, Color.GRAY, Color.GRAY);
        
        JButton btn = new JButton();
        btn.setBackground(btnColor);
        btn.setPreferredSize(new Dimension(16, 16));
        
        btn.setFocusable(false);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

    @Override
    protected JButton createDecreaseButton(int orientation)
    {
        //JButton btn = new MyArrowButton(orientation, btnColor, btnColor, Color.GRAY, btnColor);
        JButton btn = new JButton();
        btn.setBackground(btnColor);
        btn.setPreferredSize(new Dimension(16, 16));
        
        btn.setFocusable(false);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

}
