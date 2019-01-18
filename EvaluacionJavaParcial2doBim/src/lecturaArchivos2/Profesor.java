/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author reroes
 */
/*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/

public class Profesor {
    String cedula;
    String nombres;
    String zona;
    String provincia;
    String canton;
    String personalidad;
    String razonamiento;
    String dictamenIdoniedad;
    
    
    public Profesor(String c, String nom, String z, String prov, String cant, String pers, String razon, String dicta) {
        cedula = c;
        nombres = nom;
        zona = z;
        provincia = prov;
        canton = cant;
        personalidad = pers;
        razonamiento = razon;
        dictamenIdoniedad = dicta;
    }

    public Profesor() {
    }
    
    public String get_cedula() {
        return cedula;
    }

    public void set_cedula(String c) {
        cedula = c;
    }

    public String get_nombres() {
        return nombres;
    }

    public void set_nombres(String n) {
        nombres = n;
    }

    public String get_zona() {
        return zona;
    }

    public void set_zona(String zona) {
        this.zona = zona;
    }

    public String get_provincia() {
        return provincia;
    }

    public void set_provincia(String prov) {
        provincia = prov;
    }

    public String get_canton() {
        return canton;
    }

    public void set_canton(String cant) {
        canton = cant;
    }

    public String get_personalidad() {
        return personalidad;
    }

    public void set_personalidad(String pers) {
        personalidad = pers;
    }

    public String get_razonamiento() {
        return razonamiento;
    }

    public void set_razonamiento(String razon) {
        razonamiento = razon;
    }

    public String get_dictam() {
        return dictamenIdoniedad;
    }

    public void set_dictam(String dicta) {
        dictamenIdoniedad = dicta;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s - %s - %s \n", cedula, nombres, zona, canton);
    }
}







