package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 20 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class LeerCaracteres {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try{
            FileReader fichero=new FileReader("C:\\Users\\Usuario\\Desktop\\HolaMundo.txt");
            System.out.println("Escribe el numero de caracteres a leer: ");
            int longitud=teclado.nextInt();
            int cont=0;
            
            int c=fichero.read();
            
            while(cont<longitud && c!=-1){
                cont++;
                System.out.print((char)c);
                c=fichero.read();
            }
            fichero.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }

}
