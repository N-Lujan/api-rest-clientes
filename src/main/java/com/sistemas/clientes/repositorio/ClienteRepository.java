package com.sistemas.clientes.repositorio;

import com.sistemas.clientes.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
