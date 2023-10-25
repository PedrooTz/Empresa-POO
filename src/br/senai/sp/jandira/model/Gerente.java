package br.senai.sp.jandira.model;

public class Gerente extends Funcionarios{
    private double bonus;



    public Gerente(String nome, int id, double baseSalario) {

        super(nome, id, baseSalario);
    }

    @Override
    public double calcularSalario() {
        return getBaseSalario() + bonus;
    }

    public double getBonus(){
        return bonus;

    }
}
