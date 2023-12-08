package Zoologico;

/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public class Puma extends AnimalCarnivoro{/* extends: significa que la clase Puma es hija de la clase Animal Carnivoro */
    /* Creacion de un nuevo atributo "velocidad" */
    private float velocidad;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public Puma(int codigo, String nombre, float peso, int edad, float velocidad) {
        super(codigo, nombre, peso, edad);
        this.velocidad = velocidad;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override /*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public String mostrarDatos() {
        return "Puma{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() +", edad=" + getEdad() + ", velocidad=" + velocidad + '}';
    }
    /*Se utiliza getParametro() para traer el parametro de la clase padre, en este caso Animal Carnivoro, y en el atributo velocidad solo se utiliza velocidad debido a que es un atributo propio de la clase en la que esta*/
    
    
}
