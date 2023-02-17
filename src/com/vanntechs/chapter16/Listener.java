package com.vanntechs.chapter16;

/**********************************************************
 * Listener.java
 * Dean & Dean
 *
 * This provides a listener for the factorial program.
 **********************************************************/

private class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        int x;   // numeric value for user entered x
        int xf;  // x factorial

        if (e.getSource() == xBox)
        {
            JOptionPane.showMessageDialog(null,
                    "Click factorial button to perform calculation.");
        }

        else // the button must have been clicked
        {
            try
            {
                x = Integer.parseInt(xBox.getText());
            }
            catch (NumberFormatException nfe)
            {
                x = -1;   // indicates an invalid x
            }

            if (x < 0)
            {
                xfBox.setText("undefined");
            }
            else
            {
                if (x == 0 || x == 1)
                {
                    xf = 1;
                }
                else
                {
                    xf = 1;
                    for (int i=2; i<=x; i++)
                    {
                        xf *= i;
                    }
                } // end else

                xfBox.setText(Integer.toString(xf));
            } // end else
        } // end else button was clicked
    } // end actionPerformed
} // end class Listener