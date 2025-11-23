package br.com.dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev{

    private String nome;
    private Set<Conteudo> conteudsIncscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome){
        this.nome = nome;
    }
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudsIncscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudsIncscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudsIncscritos.remove(conteudo.get());
        }
        else {
            System.out.println("Você nãos está matriculado em um curso!");
        }
    }

    public double calcularTotalXp(){
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0d;

        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudsIncscritos() {
        return conteudsIncscritos;
    }

    public void setConteudsIncscritos(Set<Conteudo> conteudsIncscritos) {
        this.conteudsIncscritos = conteudsIncscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}