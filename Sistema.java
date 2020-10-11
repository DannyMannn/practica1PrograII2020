import java.util.Calendar;

public class Sistema {
	public static void main(String[] args) {
		Usuario[] usuarios = new Usuario[10];
		usuarios[0] = new Usuario(
				"admin",
				"admin",
				new Identificador(
					EnumTipoEmpleado.ADMIN_PRINCIPAL,
					true,
					17,
					EnumTipoSucursal.MATRIZ_PRINCIPAL,
					EnumEstado.PUEBLA,
					true));
		usuarios[1] = new Empleado(
				"Empleado",
				"Uno",
				Calendar.getInstance(),
				"Hombre",
				"Licenciatura",
				"Fake Street #123",
				150000f,
				"Gerente",
				"1234567890",
				"empGen",
				"UnoEmp",
				new Identificador(
					EnumTipoEmpleado.ADMIN_ESTATAL,
					true,
					87,
					EnumTipoSucursal.MATRIZ_ESTATAL,
					EnumEstado.JALISCO,
					true));

		System.out.println(usuarios[0].getId().obtenerTipoEmpleado());
		System.out.println(usuarios[0].getId().esEmpleadoActivo());
		System.out.println(usuarios[0].getId().obtenerNumeroSucursal());
		System.out.println(usuarios[0].getId().obtenerTipoSucursal());
		System.out.println(usuarios[0].getId().obtenerEstado());
		System.out.println(usuarios[0].getId().esTiendaActiva());

		System.out.println(usuarios[1].getId().obtenerTipoEmpleado());
		System.out.println(usuarios[1].getId().esEmpleadoActivo());
		System.out.println(usuarios[1].getId().obtenerNumeroSucursal());
		System.out.println(usuarios[1].getId().obtenerTipoSucursal());
		System.out.println(usuarios[1].getId().obtenerEstado());
		System.out.println(usuarios[1].getId().esTiendaActiva());
	}
}
