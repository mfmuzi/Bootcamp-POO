package com.dio.bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;

    DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final LocalDate dataInicial = LocalDate.now();
    private final String dataInicialFormatada = dataInicial.format(formatado);
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final String dataFinalFormatada = dataFinal.format(formatado);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public DateTimeFormatter getFormatado() {
        return formatado;
    }

    public void setFormatado(DateTimeFormatter formatado) {
        this.formatado = formatado;
    }

    public String getDataInicialFormatada() {
        return dataInicialFormatada;
    }

    public String getDataFinalFormatada() {
        return dataFinalFormatada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(formatado, bootcamp.formatado) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataInicialFormatada, bootcamp.dataInicialFormatada) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(dataFinalFormatada, bootcamp.dataFinalFormatada) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, formatado, dataInicial, dataInicialFormatada, dataFinal, dataFinalFormatada, devsInscritos, conteudos);
    }
}