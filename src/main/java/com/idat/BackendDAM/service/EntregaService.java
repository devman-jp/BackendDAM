package com.idat.BackendDAM.service;

import java.util.List;
import com.idat.BackendDAM.model.Entrega;

public interface EntregaService {
	
	List<Entrega> listar();
	Entrega obtener(Integer id);
	void confirmarEntrega(Integer id);

}
