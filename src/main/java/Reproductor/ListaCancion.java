package Reproductor;

//import org.listas.Lista;
//import org.listas.Nodo;


import java.util.Scanner;

public class ListaCancion {
    int opcion;
    String opc;
        
    NodoMusic Ant;
    NodoMusic Sig;
    NodoMusic Actual;
    Scanner scanner = new Scanner(System.in);

    
    public NodoMusic primero;
    public ListaCancion(){
        primero = null;
    }

//    private int leerEntero(){
//        System.out.println("Ingrese valor, -1 para terminar");
//        return Integer.parseInt(new Scanner(System.in).nextLine());
//    }
        public void Opcion(){
        System.out.println("\n\nReproductor de canciones");
        System.out.println("Ingrese el numero de la opcion que necesita");
        System.out.println("1. Mostrar Lista de Canciones");
        System.out.println("2. Reproducir");
        System.out.println("3. Siguiente Cancion");
        System.out.println("4. Cancion Anterior");
        System.out.println("5. Salir");
        opc = scanner.nextLine();
        opcion = Integer.parseInt(opc);
        }

        public void Switch(){
            Opcion();
        switch (opcion){
                case 1:
                visualizar();
                Switch();
                break;
                
                case 2:
                   Reproducir();
                   Switch();
                   break;
                case 3:
                    Siguiente();
                    Switch();
                    break;
                case 4:
                    Anterior();
                    Switch();
                    break; 
                case 5:
                    System.out.println("Hasta luego");
                    break;   
                default:
                    System.out.println("Opcion invalida");
                    Switch();
                    break;
                    
        }
        }
        
    public void visualizar(){
        NodoMusic n;
        int k =0;
        n = primero;
        while (n!= null){
            System.out.println(n.dato.getNombre()+" ");
            n = n.enlace;
            k++;
            System.out.print( (k%15 !=0 ? " " : "\n")  );
        }
    }

    public void CambiarCancion(){
        NodoMusic n;
        n = primero;
        
        System.out.println("Cancion Actual");
        System.out.println(n.dato.getNombre()+" ");
        n = n.enlace;

        System.out.println("Cancion Siguiente");
        System.out.println(n.dato.getNombre()+" ");
        Ant = primero;
        n = Ant;
        
        System.out.println("Cancion Anterior");
        System.out.println(n.dato.getNombre()+" ");
    }
    public void Reproducir(){
        NodoMusic n;
        n = primero;
        //Ant = primero;
        
        System.out.println("Reproduciendo");
        System.out.println(n.dato.getNombre()+" ");
        Ant = n;
        Actual = Ant;
        
        n = n.enlace;
        System.out.println("Cancion Siguiente");
        System.out.println(n.dato.getNombre()+" ");
        Sig = n;
        //Ant = n;
        
        
    }
    
    public void Siguiente(){
        NodoMusic n;
        
        if (Sig != null){
            n = Sig;
            System.out.println("Reproduciendo");
            System.out.println(n.dato.getNombre()+" ");
            Ant = Actual;
            Actual = n;

            n = n.enlace;
            if(n != null){
            System.out.println("Cancion Siguiente");
            System.out.println(n.dato.getNombre()+" ");
            Sig = n;
            
            }else{
                
                n = primero;
                System.out.println("Cancion Siguiente");
                System.out.println(n.dato.getNombre()+" ");
                Sig = n;
            }
        }
        
        else{
            Reproducir();
        }
        
    }
    
    public void Anterior(){
    NodoMusic n;
        if (Ant != null){
            n = Ant;
            System.out.println("Reproduciendo");
            System.out.println(n.dato.getNombre()+" ");
            
            n = n.enlace;
            if(n != null){
            System.out.println("Cancion Siguiente");
            System.out.println(n.dato.getNombre()+" ");
            Sig = n;
            }else{
             n = primero;
                System.out.println("Cancion Siguiente");
                System.out.println(n.dato.getNombre()+" ");
                Sig = n;  
            }
        }else{
            Reproducir();
        }
        
}


}
