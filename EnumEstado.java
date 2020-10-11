public enum EnumEstado {
	AGUASCALIENTES(0, "Aguascalientes"),
	BAJA_CALIFORNIA(1, "Baja California"),
	BAJA_CALIFORNIA_SUR(2, "Baja California Sur"),
	CAMPECHE(3, "Campeche"),
	CHIAPAS(4, "Chiapas"),
	CHIHUAHUA(5, "Chihuahua"),
	CIUDAD_DE_MEXICO(6, "Ciudad de México"),
	COAHUILA(7, "Coahuila de Zaragoza"),
	COLIMA(8, "Colima"),
	DURANGO(9, "Durango"),
	GUANAJUATO(10, "Guanajuato"),
	GUERRERO(11, "Guerrero"),
	HIDALGO(12, "Hidalgo"),
	JALISCO(13, "Jalisco"),
	MEXICO(14, "México"),
	MICHOACAN(15, "Michoacán de Ocampo"),
	MORELOS(16, "Morelos"),
	NAYARIT(17, "Nayarit"),
	NUEVO_LEON(18, "Nuevo León"),
	OAXACA(19, "Oaxaca"),
	PUEBLA(20, "Puebla"),
	QUERETARO(21, "Queretaro"),
	QUINTANA_ROO(22, "Quintana Roo"),
	SAN_LUIS_POTOSI(23, "San Luis Potosí"),
	SINALOA(24, "Sinaloa"),
	SONORA(25, "Sonora"),
	TABASCO(26, "Tabasco"),
	TAMAULIPAS(27, "Tamaulipas"),
	TLAXCALA(28, "Tlaxcala"),
	VERACTRUZ(29, "Veracruz"),
	YUCATAN(30, "Yucatán"),
	ZACATECAS(31, "Zacatecas");

	private final int id;
	private final String nombre;

	private EnumEstado(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public static EnumEstado getEstadoPorId(int id) {
		for (EnumEstado e: EnumEstado.values()) {
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
