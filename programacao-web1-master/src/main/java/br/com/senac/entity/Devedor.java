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
public class Devedor {
    public Devedor(String string, String string2) {
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDevedor;
    private String nome;

    @OneToMany(mappedBy = "devedor", cascade = CascadeType.ALL)
    private List<Divida> dividas = new ArrayList<>();

    // getters e setters
}