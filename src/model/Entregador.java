package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario {

	@Column(name = "cnh_entregador")
	@NotNull
	private long numeroCNH;
	
	@Column(name = "categoriaCnh_entregador")
	@NotNull
	private String categoriaCNH;

	public long getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(long numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	@Override
	public String toString() {
		return "Entregador [numeroCNH=" + numeroCNH + ", categoriaCNH=" + categoriaCNH + ", getIdFuncionario()="
				+ getIdFuncionario() + ", getNome()=" + getNome() + ", getNascimento()=" + getNascimento()
				+ ", getSalario()=" + getSalario() + ", getTelefone()=" + getTelefone() + "]";
	}
	
}
