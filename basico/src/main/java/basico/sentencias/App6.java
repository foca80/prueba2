package basico.sentencias;

import java.util.ArrayList;
import java.util.List;

import basico.entidades.Auto;

public class App6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Auto auto1 = new Auto();
        auto1.setId(1);
        auto1.setMarca("TOYOTA");
        auto1.setModelo("YARIS");
        auto1.setPrecio(19000);
        Auto auto2 = new Auto();
        auto2.setId(2);
        auto2.setMarca("BMW");
        auto2.setModelo("A3");
        auto2.setPrecio(40000);
        
        List<Auto> autos = new ArrayList<>();
        
        autos.add(auto1);
        autos.add(auto2);
        
        for(Auto a:autos) {
        	System.out.println(a.getId() + "  " + a.getMarca() +"  " + a.getModelo() + "  " + a.getPrecio());
        }
        
	}

}
