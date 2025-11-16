package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


/**
 *
 * @author
 */

public class DisplayPanel extends JPanel{
    
    private JTextArea a1,a2;
    private Border borde;
    private float valor;
    
    public DisplayPanel(){
        
        setLayout(new BorderLayout());
        setSize(150,150);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK,6,false));
        
       
        
        a1 = new JTextArea();
        a2 = new JTextArea("Exchange rate: "+ valor);
        
        a1.setEditable(false);
        a2.setEditable(false);
        
        add(a1, BorderLayout.EAST);
        add(a2, BorderLayout.SOUTH);
        
        setBackground(Color.decode("#B4AA60"));
        a1.setBackground(Color.decode("#B4AA60"));
        a2.setBackground(Color.decode("#B4AA60"));
        
        
    }
    
    public void cambioNum(String cadena){
        a1.setText(cadena);
    }
    
    public void cambioRate(String cadena){
        a2.setText(cadena);
    }
    
}
