package com.wordpress.wandersonalvesdev.cadastroalunos;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author https://wandersonalvesdev.wordpress.com/
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@EqualsAndHashCode
public class Aluno {

    @Getter
    private Long id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String SobreNome;
    @Getter
    @Setter
    private String numeroMatricula;
    @Getter
    @Setter
    private char sexo;
}
