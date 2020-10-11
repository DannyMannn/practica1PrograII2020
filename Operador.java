import java.util.Calendar;

public class Operador extends Empleado {
	public static int numEmpleados;

	public Operador(String nombre,
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
		return "Operaciones Disponibles: \n1.Ver datos del empleado \n2.Ver informe del trabajador \n3.Solicitar cambio de tienda \n4.Asignar vacaciones \n5.Dar alta";
	}

	@Override
	public String realizarOperacion(int op) {
		switch (op) {
			case 1:
				return this.verDatosEmpleado();
			case 2:
				return this.verInformeEmpleado();
			case 3:
				return this.solicitarCambioTienda();
			case 4:
				return this.asignarVacaciones();
			case 5:
				return this.darAlta();
			default:
				return "Operación Inválida";
		}
	}

	public String verDatosEmpleado() {
		return "Viendo datos del empleado...";
	}

	public String verInformeEmpleado() {
		return "Viendo informe del empleado....";
	}

	public String solicitarCambioTienda() {
		return "Solicitando cambio de tienda...";
	}

	public String asignarVacaciones() {
		return "Asignando vacaciones....";
	}

	public String darAlta() {
		return "Dando de alta...";
	}
}

