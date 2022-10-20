/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoareas.control;

import calculoareas.modelo.Circulo;
import calculoareas.modelo.Rectangulo;
import calculoareas.modelo.Triangulo;
import calculoareas.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aleja
 */
public class Control implements ActionListener {
    
    private Circulo circulo;
    private Rectangulo rectangulo;
    private Triangulo triangulo;
    private Vista vista;

    public Control(Circulo circulo, Rectangulo rectangulo, Triangulo triangulo, Vista vista) {
        super();
        this.circulo = circulo;
        this.rectangulo = rectangulo;
        this.triangulo = triangulo;
        this.vista = vista;
        actionListener(this);
    }
    
    private void actionListener(ActionListener control){
        System.out.println("Peurrr");
        
    }   
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
