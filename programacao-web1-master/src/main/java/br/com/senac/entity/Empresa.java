package br.com.senac.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Empresa {
    public Empresa(String string, String string2) {
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;
    private String nome;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Divida> dividas = new ArrayList<>();
}