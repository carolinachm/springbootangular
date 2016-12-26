package br.com.springbootangular.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springbootangular.ws.modal.Cliente;
@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Integer>{

}
