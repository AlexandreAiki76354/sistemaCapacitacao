package aplicacao;

import entidades.ServidorPublico;

import java.sql.SQLOutput;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");
        isabela.setNome("João");

        ServidorPublico joao = new ServidorPublico();
        ServidorPublico maria = new ServidorPublico(123, "Maria");
        System.out.println(maria.getNome());
        ServidorPublico jose = new ServidorPublico(134, "José", "Aduitor");
        System.out.println(jose.getNome());
        System.out.println(jose.getCargo());

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("R$ %.2f: ",isabela.calcularSalarioHorasExtras(10,5.60));
        System.out.println("Salario é: " + isabela.calcularSalario(5000));
        double soma = isabela.calcularNumeros(4,6,8);
        System.out.println(soma);
    }
}
