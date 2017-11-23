//TERMINAR
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    }
    
}
class Nodo{
private int iVal;
private Nodo Sig;
private Nodo prev;

public Nodo(){
iVal=0;
Sig=null;
prev=null;
  }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getSig() {
        return Sig;
    }

    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

}

class ListaDE{
private Nodo Ini;
private Nodo Fin;

public ListaDE(){
Ini=null;
Fin=null;
  }

public ListaDE(Nodo nNodo){
    Ini=nNodo;
    Fin=Fin;

 } 
public void agregarNodo(Nodo nNodo){ //INSERTAR NODO FINAL - BUENO
 if(Ini == null){ //cuando la lista este vacia
 Ini=nNodo; // NUESTRO NUEVO ES EL PRIMERO
 Fin = nNodo;    //Y EL ULTIMO
 } else {
     Fin.setSig(nNodo);//AGREGAMOS EL NUEVO NODO AL FINAL DE LA LISTA
     Fin=nNodo;
     //nFn= nFn.getnSig(); ESTO TAMBIEN ES VALIDO
 }   


}
 public void imprimirLista(){
       if(Ini==null){
           System.out.println("LISTA VACIA");
      } else { 
        Nodo nTemp = Ini;
        while(nTemp != null){
            System.out.print(nTemp.getiVal() + " - ");    
        nTemp = nTemp.getSig();
        }
      }
  }

}