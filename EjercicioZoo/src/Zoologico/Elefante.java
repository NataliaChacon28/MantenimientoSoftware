package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public class Elefante extends AnimalHerbivoro{ /* extends: significa que la clase Elefante es hija de la clase Animal Herbivoro */
    
    private float precio;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public Elefante(int codigo, String nombre, float peso, float altura, float precio) {
        super(codigo, nombre, peso, altura);
        this.precio = precio;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override /*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public String mostrarDatos() {
        return "Elefante{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() +", altura=" + getAltura() + ", precio=" + precio + '}';
    } /*Se utiliza getParametro() para traer el parametro de la clase padre, en este caso Animal Herbivoro, y en el atributo precio solo se utiliza precio debido a que es un atributo propio de la clase en la que esta*/
    
}
