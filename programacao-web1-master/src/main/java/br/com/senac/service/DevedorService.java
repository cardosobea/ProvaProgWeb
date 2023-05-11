package br.com.senac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.repository.DevedorRepository;
import br.com.senac.entity.Devedor;

@Service
public class DevedorService {
    private final DevedorRepository devedorRepository;

    public DevedorService(DevedorRepository devedorRepository) {
        this.devedorRepository = devedorRepository;
    }

    public Devedor salvarDevedor(Devedor devedor) {
        return devedorRepository.save(devedor);
    }
}

