package br.com.alura.trilha.microsservisos.pagamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
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
    @ManyToOne
    private Status status;
    @NotNull
    private Long pedidoId;
    @NotNull
    private Long formaPagamentoId;
    public Pagamento(){

    }
}
