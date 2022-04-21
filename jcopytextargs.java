package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class jcopytextargs {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String copia;
        String acopiar;
        
        if(args.length!=0){
            
                acopiar=args[0];

            if(args.length==2){
                copia=args[1];
            }
            else{
                copia=acopiar.concat("_copia.txt");
            }

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
        

}