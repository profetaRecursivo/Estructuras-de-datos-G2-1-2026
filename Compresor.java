import estDat.estDatLin.*;
public class Compresor
{
    public Lista<Integer> comprimir(Lista<Integer> sec){
        Lista<Integer> res = new ListaSE<Integer>();
        Pila<Integer> pila = new Pila<Integer>();
        for(int i = 0; i<sec.getSize(); i++){
            int act = sec.acceder(i);
            if(pila.estaVacia()){
                pila.push(act);
            }else{
                int sum = act;
                while(!pila.estaVacia() && sum == pila.top()){
                    sum+=pila.top();
                    pila.pop();
                }
                pila.push(sum);
            }
        }
        res = invertir(pila);
        return res;
    }
    private Lista<Integer> invertir(Pila<Integer> pila){
        Lista<Integer> lista = new ListaSE<Integer>();
        Pila<Integer> aux = new Pila<Integer>();
        while(!pila.estaVacia()){
            aux.push(pila.pop());
        }
        while(!aux.estaVacia()){
            lista.insertar(aux.pop());
        }
        return lista;
    }
}