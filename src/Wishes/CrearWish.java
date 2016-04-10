package Wishes;
/*Clase que permite escribir en un archivo de texto*/

//Importamos clases que se usaran
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Nicolas on 10/04/2016.
 */
public class CrearWish {





//Pedimos el deseo al usuario.
            String deseo="hola";
            public void CrearWish(String nombreArch)

    {
        try {

            File archivo = new File("texto.txt"); //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor


            FileWriter escribir = new FileWriter(archivo, true); //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo


            escribir.write(deseo); //Escribimos en el archivo con el metodo write


            escribir.close(); //Cerramos la conexion
        }

        //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

    }
}
