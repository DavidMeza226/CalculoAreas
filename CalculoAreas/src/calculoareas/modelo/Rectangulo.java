/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoareas.modelo;

/**
 *
 * @author aleja
 */
public class Rectangulo {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double area(){
        return base*altura/2;
    }
    
    @Override
    publcic String toString(){
        return "Triangulo(" + "base= " + base + ", Altura= " altura + '}';
    }
}
