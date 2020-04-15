package basico.negocio;
import basico.entidades.Auto;

public class Negocio {

	public double calcularDescuento(Auto auto) {
		return 0.10*auto.getPrecio();
	}
	
}
