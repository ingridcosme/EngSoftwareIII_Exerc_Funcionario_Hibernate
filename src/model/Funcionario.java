package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_funcionario")
	@NotNull
	private long idFuncionario;
	
	@Column(name = "nome_funcionario")
	@NotNull
	private String nome;
	
	@Column(name = "nascimento_funcionario")
	@NotNull
	private LocalDate nascimento;
	
	@Column(name = "salario_funcionario")
	@NotNull
	private double salario;
	
	@Column(name = "telefone_funcionario")
	@NotNull
	private String telefone;

	public long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", nascimento=" + nascimento
				+ ", salario=" + salario + ", telefone=" + telefone + "]";
	}

}
