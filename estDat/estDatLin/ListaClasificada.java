package estDat.estDatLin;

public class ListaClasificada<T>
{
    private NodoSE<T> ini;
    
    public ListaClasificada(){
        ini = null;
    }
    
    public boolean estaVacia(){
        return ini == null;
    }
    
    public void insertar(T dato){
        NodoSE<T> nuevo = new NodoSE<T>(dato);
        if(estaVacia()){
            ini = nuevo;
        }else{
            NodoSE<T> actual = ini;
            boolean existe = false;
            while(actual != null && !existe){
                if(actual.getDato().equals(dato)){
                    existe = true;
                }
                if(!existe){
                    actual = actual.getSuc();
                }
            }
            
        }
    }
    
    
    
    
    
}