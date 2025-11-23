package br.com.dio.desafio.dominio;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final Instant dataInicial = Instant.now();
    private final Instant dataFinal = dataInicial.plus(45,ChronoUnit.DAYS);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Instant getDataInicial() {
        return dataInicial;
    }

    public Instant getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }
}
