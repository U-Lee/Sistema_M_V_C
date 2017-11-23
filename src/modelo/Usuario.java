package modelo;

public class Usuario {
	
	private String cuenta;
	private String contraseña;

	public Usuario(){
		setCuenta("");
		setContraseña("");
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
