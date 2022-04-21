package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 19 abr 2022
/* Importaciones */
import java.io.*;
import java.util.*;
import javax.swing.*;
/* Clase Main */
public class App {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int car=0;
        
        try{
            
        FileReader fichero=new FileReader("C:\\Users\\Usuario\\NetBeansJava\\LecturaDeFicheros\\src\\main\\java\\jose\\antonio\\lecturadeficheros\\text.txt");
        
            try{
                car=fichero.read();
                while(car!=-1){
                    System.out.print((char)car);
                    car=fichero.read();
                    
                  
                }

                fichero.close();
            }
            catch(IOException e){
                System.out.println("Error de E/S");
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Error de Fichero");
        }
        
        
        
        
        
        
    }

}
