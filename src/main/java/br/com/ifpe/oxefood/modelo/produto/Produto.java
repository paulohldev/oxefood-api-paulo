package br.com.ifpe.oxefood.modelo.produto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto extends EntidadeAuditavel{
    private String codigo;
    private String titulo;
    private String descricao;
    private Double valorUnitario;
    private Integer tempoEntregaMinimo;
    private Integer tempoEntregaMaximo;

    
}
