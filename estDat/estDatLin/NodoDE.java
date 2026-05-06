package estDat.estDatLin;


/**
 * Write a description of class NodoDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoDE<T>{
    private NodoDE<T> ant;
    private T         dato;
    private NodoDE<T> suc;
    
    public NodoDE(T dato){
        this.dato = dato;
        suc       = null;
        ant       = null;
    }
    
    public void setSuc(NodoDE<T> suc){
        this.suc = suc;
    }
    
    public void setAnt(NodoDE<T> ant){
        this.ant = ant;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }
    
    public NodoDE<T> getSuc(){
        return suc;
    }
    
    public NodoDE<T> getAnt(){
        return ant;
    }
    
    public T getDato(){
        return dato;
    }
}
