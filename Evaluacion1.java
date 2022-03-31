
package Evaluacion1;


import java.util.Scanner;

public class Evaluacion1 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        double longitud=1;
        double anchura=1;
        int area_rectangulo;
     
        System.out.println("longitud del rectangulo:");
        longitud=leer.nextDouble();
        System.out.println("perimetro del rectangulo");
        double perimetro = leer.nextDouble();
        System.out.println("base del rectangulo:");
        double base = leer.nextDouble();
        System.out.println("altura del rectangulo:");
        double altura = leer.nextDouble();
        
        
        System.out.println("los resultados del perimetro sera:" + Evaluacion1.calcularPerimetro(longitud,anchura));
        System.out.println("los  resultados del area sea:" + Evaluacion1.calcularArea(altura,base));
        
        if( longitud >0 && longitud< 20.00 && anchura>0 && anchura<20.00){
            System.out.println("La longitud mayor sera de");
        }else{
            System.out.println("La anchura menor sera de");
        }
        
        
        
    }
    public static double calcularPerimetro(double longitud,double anchura){
        double perimetro=0;
        perimetro= 2*longitud + anchura;                                      
        return perimetro;
        
        
        
    }
    
    public static double calcularArea(double altura, double base){
        double area_rectangulo=0;
        area_rectangulo = (base * altura);
       return area_rectangulo;
    }
    
       
        
    
    

}
