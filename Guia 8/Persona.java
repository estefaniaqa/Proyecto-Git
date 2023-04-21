/*
Crea un método void que reciba un objeto tipo persona como parámetro y utilice 
el get para mostrar sus atributos. Llama ese método desde el main.
 */
package Entity;

/**
 *
 * @author play_
 */
public class Persona {
    public String nombre;
    public int edad;
    
       public Persona() {
           this.nombre = "pepito";
           this.edad = 10;
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
