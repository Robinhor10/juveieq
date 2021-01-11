package com.github.Robinhor10.juveieq.model;

import java.time.LocalDate;


@Entity
public class Cadastro {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String userId;

    private LocalDate dataCadastro;






}
