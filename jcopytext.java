package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class jcopytext {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ruta del fichero a copiar: ");
        String acopiar=teclado.next();
        
       
        String copia=acopiar.concat("_copia.txt");
        
        try(
                BufferedReader leer=new BufferedReader(new FileReader (acopiar));
                BufferedWriter escribir=new BufferedWriter (new FileWriter (copia)))
        {
            String linea;
            
            linea=leer.readLine();
            
            while(linea!=null){
                escribir.write(linea);
                escribir.write("\n");
                linea=leer.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error "+e);
        }
    }
        

}
