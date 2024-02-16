public class Nodopila {

    private char inf;
    private Nodopila sig;
    
    public Nodopila(){
    this.sig=null;
    }
    
    public Nodopila (char c){
    this.inf=c;
    this.sig=null;
    }
//getter and setter
    public char getInf() {
        return inf;
    }

    public void setInf(char inf) {
        this.inf = inf;
    }

    public Nodopila getSig() {
        return sig;
    }

    public void setSig(Nodopila sig) {
        this.sig = sig;
    }
  //fin getter and setter
    //metodo para saber si no hay elemntos en la pila
    public boolean pilaVacia(){
    return this.sig==null;
    }
    //metodo para sacar elemento de a pila
    public Nodopila pop(){
    if(this.pilaVacia()){ return null;}
    Nodopila aux=this.sig;
    this.sig=aux.sig;
    aux.sig=null;
    return aux;
    }
    //metodo para agregar elementto a la pila
    public void push(char x){
    Nodopila n= new Nodopila(x);
    n.sig=this.sig;
    this.sig=n;
    }
    //metodo para convertir la expresion infija a postfija
       public static String convertir(String infija){
   String postfija= "";
     Nodopila aux = new Nodopila();
     for (int i = 0; i < infija.length(); i++) {
       char caracter= infija.charAt(i);

       if(caracter=='('){
                aux.push(caracter);}
                
                else if(caracter==')'){
            do {       
             
             Nodopila temp=aux.pop();
                              
                        postfija+=" "+temp.inf;
                  } while (aux.sig.inf != '(');
              aux.pop();
              }        
            else  if(caracter == '+' || caracter =='-' || caracter =='*' || caracter == '/' 
                || caracter == '^'){
             
                if(aux.pilaVacia()){
                  aux.push(caracter);
                                    }
                else if(!aux.pilaVacia()){
                   int pe=pexpresion(caracter);
                   int pp=ppila(aux.sig.inf);
                   if(pe>pp){
             aux.push(caracter);
             }
             else if(pe==pp){
             Nodopila temp=aux.pop();
              postfija+= "" + temp.inf;
             aux.push(caracter);
             }
             
        
              else if(pe<pp){
                 do{
            
                   Nodopila temp=aux.pop();
              postfija+= "" + temp.inf;
             
                if(aux.pilaVacia()){
                 aux.push(caracter);
                 break;
                 }
              else {
               aux.push(caracter);
               break;
               }
                 } while(pe<pp);
                
            }
              
             else{
                  
                 Nodopila temp=aux.pop();
             postfija+= "" + temp.inf;
             aux.push(caracter);
             }
            }
            
            
           }
        
        else{
             postfija+= " " + caracter;
                }
     }
     while(!aux.pilaVacia()){
      Nodopila temp=aux.pop();
             postfija+= "" + temp.inf;
     }
     
     
     return postfija;
 }
  
       
       public static int pexpresion(char operador){
    if (operador== '^') return 4;
    if (operador=='*'||operador == '/') return 2;
    if (operador=='+'||operador == '-') return 1;
    if (operador=='(') return 5;
    return 0;
    }
    
    public static int ppila(char operador){
    if (operador== '^') return 3;
    if (operador=='*'||operador == '/') return 2;
    if (operador=='+'||operador == '-') return 1;
    if (operador=='(') return 0;
    return 0;
    }
}
