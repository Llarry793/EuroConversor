package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;

/**
 *
 * @author
 */

   public class NumberPanel extends JPanel{
       
       ArrayList<JButton> buttons = new ArrayList();
       
       
       public NumberPanel(){
           
           String s;
           
           setLayout(new GridLayout(3,4));
           
           setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
           
           for(int i = 0; i < 12; i++)
           {
               JButton boton;
               if(i == 10){
                   s = ".";
                   boton = new JButton(s);
                   buttons.add(boton);
                   add(boton);
               }
               else if(i == 11){
                   s = "C";
                   boton = new JButton(s);
                   buttons.add(boton);
                   add(boton);
               }
               else
               {
               s = Integer.toString(i);
               boton = new JButton(s);
               buttons.add(boton);
               add(boton);
               }
           }
           
          
           
       }
       
       public void setActionListener(ActionListener al){
           
           for(int i = 0; i < 12; i++){
            buttons.get(i).addActionListener(al);
           }
     }
       
   }

