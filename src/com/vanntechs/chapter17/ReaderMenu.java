package com.vanntechs.chapter17;

/*************************************************************
 * ReaderMenu.java
 * Dean & Dean
 *
 * Display a text area with menu-based viewing options.
 *************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReaderMenu extends JFrame
{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 265;
    private static final float INCREASE_SIZE = 1.5f;
    private static final float DECREASE_SIZE = .6667f;

    private JMenuBar mBar;                // the menu bar
    private JMenu menu1, menu2;           // the two menus
    private JMenuItem mi1, mi2, mi3, mi4; // the four menu items
    private JTextArea textArea =          // the text to be read
            new JTextArea(
                    "John Nickell\n\n" +
                            "MySpace URL: http://www.myspace.com/oneBusyStudent.html\n\n" +
                            "Top 5 friends: Rigo, Nick, Aris, Stephen, Bavitha\n\n" +
                            "Latest blog entry:\n" +
                            "Just got back from the ACM programming contest." +
                            " Our Park University team took second place. Whoohoo!\n\n" +
                            "About me:\n" +
                            "I enjoy school, work, cars, and mountain bikes, though I" +
                            " can’t wait to finish the first one! I like to experience" +
                            " different countries and cultures. I've spent time in Armenia," +
                            " Germany, Kazakhstan, and Brazil.");

    public ReaderMenu()
    {
        setTitle("Adjustable Reader");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end ReaderMenu constructor

    //**************************************

    private void createContents()
    {
        menu1 = new JMenu("Brightness");
        menu2 = new JMenu("Size");

        mi1 = new JMenuItem("Lighter background");
        mi2 = new JMenuItem("Darker background");
        mi3 = new JMenuItem("Larger font");
        mi4 = new JMenuItem("Smaller font");

        mi1.addActionListener(new BrightnessListener());
        mi2.addActionListener(new BrightnessListener());
        mi3.addActionListener(new SizeListener());
        mi4.addActionListener(new SizeListener());

        menu1.add(mi1);
        menu1.add(mi2);
        menu2.add(mi3);
        menu2.add(mi4);

        mBar = new JMenuBar();
        mBar.add(menu1);
        mBar.add(menu2);
        setJMenuBar(mBar);

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new Insets(10, 10, 10, 10));

        add(new JScrollPane(textArea));
    } // end createContents

    //***************************************

    // Adjust background color of the text area

    private class BrightnessListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Color color;  // current background color
            color = textArea.getBackground();
            if (e.getSource() == mi1) // lighter selected
            {
                textArea.setBackground(color.brighter());
            }
            else                      // darker selected
            {
                textArea.setBackground(color.darker());
            }
        } // end actionPerformed
    } // end class brightnessListener

    //***************************************

    // Adjust font size of the text area's text

    private class SizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Font font = textArea.getFont(); // text area's font
            if (e.getSource() == mi3) // larger selected
            {
                textArea.setFont(
                        font.deriveFont(font.getSize() * INCREASE_SIZE));
            }
            else                      // smaller selected
            {
                textArea.setFont(
                        font.deriveFont(font.getSize() * DECREASE_SIZE));
            }
        } // end actionPerformed
    } // end class brightnessListener

    //**************************************

    public static void main(String[] args)
    {
        new ReaderMenu();
    }
} // end class ReaderMenu
