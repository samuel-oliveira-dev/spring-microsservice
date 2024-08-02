package br.com.alura.trilha.microsservisos.pagamentos.respository;

import br.com.alura.trilha.microsservisos.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
