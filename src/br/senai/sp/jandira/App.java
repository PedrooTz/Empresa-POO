package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class App {
    public static void main(String[] args) {


        Gerente gerente = new Gerente("Pedro", 1, 1200);
        Programador programador = new Programador("João", 2, 300);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("ID: " + gerente.getId());
        System.out.println("Salário Base: R$" + gerente.getBaseSalario());
        System.out.println("Bônus de Gerência: R$" + gerente.getBonus());
        System.out.println("Salário Total: R$" + gerente.calcularSalario());
        System.out.println();

        System.out.println("Informações do Programador:");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("ID: " + programador.getId());
        System.out.println("Salário Base: R$" + programador.getBaseSalario());
        System.out.println("Salário Total: R$" + programador.calcularSalario());
    }


}
