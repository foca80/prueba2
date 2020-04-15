package basico.sentencias;

import basico.entidades.Auto;
import basico.negocio.Negocio;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		auto.setId(1);
		auto.setMarca("Volvo");
		auto.setModelo("Jetta");
		auto.setPrecio(50000);
		Negocio negocio = new Negocio();
		
		System.out.println(auto.getId() + "  " + auto.getModelo() + "  " + auto.getPrecio());
		System.out.println("Descuento: " + negocio.calcularDescuento(auto));

	}

}
