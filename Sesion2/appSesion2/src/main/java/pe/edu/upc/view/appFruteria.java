package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;
import pe.edu.upc.entity.Mermelada;

public class appFruteria {
	
	public static void main(String[] args){
		Fruta f =new Fruta("Amarillo","Dulce");
		Mermelada mer=new Mermelada("Rojo","Acido",1,"vidrio");
		
		System.out.println(f.toString());
		f.SoyUnMetodoDeObjeto();
		System.out.println(mer.toString());
		mer.SoyUnMetodoDeObjeto();
		Fruta.LugarOrigen="tierra";
		Fruta.SoyUnMetodoGlobal();
	}
}
