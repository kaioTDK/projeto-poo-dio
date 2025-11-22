package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private short cargaHoraria;

    public Curso(){};

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public short getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(short cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                "} " + super.toString();
    }
}
