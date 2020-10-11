public class Identificador {
	private int id;

	public Identificador(EnumTipoEmpleado tipoEmpleado,
		boolean esEmpleadoActivo,
		int numSucursal,
		EnumTipoSucursal tipoSucursal,
		EnumEstado estado,
		boolean esTiendaActiva) {
		this.id = 0;

		this.id |= tipoEmpleado.getId();
		this.id |= (((esEmpleadoActivo)? 1: 0) << 2);
		this.id |= (numSucursal << 3);
		this.id |= (tipoSucursal.getId() << 10);
		this.id |= (estado.getId() << 12);
		this.id |= (((esTiendaActiva)? 1: 0) << 17);
	}

	public boolean esEmpleadoActivo() {
		int desplazamiento = 2, mascara = Integer.MAX_VALUE;
		if (((this.id >> desplazamiento) & mascara) == 0) return false;
		return true;
	}

	public boolean esTiendaActiva() {
		int desplazamiento = 17, mascara = Integer.MAX_VALUE;
		if (((this.id >> desplazamiento) & mascara) == 0) return false;
		return true;
	}

	public EnumEstado obtenerEstado() {
		int desplazamiento = 12, mascara = 31;
		int idEstado = ((this.id >> desplazamiento) & mascara);
		return EnumEstado.getEstadoPorId(idEstado);
	}

	public int obtenerNumeroSucursal() {
		int desplazamiento = 3, mascara = 127;
		return ((this.id >> desplazamiento) & mascara);
	}

	public EnumTipoEmpleado obtenerTipoEmpleado() {
		int mascara = 3;
		int idTipoEmpleado = (this.id & mascara);
		return EnumTipoEmpleado.getTipoEmpleadoPorId(idTipoEmpleado);
	}

	public EnumTipoSucursal obtenerTipoSucursal() {
		int desplazamiento = 10, mascara = 3;
		int idTipoSucursal = ((this.id >> desplazamiento) & mascara);
		return EnumTipoSucursal.getEnumTipoSucursalPorId(idTipoSucursal);
	}
}
