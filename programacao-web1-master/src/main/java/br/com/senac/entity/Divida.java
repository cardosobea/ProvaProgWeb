package br.com.senac.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Divida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDivida;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "idDevedor")
    private Devedor devedor;

	public Divida(String string, Empresa empresa1, Devedor devedor1) {
	}
	public void setValor(double d) {
		
	}
	public void setEmpresa(Empresa empresa2) {
	
	}
}
