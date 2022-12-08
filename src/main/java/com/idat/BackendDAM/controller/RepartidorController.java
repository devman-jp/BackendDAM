package com.idat.BackendDAM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.BackendDAM.model.Consignado;
import com.idat.BackendDAM.model.Repartidor;
import com.idat.BackendDAM.service.ConsignadoService;
import com.idat.BackendDAM.service.RepartidorService;

@Controller
@RequestMapping("/v1/reparditor")
public class RepartidorController {
	

	@Autowired
	private RepartidorService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Repartidor>> listar(){
		return new ResponseEntity<List<Repartidor>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Repartidor> obtenerPorId(@PathVariable Integer id){
		
		Repartidor repartidor = service.obtener(id);
		
		if( repartidor != null) {
			return new ResponseEntity<Repartidor>(repartidor, HttpStatus.OK);
		}else {
			return new ResponseEntity<Repartidor>(HttpStatus.NOT_FOUND);
		}
		
	}

}
