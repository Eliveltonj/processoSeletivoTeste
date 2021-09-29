package com.t2s.processo_seletivo.repository;

import com.t2s.processo_seletivo.models.Container;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContainerRepository extends JpaRepository<Container, Integer>
{
 List<Container> findByClienteAndNumeroDoContainerAndTipoAndStatusAndCategoria(
         String cliente, String numeroDoContainer, int tipo,
         String status, String categoria);
}
