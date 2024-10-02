
package animales;

public class Perro extends Animal {
    
    public Perro () {
        super ();
    }

    public Perro(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }
    
    public void Aullar () {
        System.out.println("El perro" + getNombre() + "comenzo a aullar con fuerza!");
    }
    
}
