import java.util.Calendar;

public class AdministradorPrincipal extends Administrador {
	public static int numAdministradoresPrincipales;

	public AdministradorPrincipal(String nombre,
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
		numAdministradoresPrincipales++;
	}

    public String obtenerMenu() {
		return "Operaciones Disponibles: \n1.Dar alta \n2.Eliminar Empleado \n3.Modificar Empleado \n4.Ver datos empleado \n5.Ver informe Empleado \n6.Cambiar Tienda Empleado \n7.Asignar Vacaiones Empleado";
	}

	public String realizarOperacion(int op) {
		switch (op) {
			case 1:
                return this.darAltaEmpleado();
            case 2:
                return this.eliminarEmpleado();
            case 3:
                return this.modificarEmpleado();
            case 4:
                return this.verDatosEmpleado();
            case 5:
                return this.verInformeEmpleado();
            case 6:
                return this.cambiarTiendaEmpleado();
            case 7:
                return this.asignarVacacionesEmpleado();
            default:
                return "Operacion Invalida";
        }
	}

	public String darAltaEmpleado() {
		return "Dando de alta...";
	}

	public String eliminarEmpleado() {
		return "Eliminando empleado...";
	}

	public String modificarEmpleado() {
		return "Modificando empleado...";
	}

	public String verDatosEmpleado() {
		return "Viendo datos...";
	}

	public String verInformeEmpleado() {
		return "viendo informe...";
	}

	public String cambiarTiendaEmpleado() {
		return "Cambiando tienda...";
	}

	public String asignarVacacionesEmpleado() {
		return "Asignando vacaciones...";
	}	
}

