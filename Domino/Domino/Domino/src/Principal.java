
import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.Scanner;
public class Principal {
   
   
    public static void main(String[] args) {
  
  ArrayList<ficha> domino= new ArrayList<>();     
    for (int i=0;i<=6;i++){
      for(int j=i;j<=6;j++){
        ficha f=new ficha(i,j);
        domino.add(f);
        }
    }
  

 SecureRandom ale =new SecureRandom();
    ArrayList<ficha> domino1= new ArrayList<>();
    ArrayList<ficha> domino2= new ArrayList<>();    
    
    for (int i = 0; i < 7; i++) {
            int valor=ale.nextInt(domino.size());
            ficha n = domino.get(valor);
            domino1.add(n);
            domino.remove(valor);
        }
        
     for (int i = 0; i < 7; i++) {
            int val=ale.nextInt(domino.size());
            ficha x = domino.get(val);
            domino2.add(x);
            domino.remove(val); 
        }
      jugador pc= new jugador("pc", domino2);
      jugador yo = new jugador("juego",domino1);
   
      ArrayList<ficha> mesa= new ArrayList<>();
   
        do {            
            //System.out.println("este"+domino1.size()+"\t"+domino2.size()+"\t"+mesa.size());
            // int ñ;
            System.out.println("jugador etas son tus fichas de juego\n");
            yo.imprimir(yo.getMano());
            /*System.out.println("\n");
            pc.imprimir(pc.getMano());*/
           ficha x= yo.jugarh(yo);
           
           if (x==null){
                   for (int i=0; i<pc.getMano().size();i++){
                  if(mesa.isEmpty()){
                    ficha w=pc.getMano().remove(i);
                    mesa.add(w);
                    break;
                  }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(0).getPinta1()){
                    ficha y= pc.getMano().remove(i);
                    y.rotar();
                    mesa.add(0, y);
                    break;
                    }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(0).getPinta1()){
                    ficha t=pc.getMano().remove(i);
                    mesa.add(0,t);
                    break;
                    }
                    else if (pc.getMano().get(i).getPinta2()==mesa.get(mesa.size()-1).getPinta2()){
                    ficha o=pc.getMano().remove(i);
                    o.rotar();
                    mesa.add(mesa.size(),o);
                    break;
                    }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(mesa.size()-1).getPinta2()){
                    ficha s=pc.getMano().remove(i);
                    mesa.add(mesa.size(),s);
                    break;
                    
                    }
                    else{
                      yo.getMano().removeAll(yo.getMano());
                      pc.getMano().removeAll(pc.getMano());
                      break;
                    }
                    }
                   continue;
                   
                   /*int acum=0;
                   for(int u=0; u<yo.getMano().size();u++){
                       int h=yo.getMano().get(u).sumar();
                       acum=acum+h;
                   }
                   System.out.println(acum);*/
                   
               }
               
               
            
        
        
           else if(mesa.isEmpty()){
             mesa.add(0,x);
            }
           
           else{
              // System.out.println("f" +yo.getMano().size());
              
                 if(x.getPinta1()==mesa.get(0).getPinta1()){
                 x.rotar();
                 mesa.add(0, x);
                 //break;
                 } 
                  if(x.getPinta2()==mesa.get(0).getPinta1()){
                    mesa.add(0,x);
                     //break;
                     }
                  if(x.getPinta1()==mesa.get(mesa.size()-1).getPinta2()){
                      mesa.add(mesa.size(),x);
                      //break;
                  }
                  else if (x.getPinta2()==mesa.get(mesa.size()-1).getPinta2()){
                  x.rotar();
                      mesa.add(mesa.size(),x);
                      //break;
                  }
              
           }
           
           //juega maquina
           for (int i=0; i<pc.getMano().size();i++){
                  if(mesa.isEmpty()){
                    ficha f1=pc.getMano().remove(i);
                    mesa.add(0, f1);
                    break;
                  }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(0).getPinta1()){
                    ficha f2= pc.getMano().remove(i);
                    f2.rotar();
                    mesa.add(0, f2);
                    break;
                    }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(0).getPinta1()){
                    ficha f3=pc.getMano().remove(i);
                    mesa.add(0,f3);
                    break;
                    }
                    else if (pc.getMano().get(i).getPinta2()==mesa.get(mesa.size()-1).getPinta2()){
                    ficha f4=pc.getMano().remove(i);
                    f4.rotar();
                    mesa.add(mesa.size(),f4);
                    break;
                    }
                    else if(pc.getMano().get(i).getPinta1()==mesa.get(mesa.size()-1).getPinta2()){
                    ficha f5=pc.getMano().remove(i);
                    mesa.add(mesa.size(),f5);
                    break;
                    
                    }
                    }
           
               //System.out.println("maquina pasa.....");     
           
              System.out.println("está es la mesa de juego");
          for(int k=0;k<mesa.size();k++){
          System.out.print(mesa.get(k).getPinta1()  +  ":"  +  mesa.get(k).getPinta2() + " " );
      }  
            System.out.println("");
       
         } while (!domino1.isEmpty() && !domino2.isEmpty());
        
         if (yo.getMano().isEmpty() && pc.getMano().isEmpty()){
             System.out.println("juego cerrao hay empate");         
         }
         else if(yo.getMano().isEmpty()){
             System.out.println("usuario gana jajajaaja");
         }
         else if(pc.getMano().isEmpty()){
             System.out.println("maquina gana jojojojojo feliz navidad");
         }
        }
   
    
    
}    
    

