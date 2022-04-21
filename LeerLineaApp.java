package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class LeerLineaApp {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try ( FileReader leer=new FileReader("C:\\Users\\Usuario\\Desktop\\HolaMundo.txt");
            
            BufferedReader fichero=new BufferedReader(leer);){
           
            String linea=fichero.readLine();
            
            if(!linea.isEmpty()){
                System.out.println(linea);
            }
            
            
        }
        
        catch(FileNotFoundException e){
                System.out.println("Fichero no esncontrado "+e);
            }
        catch(IOException e){
            System.out.println("Error "+e);
        }
    }

}
