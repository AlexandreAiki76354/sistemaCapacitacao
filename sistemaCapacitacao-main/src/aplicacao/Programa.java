package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");
        isabela.setNome("João");
        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("R$ %.2f: ",isabela.calcularSalarioHorasExtras(10,5.60));
        System.out.println("Salario é: " + isabela.calcularSalario(5000));
        double soma = isabela.calcularNumeros(4,6,8);
        System.out.println(soma);
    }
}
