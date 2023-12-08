package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public class Cocodrilo extends AnimalCarnivoro{/* extends: significa que la clase cocodrilo es hija de la clase Animal Carnivoro */
    /* Creacion de un nuevo atributo "NoDientes", numero de dientes */
    private int NoDientes ;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public Cocodrilo(int codigo, String nombre, float peso, int edad, int NoDientes) {
        super(codigo, nombre, peso, edad);
        this.NoDientes = NoDientes;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/

    public int getNoDientes() {
        return NoDientes;
    }

    public void setNoDientes(int NoDientes) {
        this.NoDientes = NoDientes;
    }
     
    @Override /*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public String mostrarDatos() {
        return "Cocodrilo{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() +", edad=" + getEdad() + ", NoDientes=" + NoDientes + '}';
    }
    /*Se utiliza getParametro() para traer el parametro de la clase padre, en este caso Animal Carnivoro, y en el atributo NoDientes solo se utiliza NoDientes debido a que es un atributo propio de la clase en la que esta*/
    
}
