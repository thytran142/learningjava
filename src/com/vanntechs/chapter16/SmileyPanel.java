package com.vanntechs.chapter16;

/***************************************************************
 * SmileyPanel.java
 * Dean & Dean
 *
 * This class contains a smiley image and listeners
 * that enable image dragging and image swapping.
 ***************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SmileyPanel extends JPanel
{
    private final ImageIcon SMILEY = new ImageIcon("smiley.gif");
    private final ImageIcon SCARED = new ImageIcon("scared.gif");
    private final int WIDTH = SMILEY.getIconWidth();
    private final int HEIGHT = SMILEY.getIconHeight();

    private Point imageCorner; // image's top-left corner location
    private Point prevPt;      // mouse location for previous event
    private ImageIcon image;   // toggles between smiley and scared

    //************************************************************

    public SmileyPanel()
    {
        image = SMILEY;
        imageCorner = new Point(0, 0); // image starts at top left
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    } // end SmileyComponent constructor

    //************************************************************

    private class ClickListener extends MouseAdapter
    {
        // When mouse pressed, change to scared image.

        public void mousePressed(MouseEvent e)
        {
            image = SCARED;
            prevPt = e.getPoint();  // save current position
            repaint();
        } // end mousePressed

        // When mouse released, return to smiley image.

        public void mouseReleased(MouseEvent e)
        {
            image = SMILEY;
            repaint();
        } // end mouseReleased
    } // end class ClickListener

    //*******************************************************

    private class DragListener extends MouseMotionAdapter
    {
        // Enable image to be dragged by mouse.

        public void mouseDragged(MouseEvent e)
        {
            Point currentPt = e.getPoint(); // current position

            // Make sure mouse was pressed within the image.
            if (currentPt.getX() >= imageCorner.getX() &&
                    currentPt.getX() <= imageCorner.getX() + WIDTH &&
                    currentPt.getY() >= imageCorner.getY() &&
                    currentPt.getY() <= imageCorner.getY() + HEIGHT)
            {
                imageCorner.translate(
                        (int) (currentPt.getX() - prevPt.getX()),
                        (int) (currentPt.getY() - prevPt.getY()));
                prevPt = currentPt; // save current position
                repaint();
            }
        } // end mouseDragged
    } // end class DragListener

    //*******************************************************

    // Draw the window, including the updated image.

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        image.paintIcon(this, g,
                (int) imageCorner.getX(), (int) imageCorner.getY());
    } // end paintComponent
}