package br.com.alura.trilha.microsservisos.pagamentos.respository;
import br.com.alura.trilha.microsservisos.pagamentos.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
