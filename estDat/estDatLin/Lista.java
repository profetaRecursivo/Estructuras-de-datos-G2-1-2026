package estDat.estDatLin;


/**
 * Write a description of interface Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Lista<T>{
    /*
     * Metodo que permite saber el estado de la
     * lista
     * @param nada
     * @return si esta vacia o no
     */
    boolean esVacia();
    
    /*
     * Metodo que insertar un dato al final de la lista
     * @param dato a insertar
     * @return nada
     */
    void insertar(T dato);
    
    /*
     * Metodo que elimina el dato de la posicion pos, 
     * en caso de no existir la posicion hace nada.
     * Retorna el dato eliminado si existe, caso 
     * contrario devuelve null
     * @param pos valor entero positivo
     * @return dato eliminado
     */
    T eliminar(int pos);
    
    /*
     * Metodo que accede al dato de la posicion pos,
     * en caso de no existir la posicion retorna null
     * @param pos entero positivo
     * @return el dato de la posicion pos
     */
    T acceder(int pos);
    
    /*
     * metodo que permite insertar un dato en la posicion
     * por, en caso de no existir la posicion no se inserta
     * @param dato a insertar
     * @param pos entero positivo
     * @return nada
     */
    void insertar(T dato, int pos);
    
    /*
     * Metodo que permite buscar un dato en  la lista
     * @param dato a buscar
     * @return si esta o no
     */
    boolean buscar(T dato);
    
    /*
     * Metodo que devuelve el tamaño de la lista
     * @param nada
     * @return tamaño de la lista
     */
    int longitud();
    
    /*
     * Metodo que modifica el dato de la posicion pos
     * por uno nuevo, en caso de no existir la posicion
     * hace nada
     * @param pos la posicion a modificar
     * @paran nuevoDato el dato actual
     * @return nada
     */
    void modificar(int pos, T nuevoDato);
    
    /*
     * Metodo que intercambia los dato de las 
     * posiciones pos1 y pos2, sin no existiese alguna
     * de las posiciones se hace nada
     * @param pos1 la primera posicion
     * @param pos2 la segunda posicion
     * @return nada
     */
    void intercambiar(int pos1, int pos2);
    
    /*
     * Metodo que permite encontrar la posicion
     * de la primera ocurrencia de un dato en la lista, si el dato no existe
     * se devuelve -1
     * @param dato a buscar su posicion
     * @return posicion del dato
     */
    int indiceDe(T dato);
    
    /*
     * Metodo que permite vaciar la lista
     * @param nada
     * @return nada
     */
    void vaciar();
    
    /*
     * Metodo que permite eliminar un dato de la lista
     * en caso de no existir devuelve null
     * @param dato a eliminar
     * @return dato eliminado
     */
    T eliminar(T dato);
    
    /*
     * Metodo que permite eliminar todas la ocurrencias
     * de un dato de la lista
     * @param dato a eliminar
     * @return nada
     */
    void eliminarTodas(T dato);
    
    /*
     * metodo que cuente las instancias repetidas
     * de un dato
     * @param dato a inspeccionar
     * @return contador de ocurrencias
     */
    int contar(T dato);
}


