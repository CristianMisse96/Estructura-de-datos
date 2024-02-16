
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class Principal {
      public static void main (String args []){
          
                 int opc=0;
                 for(int g=10;g>0;g--){
                     System.out.println(g);
                 }
                 
               do {    
                   Scanner op= new Scanner(System.in);
               System.out.println("menú de opciones:\n1.convertir expresión infija\n2.salir ");  
               String opcion = op.next();  
               opc = Integer.parseInt(opcion);
              switch(opc){
              case 1:
                  Scanner sc = new Scanner(System.in);
        System.out.println("digte la expresión infija a convertir");
        String infija = sc.next();
           System.out.println("la expresión postfija es:" + Nodopila.convertir(infija)+"\n");
              }
          } while (opc !=2);
       
      }
}

