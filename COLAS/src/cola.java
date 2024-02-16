public class cola {
    //atribustos de la abstracción
 private String pid;
 private int rafaga;
 private int tespera;
 private cola ant,sig;
 
 //constrctor por default
 public cola (){
 this.sig=null;
 this.ant=null;
 }
 //constructor sobrecargado
 public cola (String p, int x, int y){
 this.rafaga=x;
 this.tespera=y;
 this.pid=p;
 this.sig=null;
 this.ant=null;
 }
 //getter and setter

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    public int getTespera() {
        return tespera;
    }

    public void setTespera(int tespera) {
        this.tespera = tespera;
    }

    public cola getAnt() {
        return ant;
    }

    public void setAnt(cola ant) {
        this.ant = ant;
    }

    public cola getSig() {
        return sig;
    }

    public void setSig(cola sig) {
        this.sig = sig;
    }
 // metodo para insertar al final de la lista 
   public void append(cola r){
     cola aux=this;
      while(aux.sig!=null){
       aux=aux.sig;
      }
     aux.sig=r;
     r.ant=aux;
    } 
   // metodo para quitar el primer elemento de la lista 
   public cola removefirst(){
    cola aux=this.sig;
     if(aux==null){
     return null;
     }
     this.sig=aux.sig;
      if(aux.sig!=null){
      aux.sig.ant=this;
      }
     aux.sig=null;
     aux.ant=null;
     return aux;
    }
// metodo para verificar si la lista esta vacia
   public boolean vacia(){
   return this.sig==null;
   }
    //metodo para rotar cuando la rafaga sea mayor a 0
   public void rotarizq(){
   cola r=this.removefirst();
   if(r!=null){
   this.append(r);
   }
   }
   //metodo para sumar el tespera cuando la rafaga-quantum sea >0
/*   public void sumarte (){
   if(this.sig==null){
       System.out.println("lista vacia no hay nada para aumentar");
   }
   else{
     cola aux= this.sig;
     while (aux!=null){
      aux.tespera= aux.tespera+100;
      aux=aux.sig;
     }
   }
   
   }
   //metodo para sumar el tespera cuando la rafaga-quantum sea<0
  public void sumarend (){
   if(this.sig==null){
       System.out.println("lista vacia no hay nada para aumentar");
   }
   else{
     cola aux= this.sig;
      int temp=aux.getRafaga();
     while (aux!=null){
        aux.tespera=aux.tespera+temp;
      aux=aux.sig;
     }
   }
   
   }
  // metodo para imprimir la cola 
  public void mostrar(){
cola aux=this.sig;
 while (aux!=null){
     System.out.print("_"+aux.pid+"|"+aux.rafaga+"|"+aux.tespera +"-");
     aux=aux.sig;
 }

}
  //metodo para sumar el tiempo total
  public int sumart(){
  cola aux=this.sig;
  int r=0;
  while (aux!=null){
  r=r+aux.tespera;
  aux=aux.sig;
  }
  return r;
  }*/
   
   public void sumar(int x){
   cola aux=this.removefirst();
   cola pri=aux;
   aux.setTespera(aux.getTespera()+x);
   this.append(aux);
   cola aux1=this.sig;
   while(aux1!=pri){
   aux1.setTespera(aux1.getTespera()+x);
   this.rotarizq();
   aux1=this.sig;
   }
   this.getSig().setRafaga(this.getSig().getRafaga()-x);
   this.rotarizq();
       //System.out.println(this.getSig().rafaga);
   }
   
   public void sumar1(){
   cola aux=this.removefirst();
   cola pri=aux;
   int f=aux.getRafaga();
   aux.setTespera(aux.getTespera()+f);
   this.append(aux);
   cola aux1=this.sig;
   while(aux1!=pri){
   aux1.setTespera(aux1.getTespera()+f);
   this.rotarizq();
   aux1=this.sig;
   }
   
   System.out.println("el proceso" +" "+ this.getSig().getPid()+" " + "ha terminado su tiempo de espera fue:"
                + this.getSig().getTespera()+"ms");
   this.removefirst();
   }
}

