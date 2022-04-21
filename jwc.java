package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import javax.swing.*;
import java.io.*;
/* Clase Main */
public class jwc {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caracteres=0;
        int lineas=0;
        
        System.out.println("Introduce la ruta del archivo: ");
        String ruta=teclado.next();
        
        try(BufferedReader leerCar=new BufferedReader(new FileReader (ruta));
                BufferedReader leerLin=new BufferedReader(new FileReader (ruta));){
            while(leerCar.read()!=-1){
                caracteres++;
            }
            
            while(leerLin.readLine()!=null){
                lineas++;
            }
            System.out.println("Total de caracteres: "+caracteres+", Total de lineas: "+lineas);
            
        }
        catch(IOException e){
            System.out.println("Error"+e);
        }
    }

}
