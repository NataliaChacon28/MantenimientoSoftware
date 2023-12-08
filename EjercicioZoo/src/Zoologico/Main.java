package Zoologico;
/**
 * correo institucional: nchaconr@ibero.edu.co
 * IdBanner: 100109053
 * @author Natalia Raquel Chacon Rios 
 */
public class Main {
 /*psvm+altswitch*/
    public static void main(String[] args) {
        
        /*Polimorfismo: porque solo se esta usando solo una forma de impresion pero se necesita imprimir diferentes formas/objetos (animales)*/
        Animal misAnimales[] = new Animal[5];
        
        misAnimales[0] = new Jirafa(101,"Jirafona",200,3.5f,"amarillo");
        misAnimales[1] = new Jirafa(102,"Jirafita",100,1.5f,"cafe");
        misAnimales[2] = new Elefante(201,"dumbo",800,2.5f,120f);
        misAnimales[3] = new Puma(301,"Puma",100,8,120f);
        misAnimales[4] = new Cocodrilo(401,"Coquito",250,5,80);
        
        /*Imprimir el arreglo con for each*/
        for(Animal i:misAnimales){
            System.out.println(i.mostrarDatos());/*sout+altswitch*/
            System.out.println("");
        }        
        
    }
    
}
