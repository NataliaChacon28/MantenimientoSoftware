package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public abstract class AnimalCarnivoro extends Animal {

    private int edad;
/* Inser Code: Constructor*/ /* Se debe ordenar los parametros*/
    public AnimalCarnivoro(int codigo, String nombre, float peso, int edad) {
        super(codigo, nombre, peso);
        this.edad = edad;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    @Override /*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public abstract String mostrarDatos(); /* se debe poner abstract y ; al final, debido a que la clase abstracta no mustra datos debido a que no es real es solo parte de la estructura*/
     
    
    
}
