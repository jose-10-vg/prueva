
package animales;

public class Principal {
    
    public static void main(String[] args) {
        
        Perro guepardo = new Perro ();
        guepardo.setNombre("tony");
        
        Perro perro2 = new Perro ("Pincher", "Toli", 9);
        
        perro2.Aullar();
        perro2.setNombre("matias");
        
        System.out.println("el nombre del guepardo es:" + guepardo.getNombre());
        
        perro2.Aullar();
    }
}
