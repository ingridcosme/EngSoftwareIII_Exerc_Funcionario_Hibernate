package model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendimento")
public class Atendimento {

	@Id
	@Column(name = "data_atendimento")
	@NotNull
	private LocalDate data;
	
	@Id
	@Column(name = "hora_atendimento")
	@NotNull
	private LocalTime hora;
	
	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name = "cliente_atendimento")
	@NotNull
	private Cliente cliente;
	
	@ManyToOne(targetEntity = Atendente.class)
	@JoinColumn(name = "atendente_atendimento")
	@NotNull
	private Atendente atendente;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	@Override
	public String toString() {
		return "Atendimento [data=" + data + ", hora=" + hora + ", cliente=" + cliente + ", atendente=" + atendente
				+ "]";
	}

}
