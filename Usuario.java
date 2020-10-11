public class Usuario {
	protected String nombreUsuario;
	protected String contraseña;
	protected Identificador id;

	public Usuario(String usuario, String contraseña, Identificador id) {
		this.nombreUsuario = usuario;
		this.contraseña = contraseña;
		this.id = id;
	}

	public Identificador getId() {
		return this.id;
	}

	public boolean validarCredenciales(String usuario, String constraseña) {
		if (this.nombreUsuario.equals(usuario) 
				&& this.contraseña.equals(constraseña)) return true;
		return false;
	}
}
