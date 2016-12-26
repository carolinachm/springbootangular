package br.com.springbootangular.ws.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;

}
