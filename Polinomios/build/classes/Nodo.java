
//import javax.swing.JOptionPane;
import java.lang.Math;
public class Nodo {
    
    private int exp;
    private int coef;
  private Nodo sig;  
  
  public Nodo(){
      this.sig=null;
  }
  
public Nodo(int c , int e){
    coef=c;
    exp=e;
}

//getter and setter
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    //funcion para insertar un nodo a la lista
    
    public void insert(int z, int y){
        Nodo x=new Nodo(z,y);
        Nodo aux=this.sig;
        this.sig=x;
        x.sig=aux;
    }
    //funcion para insertar un nodo a la lista a sumar o restar
    public void insert1(int w, int l){
        Nodo p=new Nodo(w,l);
        Nodo aux=this.sig;
        this.sig=p;
        p.sig=aux;
    }
    //funcion para mostrar la informacion que contiene la lista 
    public void mostrar (){
        //Nodo aux=a.sig;
        Nodo aux=this.sig;
        System.out.println();
    while(aux != null){
            System.out.print(aux.coef +"x^"+aux.exp +"-->");
             aux=aux.sig;}
    }
 // funcion para ordenar la lista por el exponente mayor
     public void ordenar (){
         int t1,t2;
        Nodo aux=this.sig;
        //Nodo cab=this.sig;
        while (aux!=null){
             Nodo nodosiguiente=aux.sig;
    while(nodosiguiente != null){
        
            if(aux.getExp()<nodosiguiente.getExp()){
                t1=nodosiguiente.getExp();
            t2= nodosiguiente.getCoef();
            nodosiguiente.setExp(aux.getExp());
            nodosiguiente.setCoef(aux.getCoef());
            aux.setExp(t1);
            aux.setCoef(t2);}
            
            nodosiguiente=nodosiguiente.sig;
            }
          aux=aux.sig;
          
    }
        //mostrar(cab);
}
     //funcion para copiar lista y no alterar la original
     public Nodo duplicar(){
      Nodo aux=this.sig;
         Nodo per=new Nodo();
         
          while (aux!= null){
             int t1 = aux.coef;
        int t2 = aux.exp;
        aux=aux.sig;
             per.insert(t1,t2);
             per.ordenar();
             //per.mostrar();
             
          }
     return per;
     }
     //funcion para derivar la lista 
     public void derivar(){
         Nodo aux=this.sig;
         while (aux!= null){
             aux.coef=((aux.coef)*(aux.exp));
             if (aux.exp==0){
             aux.coef=0;
             }
            else aux.exp= (aux.exp-1);
             aux=aux.sig;
         }
      
     }
     //funcion para sumar dos listas
    public void sumar(Nodo sum, Nodo sum1){
        Nodo aux=sum.sig;
     Nodo f=new Nodo();    
     Nodo nodo=sum1.sig;
                while ( nodo!=null && aux!= null){
             
        if(aux.exp==nodo.exp){
        int t1=(aux.coef+nodo.coef);
        int t2=nodo.exp;
        f.insert(t1, t2);
         aux=aux.sig;
        nodo=nodo.sig;
        }
        else if(aux.exp>nodo.exp ){
                int d=aux.coef;
                int d1=aux.exp;
                f.insert(d, d1);
                aux=aux.sig;
                }
        else {
             int q=nodo.coef;
             int q1=nodo.exp;
             f.insert(q, q1);
             nodo=nodo.sig;
        }   
        if(aux==null && nodo!=null){
            f.insert(nodo.coef,nodo.exp);
        }
        if (nodo==null && aux!=null){
            f.insert(aux.coef, aux.exp);
        }
                }
        f.ordenar();
        f.mostrar();
    
    }
       
        //funcion para restar dos listas
    public void restar(Nodo sum, Nodo sum1){
      Nodo aux=sum.sig;
     Nodo f=new Nodo();    
     Nodo nodo=sum1.sig;
                while ( nodo!=null && aux!= null){
             
        if(aux.exp==nodo.exp){
        int t1=(aux.coef-nodo.coef);
        int t2=nodo.exp;
        f.insert(t1, t2);
         aux=aux.sig;
        nodo=nodo.sig;
        
        }
       
        else if(aux.exp>nodo.exp ){
                int d=aux.coef;
                int d1=aux.exp;
                f.insert(d, d1);
                aux=aux.sig;
                }
        else {
             int q=nodo.coef;
             int q1=nodo.exp;
             f.insert(q, q1);
             nodo=nodo.sig;
        }   
        
        if(aux==null && nodo!=null){
            f.insert(0-nodo.coef,nodo.exp);
        }
        if (nodo==null && aux!=null){
        
            f.insert(aux.coef, aux.exp);
        }
      
                }
     
       
    
        f.ordenar();
        f.mostrar();
         }
    //funcion para evaluar la lista a un numero dado
   public void evaluar(double d){
    Nodo aux=this.sig;
    //Nodo t=new Nodo();
    while (aux!=null){
  double c= Math.pow(d, aux.exp);
  double f=c*aux.coef;
  aux=aux.sig;
        System.out.print(f+"->");
    }
    
    }
   // funcion para limpiar la lista 
   public void limpiar(){
   Nodo aux=this;
   this.sig=null;
   }
     
     }

     
    

     /*
     3.para el metodo sumar y restar estoy perdido, ¿como hago paa pedir otra lista ? no alterar la 
     inicial y me sume o reste los de exponente igual.
     */
     



