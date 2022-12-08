package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Remitente;


public interface RemitenteService {
	
	List<Remitente> lista();
	Remitente obtener(Integer idRemitente);

}
