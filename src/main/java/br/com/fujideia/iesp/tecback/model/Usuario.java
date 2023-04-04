package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String cpf;

    private String nomeCompleto;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    private String email;
    @Column(length = 20)
    private String senha;

    @Column(length = 20)
    private String confirmSenha;
}
