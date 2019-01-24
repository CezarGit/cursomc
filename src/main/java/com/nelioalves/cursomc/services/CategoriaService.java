package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired //Com @Autowired essa dependencia vai ser automaticamente instanciada pelo Spring
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
	}

}
