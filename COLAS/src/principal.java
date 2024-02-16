public class principal {
    public static void main(String[] args) {
   
    int tes=0;
    int q=100;
    
    int rm=130;
    cola pm= new cola("pm", rm, tes);
    int rc=83;
    cola pc=new cola("pc", rc, tes);
    int re=525;
    cola pe=new cola("pe",re,tes);
    
    cola z=new cola();
     z.append(pm);z.append(pc);z.append(pe);   cola n=new cola();
        do {  //z.getSig().getRafaga();           
            /*if((z.getSig().getRafaga()-q)>0){
              /* //System.out.println(z.getSig().getRafaga());
             z.sumarte();
             int w= (z.getSig().getRafaga()-100);
             z.getSig().setRafaga(w);
             //System.out.println(z.getSig().getRafaga());
             z.rotarizq();
             /*z.mostrar();
                System.out.println("");*/
              /*cola temp=new cola();
              while(!z.vacia()){
              z.getSig().setTespera(z.getSig().getTespera()+q);
              cola tem= z.removefirst();
              temp.append(tem);
              }
              
              while(!temp.vacia()){
              cola te=temp.removefirst();
              z.append(te);
              }
              z.getSig().setRafaga(z.getSig().getRafaga()-q);
              z.rotarizq();
            }
            else if((z.getSig().getRafaga()-q)<=0){
                /*z.sumarend();
                //z.mostrar();
                cola e= z.removefirst();
              n.append(e);*/
               /*cola temp1=new cola();
               int r=z.getSig().getRafaga();
               while(!z.vacia()){
               z.getSig().setTespera(z.getSig().getTespera()+r);
               cola t1=z.removefirst();
               temp1.append(t1);
               }
               while(!temp1.vacia()){
               cola t2=temp1.removefirst();
               z.append(t2);
               }
               
              System.out.println("el proceso" +" "+ z.getSig().getPid()+" " + "ha terminado su tiempo de espera fue:"
                + z.getSig().getTespera()+"ms");
              
              z.removefirst();
            }*/
            if((z.getSig().getRafaga()-q)>0){
            z.sumar(q);
            }
            else{
            z.sumar1();
            }
        } while (!z.vacia());
        
        //System.out.println("el tiempo total del proceso fue: " + " " + n.sumart()+"ms");
    } 
}
