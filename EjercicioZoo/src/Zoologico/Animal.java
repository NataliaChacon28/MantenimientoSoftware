package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public abstract class Animal {
    private int codigo;
    private String nombre;
    private float peso;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public Animal(int codigo, String nombre, float peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract String mostrarDatos(); /* se debe poner abstract y ; al final, debido a que la clase abstracta no mustra datos debido a que no es real es solo parte de la estructura*/
       
    
    
}
