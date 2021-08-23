package figuras;

public class EjecutarFigura {
	
	public static void main(String[] args) {
		// clase Abstracta no puede ser instanciada
		// FiguraGeometrica figura = new FiguraGeometrica();
		
		// Creamos objeto de las clases hija
		
		/** CONCEPTO DE UPCASTING **/
		// podemos asignar un tipo hijo a un tipo padre, no es necesario
		// una conversion
		FiguraGeometrica figura = new Rectangulo("Rectangulo");
		// se va ejecutar el metodo que tenemos en comun
		// toma prioridad la clase de menor Jerarquia.
		// por lo tanto se va ejecutar el metodo de la clase Rectangulo
		// y de hecho si te lo preguntas el metodo de la clase padre dibujar
		// no se podria implementar por que es un metodo abstracto. que no tiene
		// implementación
		
		/*CONCEPTO DE POLIMORFISMO*/
		figura.dibujar();
		
	}

}
