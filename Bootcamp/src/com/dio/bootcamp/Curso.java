package com.dio.bootcamp;


public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override

    public String toString() {

        return String.format("Curso: %s \nDescrição: %s \nDuração: %d horas\n", getTitulo(), getDescricao(), getCargaHoraria());

    }
}
