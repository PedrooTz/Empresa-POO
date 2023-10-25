package br.senai.sp.jandira.model;

abstract class Funcionarios {

    private String nome;

    private int id;

    private double baseSalario;


    public Funcionarios(String nome, int id, double baseSalario) {

        this.nome = nome;
        this.id = id;
        this.baseSalario = baseSalario;


    }
      public abstract double  calcularSalario();


    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalario() {
        return baseSalario;
    }


}


