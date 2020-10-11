public enum EnumTipoEmpleado {
	EMPLEADO_ORDINARIO(0, "Empleado ordinario"),
	OPERADOR(1, "Operador"),
	ADMIN_ESTATAL(2, "Administrador del sistema por estado"),
	ADMIN_PRINCIPAL(3, "Administrador principal");

	private final int id;
	private final String nombre;

	private EnumTipoEmpleado(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public static EnumTipoEmpleado getTipoEmpleadoPorId(int id) {
		for (EnumTipoEmpleado e: EnumTipoEmpleado.values()) {
			if (e.getId() == id) return e;
		}
		return null;
	}

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}
}
