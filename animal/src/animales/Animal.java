
package animales;

public class Animal {
    
    private String raza;
    private String nombre;
    private int edad;
    
    public Animal () {
        
      System.out.println("estas llamando el primer contructor de animal") ;
      
    }

    public Animal(String raza, String nombre, int edad) {
        
        System.out.println("estas llamando el segund contructor de animal");
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
