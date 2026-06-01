import estDat.estDatLin.Pila;
public class Emparejador
{
    //"()()))()()()"
    public boolean esValida(String sec){
        boolean es = true;
        Pila<Character> pila = new Pila<Character>();
        for(int i = 0; i<sec.length(); i++){
            char act = sec.charAt(i);
            if(act == '('){
                pila.push(act);
            }else{
                if(pila.estaVacia()){
                    es = false;
                }else{
                    pila.pop();
                }
            }
        }
        if(!pila.estaVacia()){
            es = false;
        }
        return es;
    }
}