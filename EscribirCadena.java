package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 20 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class EscribirCadena {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            FileWriter fichero=new FileWriter("C:\\Users\\Usuario\\Desktop\\HolaMundo.txt");
            System.out.println("Escribe: ");
            String cadena= teclado.nextLine();
        
        while(cadena.isEmpty()){
            System.out.println("Texto vacío intentalo de nuevo!");
            cadena= teclado.nextLine();
            
        }
               
        
        fichero.write(cadena);
       
        
        fichero.close();
        
        }
        catch(IOException e){
            System.out.println("Error en el fichero");
        }
        
        
        
        
       
        
    }

}
