package ek.jainput;

import java.awt.Font;

import javax.swing.JTextArea;

public class MainTextArea extends JTextArea
{
    public MainTextArea(Font font)
    {
        setColumns(50);
        setRows(3);
        setLineWrap(true);
        setFont(font);
    }
}
