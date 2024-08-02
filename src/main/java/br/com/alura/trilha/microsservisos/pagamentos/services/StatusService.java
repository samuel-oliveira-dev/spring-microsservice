package br.com.alura.trilha.microsservisos.pagamentos.services;
import br.com.alura.trilha.microsservisos.pagamentos.model.Status;
import br.com.alura.trilha.microsservisos.pagamentos.respository.StatusRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StatusService {
    private final StatusRepository statusRepository;
    private StatusRepository repository;
    @Autowired
    public StatusService(StatusRepository repository, StatusRepository statusRepository) {
        this.repository = repository;
        this.statusRepository = statusRepository;
    }

    @Transactional
    public void criarStatus(String nome){
        Status status = new Status(nome);
        status.setId(Long.getLong("1"));
        statusRepository.save(status);
    }

}
