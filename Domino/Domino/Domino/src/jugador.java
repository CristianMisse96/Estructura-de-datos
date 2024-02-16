import java.util.ArrayList;
import java.util.Scanner;
  
public class jugador {
//atributos jugador    
private String nombre;
private ArrayList<ficha> mano = new ArrayList<>();
//constructor por default
public jugador (){
}

public jugador (String nom, ArrayList man){
 this.nombre=nom;
 this.mano=man;
}

/*public ArrayList repatir(ArrayList dom){
   
    
    
}*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ficha> getMano() {
        return mano;
    }

    public void setMano(ArrayList<ficha> mano) {
        this.mano = mano;
    }
    public void imprimir(ArrayList<ficha> m){
     for(int k=0;k<m.size();k++){
          System.out.print(m.get(k).getPinta1()  +  ":"  +  m.get(k).getPinta2() + "  ");
      } 
    }
    
    public ficha jugarh(jugador m){
       Scanner op= new Scanner(System.in);
               System.out.print("\n\nhumano ecriba el numero de ficha que quieres lanzar\n");  
               String opcion = op.next();  
               int opc = Integer.parseInt(opcion);
              if(opc<0 || opc>m.mano.size()-1){
                  System.out.println("PASOOOOOOOOOO NOJOÑE");
                  System.out.println("turno pc.............");
                  return null;
              }else{
               switch(opc){
               case 0: 
                    ficha n=m.mano.get(opc);
                     m.mano.remove(opc);
                     return n;
               case 1: 
                    ficha r=m.mano.get(opc);
                     m.mano.remove(opc);
                     return r;
               case 2: 
                    ficha o=m.mano.get(opc);
                     m.mano.remove(opc);
                     return o;
                case 3: 
                    ficha p=m.mano.get(opc);
                     m.mano.remove(opc);
                     return p;
               case 4: 
                    ficha a=m.mano.get(opc);
                     m.mano.remove(opc);
                     return a;
               case 5: 
                    ficha s=m.mano.get(opc);
                     m.mano.remove(opc);
                     return s;
               case 6: 
                    ficha d=m.mano.get(opc);
                     m.mano.remove(opc);
                     return d;
            
              }
              }
    return null;
    }
}
