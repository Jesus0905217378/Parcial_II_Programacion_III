package Reproductor;

//import org.listas.Nodo;

public class NodoMusic {

    Cancion dato;
    NodoMusic enlace;


    public NodoMusic(Cancion x){
        dato = x;
        enlace=null;
    }

    public NodoMusic(Cancion x, NodoMusic n){
        dato= x;
        enlace = n;
    }


}
