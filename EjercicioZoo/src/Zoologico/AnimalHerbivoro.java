package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public abstract class AnimalHerbivoro extends Animal{
    
    private float altura;

    public AnimalHerbivoro(int codigo, String nombre, float peso, float altura) {
        super(codigo, nombre, peso);
        this.altura = altura;
    }
/* Inser Code: getter and setter, esto para poder tener las llaves de las clases privadas donde se enviaran/traeran los parametros para los atributos*/
/* En este caso esta tomando y eviando datos a Animal y a sus clases hijas elefante, jirafa*/
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override/*Reescribe los datos de mostrarDatos() debido a que este campo ya existe*/
    public abstract String mostrarDatos(); /* se debe poner abstract y ; al final, debido a que la clase abstracta no mustra datos debido a que no es real es solo parte de la estructura*/
        
        
}
