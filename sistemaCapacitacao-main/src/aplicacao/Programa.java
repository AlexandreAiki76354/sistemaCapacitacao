package aplicacao;

import entidades.ServidorPublico;

import entidades.Curso;

import java.util.List;

import javax.swing.*;
import java.sql.SQLOutput;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico servidorPublico = new ServidorPublico();

        servidorPublico.adicionarServidorPublico();
        servidorPublico.listarServidores();

        servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula que deseja pesquisar")));
        servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula a ser excluída")));
        servidorPublico.listarServidores();
    }
}




















//        public void adicionarServidorPublico(){
//            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matrícula: "));
//            int orgao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Órgão: "));
//            int cargo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Cargo do Servido: "));
//            int lotacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matrícula"));
//            int email = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o email do Servidor: "));
//            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Salário do Servidor: "));
//        }
//        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, locacao, email, salario);
//
//        seridores.add(servidor);
//
//
//        public void listarServidoresPublicos(){
//            for (ServidorPublico servidor: servidores){
//                System.out.println(servidor);
//            }
//        }
//
//        public static void listarServidores(int matricula){
//            for (ServidorPublico servidor: servidores){
//                if (servidor.getMatricula() == matricula){
//                    System.out.println(servidor);
//                    encontrou = true;
//                    break;
//                }
//            }
//            if (!encontrou){
//                JOptionPane.showMessageDialog(null, "Servidor não encontrado!");
//            }
//        }
//    }