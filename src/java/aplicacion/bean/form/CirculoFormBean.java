/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.datos.ColeccionCirculo;
import aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Flia.Gallardo
 */
@ManagedBean
@ViewScoped
public class CirculoFormBean implements Serializable {
    private ColeccionCirculo circulos;
    private Circulo circulo;
    private double radio;

    /**
     * Creates a new instance of CirculoFormBean
     */
    public CirculoFormBean() {
        circulos= new ColeccionCirculo();
    }
    
    public void agregarCirculo(){
        setCirculo(new Circulo(getRadio()));
        getCirculos().agregarCirculos(getCirculo());
}

    /**
     * @return the circulos
     */
    public ColeccionCirculo getCirculos() {
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ColeccionCirculo circulos) {
        this.circulos = circulos;
    }

    /**
     * @return the circulo
     */
    public Circulo getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
