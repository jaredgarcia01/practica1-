
import EDIFICIO.EDIFICIO;

public class recursoshumanos
{ private Scanner TECLADO; private String NOMBRE,DIRECCION,NUMEDIFICIO; 
private int CARGODE,CODIGO,EDAD; private double SALARIO,SALARIOFINAL,RENTA,AFP,ISSS; 
public void INICIALIZAR()
{ TECLADO=new Scanner(System.in);
System.out.print("INGRESE EL NOMBRE:");
NOMBRE=TECLADO.next(); 
System.out.print("INGRESE LA EDAD:");
EDAD=TECLADO.nextInt(); 
System.out.print("INGRESE EL SALARIO BRUTO:");
SALARIO =TECLADO.nextDouble();
System.out.print("Ingrese 1 si su cargo es por Servicio y 2 si es Permanente:"); 
CARGODE =TECLADO.nextInt(); 
System.out.print("INGRESE LA DIRECCION:");
DIRECCION=TECLADO.next(); 
System.out.print("INGRESE EL NUMERO DE EDIFICIO ");
NUMEDIFICIO=TECLADO.next(); 
System.out.println(""); } 
public void imprimir()
{ System.out.println("NOMBRE:"+NOMBRE+"\n");
System.out.println("EDAD:"+EDAD+"\n");
System.out.println("DIRECCION:"+DIRECCION+"\n");
System.out.println("NUMERO DEL EDIFICIO :"+NUMEDIFICIO );
System.out.println(""); } 
public void cargo() 
{ if (CARGODE==1) { RENTA= (SALARIO * 0.10); SALARIOFINAL= (SALARIO-RENTA);
System.out.println("");
System.out.print("su cargo es por servicio y su Salario final es :"+ SALARIOFINAL);
System.out.println(""); } 
else if(CARGODE ==2){ RENTA= (SALARIO * 0.10);
ISSS= (SALARIO 0.10); AFP= (SALARIO * 0.10); SALARIOFINAL= (SALARIO-RENTA-ISSS-AFP);
System.out.println(""); System.out.print(" su cargo es permanente y su salario final es :"+SALARIOFINAL); 
System.out.println(""); } } 
public static void main(String[] args) { EDIFICIO.EDIFICIO= new EDIFICIO(); recursoshumanos DEPERSONAL; DEPERSONAL= newRecursosHumanos();
DEPERSONAL.INICIALIZAR(); DEPERSONAL.IMPRIMIR(); DEPERSONAL.CARGO(); 
System.out.println(""); objeto.getUbicacion(); objeto.getNombreE();
objeto.getCantidadDeper(); objeto.getCantidadPisos(); System.out.println("");
codigo_area codigo= new codigo_area(); codigo.getaulas(); codigo.getbiblioteca(); codigo.getcanchita(); codigo.getlaboratorio(); codigo.getzonaverde(); }
}