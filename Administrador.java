import java.util.Calendar;

public abstract class Administrador extends Empleado {
	public Administrador(String nombre,
			String apellidos,
			Calendar fechaNacimiento,
			String genero,
			String escolaridad,
			String direccion,
			float salario,
			String puesto,
			String telefono,
			String nombreUsuario,
			String contraseña,
			Identificador id) {
		super(nombre,
				apellidos,
				fechaNacimiento,
				genero,
				escolaridad,
				direccion,
				salario,
				puesto,
				telefono,
				nombreUsuario,
				contraseña,
				id);
	}

	public abstract String obtenerMenu();

	public abstract String realizarOperacion(int op);

	public String modificarInformacionPersonal() {
		return "Modificando información personal...";
	}
}
