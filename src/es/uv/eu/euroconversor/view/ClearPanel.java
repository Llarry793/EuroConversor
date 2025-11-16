

package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author EU (2016)
 */public class ClearPanel extends JPanel{
     private JButton clear;
     
     public ClearPanel(){
         setLayout(new BorderLayout());
         
         setBorder(new EmptyBorder(5,5,5,5));
         
         clear = new JButton("Clear");
         clear.setForeground(Color.blue );
         
         add(clear);
     }
     
     public void setActionListener(ActionListener al){
         clear.addActionListener(al);
     }
     
 }
