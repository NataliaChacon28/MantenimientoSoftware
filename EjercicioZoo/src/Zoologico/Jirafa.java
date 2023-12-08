package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public class Jirafa extends AnimalHerbivoro { /* extends: significa que la clase Jirafa es hija de la clase Animal Herbivoro */
    
    private String color;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public Jirafa(int codigo, String nombre, float peso, float altura, String color) {
        super(codigo, nombre, peso, altura);
        this.color = color;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override /*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public String mostrarDatos() {
        return "Jirafa{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() +", altura=" + getAltura() + ", color=" + color + '}';
    } /*Se utiliza getParametro() para traer el parametro de la clase padre, en este caso Animal Herbivoro, y en el atributo color solo se utiliza color debido a que es un atributo propio de la clase en la que esta*/
    
    
    
}
