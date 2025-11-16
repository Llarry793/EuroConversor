package es.uv.eu.euroconversor.controller;


import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author EU (2016)
 */
public class EuroConversorController {
    private EuroConversorModel model;
    private EuroConversorView view;
    private String numero, ratio;
    
public EuroConversorController(EuroConversorModel model, EuroConversorView view){
    this.model = model;
    this.view = view;
    
    view.addWindowListener(new EuroConversorControllerWindowListener());
    view.setActionListener(new EuroConversorControllerActionListener());
}  
class EuroConversorControllerWindowListener extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.out.println("EuroConversorController: Cerrar ventana");
        System.exit(0);
    }
}
class EuroConversorControllerActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        
        switch(command){
            case "ItemSalir":
                System.out.println("EuroConversorController: Menu: 'Salir'");
                System.exit(0);
                break;
            case"ItemCambiarRatio":
                System.out.println("EuroConversorController: Menu: 'CambiarRatio'");
                view.cambiaA2(ratio);
                model.setExchangeRate(Float.parseFloat(ratio));
                break;
            case "0":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "1":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "2":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "3":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "4":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "5":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "6":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "7":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "8":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "9":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case ".":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "C":
                numero = model.addDigit(command);
                view.cambiaA1(numero);
                break;
            case "Convert":
                numero = model.convertmult();
                view.cambiaA1(numero);
                break;
            case "Clear":
                numero = model.reset();
                view.cambiaA1(numero);
                view.cambiaA2(numero);
                break;
            default:
                break;
        }
    }
}
}