public enum EnumTipoSucursal {
	SUCURSAL(1, "Sucursal"),
	MATRIZ_ESTATAL(2, "Matriz estatal"),
	MATRIZ_PRINCIPAL(3, "Matriz principal");

	private final int id;
	private final String nombre;

	private EnumTipoSucursal(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public static EnumTipoSucursal getEnumTipoSucursalPorId(int id) {
		for (EnumTipoSucursal e: EnumTipoSucursal.values()) {
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
