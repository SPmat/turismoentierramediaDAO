package proyecto_tierra_media;

public class Atraccion {

	private String nombre;
	private int valor;
	private double tiempoDeUso;
	private int usosDisponibles;
	private TipoDeAtraccion tipo;
	
	public Atraccion(String nombre, int valor, double tiempoDeUso, int usosMaximos, TipoDeAtraccion tipo) {

		this.nombre=Validacion.validar(nombre);
		this.valor=Validacion.validar(valor);
		this.tiempoDeUso=Validacion.validar(tiempoDeUso);
		this.usosDisponibles=Validacion.validar(usosMaximos);
		this.tipo=tipo;
	}

	//constructor por defecto
	public Atraccion() {
		this(" ", 0, 0,0, TipoDeAtraccion.DEFAULT);
	}

//--------------------------GETTERS----------------------------------
	public int getValor() {
		return this.valor;
	}

	public double getTiempoDeUso() {
		return this.tiempoDeUso;
	}

	public int getUsosDisponibles() {
		return this.usosDisponibles;

	}
	public TipoDeAtraccion getTipo() {
		return tipo;
	}
	
	public String getNombreTipo() {
		return this.tipo.getNombreDeTipo();
	}


	public String getNombre() {
		return this.nombre;
	}

	
	//--------------------SETTERS----------------

	protected void setTipo(TipoDeAtraccion tipo) {
		this.tipo = tipo;
	}
	
	//-----------------METODOS---------------------
	//Reescribe el toString de la superclase para poder usarlo en println
    @Override
    public String toString() {
        return nombre;
    }

	public void reservarLugar(Usuario unUsuario) {
		this.usosDisponibles-=1;
	}
	
	/////////////////////
    
}
