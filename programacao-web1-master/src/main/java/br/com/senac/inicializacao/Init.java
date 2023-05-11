package br.com.senac.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.senac.entity.Devedor;
import br.com.senac.entity.Divida;
import br.com.senac.entity.Empresa;
import br.com.senac.repository.DevedorRepository;
import br.com.senac.repository.DividaRepository;
import br.com.senac.repository.EmpresaRepository;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Init {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private DevedorRepository devedorRepository;

    @Autowired
    private DividaRepository dividaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Init.class, args);
    }

    @PostConstruct
    public void init() {
        // Criação das empresas
        Empresa empresa1 = new Empresa("1", "Empresa 1");
        Empresa empresa2 = new Empresa("2", "Empresa 2");

        // Criação dos devedores
        Devedor devedor1 = new Devedor("1", "Devedor 1");
        Devedor devedor2 = new Devedor("2", "Devedor 2");

        // Persistindo as empresas e devedores
        empresaRepository.save(empresa1);
        empresaRepository.save(empresa2);
        devedorRepository.save(devedor1);
        devedorRepository.save(devedor2);

        // Criação das dívidas
        Divida divida1 = new Divida("100", empresa1, devedor1);
        Divida divida2 = new Divida("200", empresa1, devedor2);
        Divida divida3 = new Divida("300", empresa2, devedor1);

        // Persistindo as dívidas
        dividaRepository.save(divida1);
        dividaRepository.save(divida2);
        dividaRepository.save(divida3);
    }
}
