
import javax.swing.JOptionPane;

public class Principal {
     
    public static void main (String []args ){    
       Nodo x=new Nodo();
       Nodo p=new Nodo();
       
       
  
        int opcion=0,z,y =0;
   do {  
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar termino algebraico\n 2.mostrar polinomio\n"
                        + "3.derivar polinomi0\n" +"4.sumar polinomios\n5.restar\n"
                        + "6.evaluar\n7.limpiar\n8.salir ", "menu",3));
        switch(opcion){
            case 1:
                z=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar coeficiente\n ", "menu",3));
                
                y=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar exponente\n " , "menu",3));
               
        {
            /*int aux = 0;
            if(aux==y){
                JOptionPane.showMessageDialog(null, "el exponente ya se encuentra en la lista");
                y=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.ingresar exponente\n " +"3.salir", "menu",3));
            }*/
        }
                if (y<0){
                      JOptionPane.showMessageDialog(null, "el exponente no puede ser negativo");
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar exponente\n " , "menu",3));}
                
                   x.insert(z,y); 
                   x.ordenar();
        
                break;
                
            case 2:
                x.mostrar();
                break;
                
            case 3:
                Nodo der = x.duplicar();
                der.derivar();
                der.mostrar();
                //x.mostrar();
                

                break;
            case 4:
                int opc=0;
                do {                    
                    opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar termino algebraico a sumar\n 2.sumar\n3.salir\n", "menu",3));
                    switch(opc){
                        case 1:
                        int w = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.ingresar coeficiente\n ", "menu",3));
                
            int l = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.ingresar exponente\n " , "menu",3));
               
        {
            /*int aux = 0;
            if(aux==y){
                JOptionPane.showMessageDialog(null, "el exponente ya se encuentra en la lista");
                y=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.ingresar exponente\n " +"3.salir", "menu",3));
            }*/
        }
                if (l<0){
                      JOptionPane.showMessageDialog(null, "el exponente no puede ser negativo");
                
                 l=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar exponente\n " , "menu",3));}
                
                   p.insert1(w,l); 
                   p.ordenar();
                   //p.mostrar();
                   break;
                   case 2:
                      Nodo e=new Nodo();
                       Nodo sum=x.duplicar();
                       Nodo sum1=p.duplicar();
                       e.sumar(sum, sum1);
                       e.mostrar();
                       p.limpiar();
                    break;
                    }
                    
                }
                while (opc !=3);
        break;
             case 5:
                 int opci=0;
                do {                    
                    opci=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar termino algebraico a restar\n 2.restar\n3.salir\n", "menu",3));
                    switch(opci){
                        case 1:
                        int w = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.ingresar coeficiente\n ", "menu",3));
                
            int l = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.ingresar exponente\n " , "menu",3));
               
        {
            /*int aux = 0;
            if(aux==y){
                JOptionPane.showMessageDialog(null, "el exponente ya se encuentra en la lista");
                y=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.ingresar exponente\n " +"3.salir", "menu",3));
            }*/
        }
                if (l<0){
                      JOptionPane.showMessageDialog(null, "el exponente no puede ser negativo");
                
                 l=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar exponente\n " , "menu",3));}
                
                   p.insert1(w,l); 
                   p.ordenar();
                   //p.mostrar();
                   break;
                   case 2:
                      Nodo e=new Nodo();
                       Nodo sum=x.duplicar();
                       Nodo sum1=p.duplicar();
                       e.restar(sum, sum1);
                       e.mostrar();
                       p.limpiar();
                      
                    break;
                    }
                    
                }
                while (opci !=3);
        break;
       case 6:
           
           int d=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.ingresar el numero a evaluar el polinomio\n " , "menu",3));
        Nodo ev=x.duplicar();
        
        ev.evaluar(d);
           
        
        
   break;
       case 7:
           x.limpiar();
           break;
   }
       } while (opcion != 8);
   
    }
}
