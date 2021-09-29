package com.t2s.processo_seletivo.repository;

import com.t2s.processo_seletivo.models.Container;
import com.t2s.processo_seletivo.models.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>
{
    List<Movimentacao> findByContainer(Container container);
}
