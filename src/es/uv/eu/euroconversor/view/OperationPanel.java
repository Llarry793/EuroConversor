package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;

/**
 *
 * @author 
 */

public class OperationPanel extends JPanel{
    
    private JRadioButton r1,r2;
    private JButton b1;
    
    public OperationPanel(){
        
    setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    
    ButtonGroup gp = new ButtonGroup();
    r1 = new JRadioButton("Dolar-Euro");
    add(r1);
    r2 = new JRadioButton("Euro-Dolar");
    add(r2);
    b1 = new JButton("Convert");
    b1.setForeground(Color.blue);
    
    gp.add(r1);
    gp.add(r2);
    add(b1);
}
    
    public void setActionListener(ActionListener al){
         b1.addActionListener(al);
     }
    
}
