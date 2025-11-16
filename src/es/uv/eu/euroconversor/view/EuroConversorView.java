package es.uv.eu.euroconversor.view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EuroConversorView extends JFrame{
    private ClearPanel pSur;
    private DisplayPanel pNorte;
    private NumberPanel pOeste;
    private OperationPanel pEste;
    private EuroConversorMenu menu;
    
   public EuroConversorView(){
       //Invoca al constructor de la superclase Frame
       super("EuroConversor");
       
       this.setLayout(new BorderLayout());
       
       this.setSize(300,300);
       
       pNorte = new DisplayPanel();
       pSur = new ClearPanel();
       pOeste = new NumberPanel();
       pEste = new OperationPanel();
       
       menu = new EuroConversorMenu();
       this.setJMenuBar(menu);
       
       
       
       add(pNorte,"North");
       add(pSur, "South");
       add(pOeste, "Center");
       add(pEste, "East");
       
       setVisible(true);
   }
   
   public void setActionListener(ActionListener al){
       
       pSur.setActionListener(al);
       pOeste.setActionListener(al);
       pEste.setActionListener(al);
       
   }
   
   public void cambiaA1(String cadena){
       pNorte.cambioNum(cadena);
   }
   
   public void cambiaA2(String cadena){
       pNorte.cambioRate(cadena);
   }
    
}


    
    

