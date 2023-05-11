package br.com.senac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senac.repository.DividaRepository;
import br.com.senac.entity.Divida;

@Service
public class DividaService {
    private final DividaRepository dividaRepository;

    public DividaService(DividaRepository dividaRepository) {
        this.dividaRepository = dividaRepository;
    }

    public Divida salvarDivida(Divida divida) {
        return dividaRepository.save(divida);
    }
}
