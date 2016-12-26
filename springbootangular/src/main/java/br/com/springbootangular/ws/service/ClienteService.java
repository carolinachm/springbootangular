package br.com.springbootangular.ws.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootangular.ws.modal.Cliente;
import br.com.springbootangular.ws.repository.ClienteRespository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRespository clienteRepository;
	

	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.save(cliente);

	}

	public Collection <Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente buscarPorId(Integer id) {
		return clienteRepository.findOne(id);
	}

	public Cliente alterar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
