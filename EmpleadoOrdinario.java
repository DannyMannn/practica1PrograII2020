import java.util.Calendar;

public class EmpleadoOrdinario extends Empleado {
	public static int numEmpleados;

	public EmpleadoOrdinario(String nombre,
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
		numEmpleados++;
	}

	@Override
	public String obtenerMenu() {
		return "Operaciones Disponibles: \n1.Solicitar Vacaciones \n2.Solicitar cambio de datos personales";
	}

	@Override
	public String realizarOperacion(int op) {
		switch (op) {
			case 1:
				return this.solicitarVacaciones();
			case 2:
				return this.solicitarCambioDeDatosPersonales();
			default:
				return "Opción inválida";
		}
	}

	public String solicitarVacaciones() {
		return "Solicitando vacaciones...";
	}

	public String solicitarCambioDeDatosPersonales() {
		return "Solicitando cambio de datos personales";
	}
}
