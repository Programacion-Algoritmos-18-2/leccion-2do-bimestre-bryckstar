/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class CrearArchivo {

    // Atributos para el archivo
    FileWriter fichero = null;
    PrintWriter pw = null;

    // Mètodo para escribir el archivo que recibe una lista
    public void escribir_archivo(ArrayList<Profesor> lista) throws IOException  {
        // Se crea el directorio para el archivo
        String directory = "data/new_data.csv";
        // Se crea un nuevo objeto del tipo file
        File archivo = new File(directory);
        // Se crea el archivo
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        BufferedWriter bw = null;
        String cadena = "";
        
        try {
            // Se escriben los datos en el archivo
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero ya esta creado");
            bw = new BufferedWriter(new FileWriter(archivo));
            // Ciclo para poder recorrer la lista y almacenar los datos
            for (int i = 0; i < lista.size(); i++) {
                Profesor p = lista.get(i);
                cadena = String.format("%s|%s|%s|%s|%s|%s|%s|%s\n",
                        p.get_cedula(), p.get_nombres(), p.get_zona(), p.get_provincia(), p.get_canton(),
                        p.get_personalidad(), p.get_razonamiento(), p.get_dictam());
                // Se ingresan los datos al archivo
                bw.write(cadena);
            }
            //Se cierra el archivo
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    


}
