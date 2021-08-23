package figuras;

public abstract class FiguraGeometrica {
	protected String tipoFigura; // para que clases hijas puedan acceder directamente a esta propiedad
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	public abstract void dibujar();

}
