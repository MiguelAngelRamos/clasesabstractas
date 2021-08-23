package figuras;

public class Rectangulo extends FiguraGeometrica{

	protected Rectangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}
	
	// en las clases abastractas mas que sobreescribir un método lo estamos implementando
	// debido a que el método dibujar no tiene ningun tipo de comportamiento en la clase abstracta.
	// es aqui donde se implementa ese es el termino que se usa "Implementa"
	@Override
	public void dibujar() {
		// tipo de clase y nombre de la clase
		System.out.println("Se imprime un tipo un:  " + this.getClass().getSimpleName());
	}

	
}
