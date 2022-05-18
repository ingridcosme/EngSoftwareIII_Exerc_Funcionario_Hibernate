package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_cliente")
	@NotNull
	private long idCliente;
	
	@Column(name = "cpf_cliente")
	@NotNull
	private String cpf;
	
	@Column(name = "nome_cliente")
	@NotNull
	private String nome;
	
	@Column(name = "telefone_cliente")
	@NotNull
	private String telefone;
	
	@Column(name = "email_cliente")
	@NotNull
	private String email;
	
	@Column(name = "pronome_cliente")
	@NotNull
	private String pronome;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPronome() {
		return pronome;
	}

	public void setPronome(String pronome) {
		this.pronome = pronome;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone
				+ ", email=" + email + ", pronome=" + pronome + "]";
	}
	
}
