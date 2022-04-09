package ar.edu.unju.edu.Application;

import ar.edu.unju.edm.model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tpn00QuinterosmarcosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tpn00QuinterosmarcosApplication.class, args);	        
		// PRIMERA ACTIVIDAD COLOCAR NOMBRE Y MOSTRAR POR PANTALLA
	       
	    String nombre = "Marcos";
	     
	    System.out.println("HOLA EDM, dice " + nombre + " " + darNombre());
	     
	    Estudiante unEstudiante = new Estudiantes;
	     
	    unEstudiante.setDni("45085907");
	    unEstudiante.setNombre("MARCOS QUINTEROS");
	     
	    System.out.println("El Estudiante  " + unEstudiante.getNombre + " dice HOLA!");
	    
	    public static String darNombre() {
	    	
	    	String nuevoNombre = "Quinteros";
	    	
	    	return nuevoNombre;
	    }
	        

	    // Clase
	    // SEGUNDA ACTIVIDADAD REALIZAR UNA CALCULADORA
	    
	    Calculadora unCalculadora = new Calculadora(); // Metodo Construccion
	    unCalculadora.setNumero1(10);
	    unCalculadora.setNumero2(2);
	    System.out.println("El resultado de la Suma es: " + unCalculadora.ResolverSuma());
	    System.out.println("El resultado de la Resta es: " + unCalculadora.ResolverResta());
	    System.out.println("El resultado de la Multiplicacion es: " + unCalculadora.ResolverMulti());
	    System.out.println("El resultado de la Division es: " + unCalculadora.ResolverDivision());

	
	}

	private static String darNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
