package br.com.alura.trilha.microsservisos.pagamentos.services;

import br.com.alura.trilha.microsservisos.pagamentos.model.Pagamento;
import br.com.alura.trilha.microsservisos.pagamentos.respository.PagamentoRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alura.trilha.microsservisos.pagamentos.dto.PagamentoDTO;

@Service
public class PagamentoService {


    final PagamentoRepository pagamentoRepository;
    private ModelMapper modelMapper;


    @Autowired
    public PagamentoService(PagamentoRepository pagamentoRepository,
                            ModelMapper modelMapper
    ) {
        this.pagamentoRepository = pagamentoRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void salvarAlgo(PagamentoDTO pagamentoDTO){

        var pagamentoEntity = new Pagamento();
        BeanUtils.copyProperties(pagamentoDTO, pagamentoEntity);
        pagamentoRepository.save(pagamentoEntity);

    }


}
