package br.gov.ce.fortaleza.amc.aet.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.gov.ce.fortaleza.amc.aet.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {
    
}
