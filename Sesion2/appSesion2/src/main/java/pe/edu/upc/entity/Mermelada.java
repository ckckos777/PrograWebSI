package pe.edu.upc.entity;

public class Mermelada extends Fruta{
	
	protected int TiempoPreparacion;
	protected String TipoEnvase;
	//nivel intermedio entre public y privado  ->recomendado para la herencia hijas
	public Mermelada(String color, String sabor, int tiempopreparacion, String tipoenvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.TiempoPreparacion=TiempoPreparacion;
		this.TipoEnvase=TipoEnvase;
	}
	
	//get & set
	public int getTiempoPreparacion() {
		return TiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		TiempoPreparacion = tiempoPreparacion;
	}
	public String getTipoEnvase() {
		return TipoEnvase;
	}
	public void setTipoEnvase(String tipoEnvase) {
		TipoEnvase = tipoEnvase;
	}
	
	
}
