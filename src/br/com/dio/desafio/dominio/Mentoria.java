package br.com.dio.desafio.dominio;

import java.time.Instant;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private final Instant data;

    public Mentoria(String titulo, String descricao) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = Instant.now();
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public Instant getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
