package estDat.estDatLin;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListaDETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaDETest
{
    /**
     * Default constructor for test class ListaDETest
     */
    public ListaDETest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /*
     * Metodo que permite saber el estado de la
     * lista
     * @param nada
     * @return si esta vacia o no
     */
    @Test
    public void testEsVacia(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
    }
    
    /*
     * Metodo que insertar un dato al final de la lista
     * @param dato a insertar
     * @return nada
     */
    @Test
    public void testInsertarDato(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        lista.insertar('a');
        assertEquals(false, lista.esVacia());
    }
    
    /*
     * Metodo que elimina el dato de la posicion pos, 
     * en caso de no existir la posicion hace nada.
     * Retorna el dato eliminado si existe, caso 
     * contrario devuelve null
     * @param pos valor entero positivo
     * @return dato eliminado
     */
    @Test
    public void testEliminarPos(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        lista.insertar('a');
        lista.insertar('n');
        assertEquals(null, lista.eliminar(10));
        assertEquals(new Character('a'), lista.eliminar(0));
        assertEquals(new Character('n'), lista.eliminar(0));
        assertEquals(true, lista.esVacia());
    }
    
    /*
     * Metodo que accede al dato de la posicion pos,
     * en caso de no existir la posicion retorna null
     * @param pos entero positivo
     * @return el dato de la posicion pos
     */
    @Test
    public void testAccederPos(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        lista.insertar('a');
        lista.insertar('n');
        assertEquals(null, lista.acceder(10));
        assertEquals(new Character('a'), lista.acceder(0));
        assertEquals(new Character('a'), lista.acceder(0));
        assertEquals(false, lista.esVacia());
    }
    
    /*
     * metodo que permite insertar un dato en la posicion
     * pos, en caso de no existir la posicion no se inserta
     * @param dato a insertar
     * @param pos entero positivo
     * @return nada
     */
    @Test
    public void testInsertarPos(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        lista.insertar('a', 10);
        assertEquals(true, lista.esVacia());
        lista.insertar('a', 0);
        assertEquals(false, lista.esVacia());
        assertEquals(new Character('a'), lista.acceder(0));
        lista.insertar('n', 0);
        assertEquals(new Character('n'), lista.acceder(0));
        
    }
    
    /*
     * Metodo que permite buscar un dato en  la lista
     * @param dato a buscar
     * @return si esta o no
     */
    @Test
    public void testBuscar(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o', 0);
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        assertEquals(false, lista.esVacia());
        assertEquals(true, lista.buscar(new Character('a')));
        assertEquals(false, lista.buscar(new Character('z')));
        assertEquals(false, lista.buscar(new Character('A')));
    }
    
    /*
     * Metodo que devuelve el tamaño de la lista
     * @param nada
     * @return tamaño de la lista
     */
    @Test
    public void testLongitud(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o', 0);
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        assertEquals(5, lista.longitud());
        
    }
    
    /*
     * Metodo que modifica el dato de la posicion pos
     * por uno nuevo, en caso de no existir la posicion
     * hace nada
     * @param pos la posicion a modificar
     * @paran nuevoDato el dato actual
     * @return nada
     */
    @Test
    public void testModificar(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o', 0);
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        assertEquals(true,lista.buscar('a'));
        lista.modificar(0, 'b');
        assertEquals(false,lista.buscar('a'));
    }
    
    /*
     * Metodo que intercambia los dato de las 
     * posiciones pos1 y pos2, sin no existiese alguna
     * de las posiciones se hace nada
     * @param pos1 la primera posicion
     * @param pos2 la segunda posicion
     * @return nada
     */
    @Test
    public void testIntercambiar(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o');
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        lista.intercambiar(0,2);
        assertEquals(new Character('h'),lista.acceder(0));
        assertEquals(new Character('u'),lista.acceder(2));
    }
    
    /*
     * Metodo que permite encontrar la posicion
     * de la primera ocurrencia de un dato en la lista, si el dato no existe
     * se devuelve -1
     * @param dato a buscar su posicion
     * @return posicion del dato
     */
    @Test
    public void testIndiceDe(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o');
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        lista.intercambiar(0,2);
        assertEquals(0,lista.indiceDe('h'));
        assertEquals(2,lista.indiceDe('u'));
        assertEquals(4,lista.indiceDe('o'));
    }
    
    /*
     * Metodo que permite vaciar la lista
     * @param nada
     * @return nada
     */
    @Test
    public void testVaciar(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o');
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        lista.vaciar();
        assertEquals(-1,lista.indiceDe('h'));
        assertEquals(-1,lista.indiceDe('u'));
        assertEquals(-1,lista.indiceDe('o'));
    }
    
    /*
     * Metodo que permite eliminar un dato de la lista
     * en caso de no existir devuelve null
     * @param dato a eliminar
     * @return dato eliminado
     */
    @Test
    public void testEliminarDato(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('o');
        lista.insertar('r', 0);
        lista.insertar('u', 0);
        assertEquals(new Character('h'),lista.eliminar('h'));
        assertEquals(null,lista.eliminar('z'));
        assertEquals(null,lista.eliminar('h'));
    }
    
    /*
     * Metodo que permite eliminar todas la ocurrencias
     * de un dato de la lista
     * @param dato a eliminar
     * @return nada
     */
    @Test
    public void testEliminarTodas(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('r');
        lista.insertar('r', 0);
        lista.insertar('a', 0);
        lista.eliminarTodas('a');
        assertEquals(3, lista.longitud());
        lista.eliminarTodas('r');
        assertEquals(1, lista.longitud());
    }
    
    /*
     * metodo que cuente las instancias repetidas
     * de un dato
     * @param dato a inspeccionar
     * @return contador de ocurrencias
     */
    @Test
    public void testContar(){
        ListaDE<Character> lista;
        lista = new ListaDE<Character>();
        assertEquals(true, lista.esVacia());
        assertEquals(0, lista.longitud());
        lista.insertar('a', 0);
        lista.insertar('h', 0);
        lista.insertar('r');
        lista.insertar('r', 0);
        lista.insertar('a', 0);
        assertEquals(2, lista.contar('a'));
        assertEquals(1, lista.contar('h'));
        assertEquals(0, lista.contar('z'));
    }
}
