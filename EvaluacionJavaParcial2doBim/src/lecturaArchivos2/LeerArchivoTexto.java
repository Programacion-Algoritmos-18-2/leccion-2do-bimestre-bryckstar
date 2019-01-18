package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class LeerArchivoTexto {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo(String directory) {
        try {
            entrada = new Scanner(new File(directory));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    public ArrayList<Profesor> leer_registros_txt() {

       
        ArrayList<Profesor> lista = new ArrayList<>();

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                // se crea el objeto para leer Json
                Gson g = new Gson();
                String linea = entrada.nextLine();
                // se hace el proceso de transformación
                Profesor p = g.fromJson(linea, Profesor.class);
                lista.add(p);
                //System.out.println(p);

            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    //Metodo oara leer archivos csv
    public ArrayList<Profesor> leer_registros_csv() { 
        
        //Se crea un arraylist para poder almacenar los datos
        ArrayList<Profesor> lista = new ArrayList<>();  

        try // lee registros del archivo, usando el objeto Scanner
        {
            String linea = entrada.nextLine();
            while (entrada.hasNext()) {
                linea = entrada.nextLine();
                // realizamos un split a la cadena por el caracter ","
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(",")));
                Profesor p = new Profesor();
                p.set_cedula(linea_partes.get(0));   
                p.set_nombres(linea_partes.get(1));
                p.set_zona(linea_partes.get(2));
                p.set_provincia(linea_partes.get(3));
                p.set_canton(linea_partes.get(4));
                p.set_personalidad(linea_partes.get(5));
                p.set_razonamiento(linea_partes.get(6));
                p.set_dictam(linea_partes.get(7));
                lista.add(p); //Agregamos los objetos a la lista

            } // fin de while
        } // fin de try   
        // errores que se puedan presentar
        catch (NoSuchElementException elementException) {      
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;                              
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 ************************************************************************
 */
