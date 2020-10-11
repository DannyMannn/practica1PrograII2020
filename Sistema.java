import java.util.Calendar;
import java.util.Scanner;

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
		usuarios[1] = new AdministradorEstatal(
				"Empleado",
				"Uno",
				Calendar.getInstance(),
				"Hombre",
				"Licenciatura",
				"Fake Street #123",
				150000f,
				"Gerente",
				"1234567890",
				"test",
				"test",
				new Identificador(
					EnumTipoEmpleado.ADMIN_ESTATAL,
					true,
					87,
					EnumTipoSucursal.MATRIZ_ESTATAL,
					EnumEstado.JALISCO,
					true));
		Scanner sc = new Scanner(System.in);
		String usuario, constraseña;
		Usuario usuarioActual;
		Empleado empleadoActual;
		int op;

		System.out.println("¡Bienvenido! Por favor ingrese sus credenciales para continuar");
		System.out.print("Usuario: ");
		usuario = sc.nextLine();
		System.out.print("Contraseña: ");
		constraseña = sc.nextLine();

		usuarioActual = getUsuarioConCredenciales(
				usuario,
				constraseña,
				usuarios);

		if (usuarioActual != null) {
			System.out.println("Credenciales válidas.");
			empleadoActual = obtenerEmpleado(usuarioActual);
			System.out.println(empleadoActual.obtenerMenu());
			System.out.print("¿Qué desea realizar? ");
			op = sc.nextInt();
			System.out.println(empleadoActual.realizarOperacion(op));
		} else {
			System.out.println("No se encontro a ningún usuario con las credenciales ingresadas");
		}
	}

	private static Usuario getUsuarioConCredenciales(String usuario,
			String constraseña,
			Usuario usuarios[]) {
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i].validarCredenciales(usuario, constraseña))
				return usuarios[i];
		}
		return null;
	}

	private static Empleado obtenerEmpleado(Usuario u) {
		switch (u.getId().obtenerTipoEmpleado()) {
			case ADMIN_ESTATAL:
				return (AdministradorEstatal) u;
			case ADMIN_PRINCIPAL: 
				return (AdministradorPrincipal) u;
			case EMPLEADO_ORDINARIO:
				return (EmpleadoOrdinario) u;
			case OPERADOR:
				return (Operador) u;
			default:
				return (Empleado) u;
		}
	}
}
