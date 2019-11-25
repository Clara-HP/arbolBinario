
package arbolbinario;


public class ArbolBinario {

   
    public static void main(String[] args) {
       arbol al = new  arbol(23);
       
       al.agregar(new  Nodo(23), al.getRaiz());
       al.agregar(new  Nodo(14), al.getRaiz());
       al.agregar(new  Nodo(9), al.getRaiz());
       al.agregar(new  Nodo(2), al.getRaiz());
       al.agregar(new  Nodo(10), al.getRaiz());
       al.agregar(new  Nodo(16), al.getRaiz());
       al.agregar(new  Nodo(15), al.getRaiz());
       al.agregar(new  Nodo(20), al.getRaiz());
       al.agregar(new  Nodo(30), al.getRaiz());
       al.agregar(new  Nodo(50), al.getRaiz());
       al.agregar(new  Nodo(51), al.getRaiz());
       al.recorrerPreorden(al.getRaiz());
    }
    
}
