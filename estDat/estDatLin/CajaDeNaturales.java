package estDat.estDatLin;

public class CajaDeNaturales
{
    private int capacidadMaxima;
    private int capacidadActual;
    private boolean estaRota;
    private NodoSE<Integer> ini;
    
    public CajaDeNaturales(int M){
        this.capacidadMaxima = M;
        this.capacidadActual = 0;
        this.estaRota = false;
        this.ini = null;
    }
    public boolean esVacia(){
        return ini == null;
    }
    private void romper(){
        this.estaRota = true;
        this.ini = null;
    }
    public void insertar(int dato){
        if(!this.estaRota){
            if(capacidadActual + dato > capacidadMaxima){
                romper();
            }else{
                NodoSE<Integer> nuevo = new NodoSE<Integer>(dato);
                if(esVacia()){
                    ini = nuevo;
                }else{
                    NodoSE<Integer> actual = ini;
                    while(actual.getSuc() != null){
                        actual = actual.getSuc();
                    }
                    actual.setSuc(nuevo);
                }
                capacidadActual+=dato;
            }
        }
    }
    
    public int capacidadLibre(){
        int espacioLibre;
        if(this.estaRota){
            espacioLibre = -1;
        }else{
            espacioLibre = this.capacidadMaxima - this.capacidadActual;
        }
        return espacioLibre;
    }
    
    public boolean consultar(int dato){
        boolean existe = false;
        if(esVacia()){
            existe = false;
        }else{
            NodoSE<Integer> actual = ini;
            while(actual != null && !existe){
                if(actual.getDato().equals(dato)){
                    existe = true;
                }
                actual = actual.getSuc();
            }
        }
        return existe;
    }
    
    public void arreglar(){
        this.ini = null;
        this.estaRota = false;
        this.capacidadActual = 0;
    }
    
}