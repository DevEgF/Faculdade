import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        while (true) {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Cálculo de Notas do Georgio!");

            String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do(a) aluno(a):");
            if (nomeAluno == null) {
                break;
            }

            double notaProjeto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota de Projeto (0 a 2):"));
            double notaProjeto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota de Projeto (0 a 2):"));
            double notaProva1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota de Prova (0 a 2):"));
            double notaProva2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota de Prova (0 a 2):"));
            double notaAtividades = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota de Atividades (0 a 2):"));


            double somaProjetos = notaProjeto1 + notaProjeto2;
            double somaProvas = notaProva1 + notaProva2;

            double baseFinal = somaProjetos + notaAtividades;

            double mediaTotal = somaProjetos + somaProvas + notaAtividades;

            String situacao = "";
            String mensagemFinal = "";

            if (baseFinal < 4.0) {
                situacao = "Reprovado Direto";
                mensagemFinal = "A soma de Projetos + Atividades (" + String.format("%.2f", baseFinal) + ") é menor que 4.0.";
            }

            else if (mediaTotal < 4.0) {
                situacao = "Reprovado Direto";
                mensagemFinal = "A média total (" + String.format("%.2f", mediaTotal) + ") é menor que 4.0.";
            }

            else if (mediaTotal >= 7.0) {
                situacao = "Aprovado Direto";
                mensagemFinal = "Parabéns!";
            }

            else {
                double pontosNecessarios = 6.0 - baseFinal;
                if (pontosNecessarios <= 0) {
                    situacao = "Aprovado";
                    mensagemFinal = "A base (Projetos + Atividades) já é " + String.format("%.2f", baseFinal) + ". Aprovado!";
                }
                else if (pontosNecessarios > 4.0) {
                    situacao = "Reprovado";
                    mensagemFinal = "Precisaria de " + String.format("%.2f", pontosNecessarios) + " na final, mas o máximo é 4.0.";
                }
                else {
                    situacao = "Vai para Final";
                    mensagemFinal = "Precisa tirar " + String.format("%.2f", pontosNecessarios) + " pontos na prova final para ser aprovado(a).";
                }
            }

            String resumo = String.format(
                    "--- Resultado do Aluno ---\n" +
                            "Nome: %s\n\n" +
                            "Soma das 5 notas: %.2f\n" +
                            "(Projetos: %.2f, Provas: %.2f, Atividades: %.2f)\n\n" +
                            "Situação: %s\n" +
                            "Observação: %s",
                    nomeAluno, mediaTotal, somaProjetos, somaProvas, notaAtividades, baseFinal, situacao, mensagemFinal
            );

            JOptionPane.showMessageDialog(null, resumo, "Boletim Final", JOptionPane.INFORMATION_MESSAGE);

            Object[] options = {"Calcular outro aluno", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null,
                    "Deseja calcular a nota de outro aluno?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (escolha == 1 || escolha == JOptionPane.CLOSED_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema, Georgio! Bom descanso!");
    }
}

