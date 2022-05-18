package model;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario {

	@Column(name = "entrada_atendente")
	@NotNull
	private LocalTime entrada;
	
	@Column(name = "saida_atendente")
	@NotNull
	private LocalTime saida;
	
	@Column(name = "email_atendente")
	@NotNull
	private String email;

	public LocalTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}

	public LocalTime getSaida() {
		return saida;
	}

	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Atendente [entrada=" + entrada + ", saida=" + saida + ", email=" + email + ", getIdFuncionario()="
				+ getIdFuncionario() + ", getNome()=" + getNome() + ", getNascimento()=" + getNascimento()
				+ ", getSalario()=" + getSalario() + ", getTelefone()=" + getTelefone() + "]";
	}
	
}
