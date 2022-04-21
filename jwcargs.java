package jose.antonio.lecturadeficheros;
/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import javax.swing.*;
import java.io.*;
/* Clase Main */
public class jwcargs {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caracteres=0;
        int lineas=0;
        int palabras=0;
        
        String ruta=null;
        String opcion=null;
        
        if(args.length==0){
            System.out.println("Error en los parametros");
            return;
  
        }
        else{
            
            if(args.length==1){
                ruta=args[0];
            }
            if(args.length==2){
                opcion=args[0];
                ruta=args[1];
            }
           

            try(BufferedReader leerCar=new BufferedReader(new FileReader (ruta));
                    BufferedReader leerLin=new BufferedReader(new FileReader (ruta));
                    ){
                
                int car=leerCar.read();
                while(car!=-1){
                    caracteres++;
                    car=leerCar.read();
                    
                    if((char)car==' ' || (char)car=='\n' || (char)car=='.' || (char)car==','){
                        palabras++;
                    }
                    
                }

                while(leerLin.readLine()!=null){
                    lineas++;
                }
                
                
                if(opcion==null){
                    System.out.println("Total de lineas: "+lineas);
                    System.out.println("Total de caracteres: "+caracteres);
                    System.out.println("Total de palabras: "+palabras);
                }
                else{
                    if(opcion.equals("-l")){
                        System.out.println("Total de lineas: "+lineas);
                    }
                    if(opcion.equals("-c")){
                        System.out.println("Total de caracteres: "+caracteres);
                    }
                    if(opcion.equals("-w")){
                        System.out.println("Total de palabras: "+palabras);
                    }
                }

            }
            catch(IOException e){
                System.out.println("Error"+e);
            }
        }
    }

}
