/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author EU (2016)
 */
public class EuroConversorMenu extends JMenuBar{
    private JMenu calculadora;
    private JMenuItem salir;
    private JMenuItem cambiarRatio;
    
    
    public EuroConversorMenu (){
        calculadora = new JMenu("Calculadora");
        salir = new JMenuItem ("Salir");
        salir.setActionCommand("ItemSalir");
        cambiarRatio = new JMenuItem ("Cambiar Ratio");
        cambiarRatio.setActionCommand("ItemCambiarRatio");
        
        calculadora.add(cambiarRatio);
        calculadora.add(salir);
        
        add(calculadora);
        
        
    }
    public void setActionListener(ActionListener actionListener){
        salir.addActionListener(actionListener);
        cambiarRatio.addActionListener(actionListener);
        
    }
}
