package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.io.IOException;
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) throws IOException {
        //Se llama a los metodos necesarios
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();  
        OperacionData operacion = new OperacionData(); 
        CrearArchivo archivo= new CrearArchivo(); 
        // Se procede a abrir los arichivos y a leer su informacion
        aplicacion.abrirArchivo("data/data1.csv");             
        ArrayList<Profesor> lista_csv = aplicacion.leer_registros_csv();   
        aplicacion.abrirArchivo("data/data2.txt");              
        ArrayList<Profesor> lista_txt = aplicacion.leer_registros_txt();     
        //Agregamos todos los obejtos a la lista_participantes
        ArrayList<Profesor> lista_participantes = new ArrayList<>();      
        for (int i = 0; i < lista_csv.size(); i++) {
            lista_participantes.add(lista_csv.get(i));                     
        }
        for (int i = 0; i < lista_txt.size(); i++) {
            lista_participantes.add(lista_txt.get(i));                      
        }
        
        //Se agregan todos los datos de los particpantes
        operacion.agregarInformacion(lista_participantes);                  
        
        //Se llaman a los metodos para ordenar y para presentar la cantidad de particpantes
        operacion.ordenarPorCanton();                            
        operacion.cantidad_personalidad();           
        operacion.cantidad_dictam();  
        
        ArrayList<Profesor> lista_final = operacion.ordenarPorNombres();
        //Se crea el archivo
        archivo.escribir_archivo(lista_final);
        
        aplicacion.cerrarArchivo();                 
       
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

