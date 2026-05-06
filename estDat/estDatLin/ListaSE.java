package estDat.estDatLin;

public class ListaSE<T> implements Lista<T>{
    private T          ini;
    private ListaSE<T> sig;  
    
    public ListaSE(){
        ini = null;
        sig = null;
    }
    
    /*
     * Metodo que permite saber el estado de la
     * lista
     * @param nada
     * @return si esta vacia o no
     */
    public boolean esVacia(){
        return ini == null;
    }
    
    /*
     * Metodo que insertar un dato al final de la lista
     * @param dato a insertar
     * @return nada
     */
    public void insertar(T dato){
        if(esVacia()){
            ini = dato;
            sig = new ListaSE<T>();
        }else{
            sig.insertar(dato);
        }
    }
    
    /*
     * Metodo que elimina el dato de la posicion pos, 
     * en caso de no existir la posicion hace nada.
     * Retorna el dato eliminado si existe, caso 
     * contrario devuelve null
     * @param pos valor entero positivo
     * @return dato eliminado
     */
    public T eliminar(int pos){
        T elDato;
        if(esVacia()){
            elDato = null;
        }else{
            if(pos == 0){
                elDato = ini;
                ini = sig.ini;
                sig = sig.sig;
            }else{
                elDato = sig.eliminar(pos-1);
            }
        }
        return elDato;
    }
    
    /*
     * Metodo que accede al dato de la posicion pos,
     * en caso de no existir la posicion retorna null
     * @param pos entero positivo
     * @return el dato de la posicion pos
     */
    public T acceder(int pos){
        return null;
    }
    
    /*
     * metodo que permite insertar un dato en la posicion
     * por, en caso de no existir la posicion no se inserta
     * @param dato a insertar
     * @param pos entero positivo
     * @return nada
     */
    public void insertar(T dato, int pos){
    }
    
    /*
     * Metodo que permite buscar un dato en  la lista
     * @param dato a buscar
     * @return si esta o no
     */
    public boolean buscar(T dato){
        boolean esta;
        if(esVacia()){
            esta = false;
        }else{
            if(ini.equals(dato)){
                esta = true;
            }else{
                esta = sig.buscar(dato);
            }
        }
        return esta;
    }
    
    /*
     * Metodo que devuelve el tamaño de la lista
     * @param nada
     * @return tamaño de la lista
     */
    public int longitud(){
        return 0;
    }
    
    /*
     * Metodo que modifica el dato de la posicion pos
     * por uno nuevo, en caso de no existir la posicion
     * hace nada
     * @param pos la posicion a modificar
     * @paran nuevoDato el dato actual
     * @return nada
     */
    public void modificar(int pos, T nuevoDato){
    }
    
    /*
     * Metodo que intercambia los dato de las 
     * posiciones pos1 y pos2, sin no existiese alguna
     * de las posiciones se hace nada
     * @param pos1 la primera posicion
     * @param pos2 la segunda posicion
     * @return nada
     */
    public void intercambiar(int pos1, int pos2){
    }
    
    /*
     * Metodo que permite encontrar la posicion
     * de la primera ocurrencia de un dato en la lista, si el dato no existe
     * se devuelve -1
     * @param dato a buscar su posicion
     * @return posicion del dato
     */
    public int indiceDe(T dato){
        return 0;
    }
    
    /*
     * Metodo que permite vaciar la lista
     * @param nada
     * @return nada
     */
    public void vaciar(){
    }
    
    /*
     * Metodo que permite eliminar un dato de la lista
     * en caso de no existir devuelve null
     * @param dato a eliminar
     * @return dato eliminado
     */
    public T eliminar(T dato){
        return null;
    }
    
    /*
     * Metodo que permite eliminar todas la ocurrencias
     * de un dato de la lista
     * @param dato a eliminar
     * @return nada
     */
    public void eliminarTodas(T dato){
    }
    
    /*
     * metodo que cuente las instancias repetidas
     * de un dato
     * @param dato a inspeccionar
     * @return contador de ocurrencias
     */
    public int contar(T dato){
        return 0;
    }
}
