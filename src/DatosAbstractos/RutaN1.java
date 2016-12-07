package DatosAbstractos;

public class RutaN1 {
public static void main(String[] args) {
		
		Transporte Bus = new Transporte("Mauro Acosta","0917839136","6:00AM - 8:00AM","SUR",40,134500, "GOP-123");
		Bus.ManejaBus();
		Bus.PrecioTotal();
		Bus.HoraLlegada();
		Bus.VerificarCapacidad();
	}
}
