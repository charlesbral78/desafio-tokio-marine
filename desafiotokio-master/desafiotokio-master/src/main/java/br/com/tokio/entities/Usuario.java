package br.com.tokio.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="USUARIO")
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private Long cpf;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuario usuario = (Usuario) o;
		return cpf.equals(usuario.cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
}
