package pe.edu.upc.entity;

public class Fruta {
	
	//atributos de instancia -> objeto
	private String color;
	private String sabor;
	
	//atributos de clase -> pertenece a la clase ->(static)
	public static String LugarOrigen="UPC";

	//constructores
	public Fruta(String color, String sabor) {
		super();// acceder de la clase hija a la clase padre principal
		this.color = color;
		this.sabor = sabor;
	}
	
	public static void SoyUnMetodoGlobal(){
		
	}
	
	public void SoyUnMetodoDeObjeto(){
		
	}

	//get & set
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override //heredados del padre principal
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+this.getColor();
	}
	
	
}
