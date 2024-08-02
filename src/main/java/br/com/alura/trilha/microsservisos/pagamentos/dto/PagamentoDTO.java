package br.com.alura.trilha.microsservisos.pagamentos.dto;

import br.com.alura.trilha.microsservisos.pagamentos.model.Status;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class PagamentoDTO {
    @NotNull
    private Long id;
    @Positive
    private BigDecimal valor;
    @NotBlank
    @Size(max=100)
    private String nome;
    @NotBlank
    @Size(max=19)
    private String numero;
    @NotBlank
    @Size(max=7)
    private String expiracao;
    private String codigo;
    @NotNull
    private Long pedidoId;
    @NotNull
    private Long formaPagamentoId;

    private Long statusId;
}
