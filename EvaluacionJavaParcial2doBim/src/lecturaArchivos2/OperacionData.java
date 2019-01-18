/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class OperacionData {

    Scanner entrada = new Scanner(System.in);
    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }

  

    // proceso de ordenar, a través del uso de Collections
    public void ordenarPorCanton() {
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones,
                (o1, o2) -> o1.canton.compareTo(o2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    
    // Metodo para calcular la cantidad de participantes segun personalidad
    public void cantidad_personalidad() {
        int cont = 0;
        String key;//Se declara una key que almacenara la opcion del usuario
        System.out.printf("Selecione como quiere obtener la lista de participantes: ADECUADOR (A) o POR CONVOCAR (C)");
        char opc = entrada.next().charAt(0);
        if (opc == 'A' || opc == 'a') {
            key = "ADECUADO";
        } else {
            key = "POR CONVOCAR";
        }
        for (int i = 0; i < this.informacion.size(); i++) {
            //Se comparan los datos de la lista que concuerden con la key 
            if (this.informacion.get(i).get_personalidad().equals(key)) {
                cont += 1;
            }
        }
        //Se presenta la cantidad de participantes
        System.out.printf("La cantidad de participantes por %s es %d\n", key, cont);
    }

    // Metodo para calcular la cantidad de participantes segun dictamenidoneidad
    public void cantidad_dictam() {
        int cont = 0;
        String llave;
        System.out.printf("Selecione como quiere obtener la lista de participantes: IDONEO (I) o NO IDONEO (N)");
        char opc = entrada.next().charAt(0);
        if (opc == 'I' || opc == 'i') {         
            llave = "IDONEO";
        } else {                          
            llave = "NO IDONEO";
        }
        for (int i = 0; i < this.informacion.size(); i++) {
            if (this.informacion.get(i).get_dictam().equals(llave)) {      
                cont += 1;
            }
        }
        //Se presenta la cantidad de participantes
        System.out.printf("La cantidad de participantes por %s es %d\n", llave, cont);    
    }

    public ArrayList<Profesor> ordenarPorNombres() {
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres,
                (o1, o2) -> o1.nombres.compareTo(o2.nombres));
        return dataPorNombres;

    }

    public void lecturaData() {
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));

        }

    }

}
