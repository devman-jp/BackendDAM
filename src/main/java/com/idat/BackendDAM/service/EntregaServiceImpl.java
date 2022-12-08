package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Entrega;
import com.idat.BackendDAM.repository.EntregaRepository;

@Service
public class EntregaServiceImpl implements EntregaService {

	@Autowired
	private EntregaRepository repository;
	
	@Override
	public List<Entrega> listar() {
		return repository.findAll();
	}

	@Override
	public Entrega obtener(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void confirmarEntrega(Integer id) {
		Entrega foundEntrega = obtener(id);
		if(foundEntrega != null) {
			foundEntrega.setEstado("ENTREGADO");
			repository.saveAndFlush(foundEntrega);
		}
	}

}
