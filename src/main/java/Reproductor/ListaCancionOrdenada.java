package Reproductor;

public class ListaCancionOrdenada extends  ListaCancion{
    public ListaCancionOrdenada(){
        super();
    }

    public ListaCancionOrdenada insertar(Cancion x){
        NodoMusic nuevo;
        nuevo = new NodoMusic(x);
        if (primero == null){
            primero = nuevo;
        }else{
            if (x.getNombre().compareTo(primero.dato.getNombre())<0){
                nuevo.enlace = primero;
                primero = nuevo;
            }else{
                NodoMusic anterior, p;
                anterior = primero;
                p = primero.enlace;
                while (p!=null && x.getNombre().compareTo(p.dato.getNombre())>0){
                    anterior = p;
                    p = p.enlace;
                }
                nuevo.enlace = anterior.enlace;
                anterior.enlace = nuevo;
            }
        }
        return this;
    }
}
