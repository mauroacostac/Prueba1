package DatosAbstractos;

public class Transporte {
	private String nombrechofer;
	private String codigochofer;
	private String horario;
	private String ruta;
	private int capacidad;
	private int kilometraje;
	private String matricula;
	public Transporte(String nombrechofer, String codigochofer, String horario, String ruta, int capacidad, int kilometraje, String matricula){
		this.nombrechofer = nombrechofer;
		this.codigochofer = codigochofer;
		this.horario = horario;
		this.ruta = ruta;
		this.capacidad = capacidad;
		this.kilometraje = kilometraje;
		this.matricula = matricula;
	}
	public String getNombrechofer(){
		return nombrechofer;
	}
	public void setNombrechofer(String nombrechofer){
		this.nombrechofer = nombrechofer;
	}
	
	public String getCodigochofer(){
		return codigochofer;
	}
	public void setCodigochofer(String codigochofer){
		this.codigochofer = codigochofer;
	}
	
	public String getHorario(){
		return horario;
	}
	public void setHorario(String horario){
		this.horario = horario;
	}
	
	public String getRuta(){
		return ruta;
	}
	public void setRuta(String ruta){
		this.ruta = ruta;
	}
	
	public int getCapacidad(){
		return capacidad;
	}
	public void setCapacidad(int capacidad){
		this.capacidad = capacidad;
	}
	
	public int getKilometraje(){
		return kilometraje;
	}
	public void setKilometraje(int kilometraje){
		this.kilometraje = kilometraje;
	}
	
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void ManejaBus(){
		System.out.println("El chofer de la ruta: "+ this.ruta +" es: "+ this.codigochofer +"  "+ this.nombrechofer);
	}
	public void PrecioTotal(){
		int preciototal;
		preciototal = this.kilometraje * this.capacidad;
		System.out.println("El precio total ganado es:"+ preciototal);
	}
	public void HoraLlegada(){
		System.out.println("La hora de llegada del primer turno es:"+ this.horario);
	}
	public void VerificarCapacidad(){
		if (this.capacidad > 40){
			System.out.println("El autobus esta lleno");
		}
		else {
			System.out.println("Aun queda espacio");
		}
	}
}
