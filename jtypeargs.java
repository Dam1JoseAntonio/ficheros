package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class jtypeargs {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        if(args!=null){
            String ruta=args[0];
            
        
        

            try(FileReader lector=new FileReader(ruta);
                    BufferedReader leer= new BufferedReader(lector)){
                String linea=leer.readLine();

                while(linea!=null){
                    System.out.println(linea);
                    linea=leer.readLine();
                }
            }
            catch(IOException e){
                System.out.println("Error "+e);
            }
        }
    }

}
