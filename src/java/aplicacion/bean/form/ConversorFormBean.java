/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Flia.Gallardo
 */
@ManagedBean
@ViewScoped
public class ConversorFormBean implements Serializable {
    private double tempIng;
    private String temp;
    private String tempConver;
    private ArrayList<String> tipotemp;

    public ConversorFormBean() {
        tempIng=0;
        tempConver="";
        tipotemp= new ArrayList();
        tipotemp.add("Celsius");
        tipotemp.add("Fahrenheit");
    }
    public void calcularTemp(){
        if (getTemp().equals("Celsius")){
            setTempConver(("Temperatura en Fahrenheit: ") + (1.8*(getTempIng()+32)));
        }
        else {
            if (getTemp().equals("Fahrenheit")){
                setTempConver(("Temperatura en Celsius: ") + ((getTempIng()-32)/ 1.8));
            }
        }
    }

    /**
     * @return the tempIng
     */
    public double getTempIng() {
        return tempIng;
    }

    /**
     * @param tempIng the tempIng to set
     */
    public void setTempIng(double tempIng) {
        this.tempIng = tempIng;
    }

    /**
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }

    /**
     * @return the tempConver
     */
    public String getTempConver() {
        return tempConver;
    }

    /**
     * @param tempConver the tempConver to set
     */
    public void setTempConver(String tempConver) {
        this.tempConver = tempConver;
    }

    /**
     * @return the tipotemp
     */
    public ArrayList<String> getTipotemp() {
        return tipotemp;
    }

    /**
     * @param tipotemp the tipotemp to set
     */
    public void setTipotemp(ArrayList<String> tipotemp) {
        this.tipotemp = tipotemp;
    }
    
}
    /**
     * Creates a new instance of ConversorFormBean
     */

