import javax.swing.*;

public class SistemaDeNotas {

    public static void main(String[] args) {
        while (true) {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Cálculo de Notas do Georgio!");

            String nameStudent = JOptionPane.showInputDialog(null, "Digite o nome do(a) aluno(a): ");

            if(nameStudent.isBlank()) {
                break;
            }

            double noteProject1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota do Projeto (0 a 2):"));
            double noteProject2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota do Projeto (0 a 2):"));
            double noteProof1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota da Prova (0 a 2):"));
            double noteProof2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota da Prova (0 a 2):"));
            double notaExercicies = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota das Atividades (0 a 2):"));

            double sumProjectsNotes = noteProject1 + noteProject2;
            double sumProofsNotes = noteProof1 + noteProof2;

            double baseFinal = sumProjectsNotes + notaExercicies;

            double mediaTotal = sumProjectsNotes + sumProofsNotes + notaExercicies;

            String situation = "";
            String finalMessage = "";

            if(baseFinal < 4) {
                situation = "Reprovado Direto";
                finalMessage = "A soma de Projetos + Atividades (" + String.format("%.2f", baseFinal) + ") é menor que 4.0.";
            }

            else if (mediaTotal < 4.0) {
                situation = "Reprovado Direto";
                finalMessage = "A média total (" + String.format("%.2f", mediaTotal) + ") é menor que 4.0.";
            }

            else if (mediaTotal >= 7.0) {
                situation = "Aprovado Direto";
                finalMessage = "Parabéns!";
            }

            else {
                double necessaryNote = 6.0 - baseFinal;
                if (necessaryNote <= 0) {
                    situation = "Aprovado";
                    finalMessage = "A base (Projetos + Atividades) já é " + String.format("%.2f", baseFinal) + ". Aprovado!";
                }
                else if (necessaryNote > 4.0) {
                    situation = "Reprovado";
                    finalMessage = "Precisaria de " + String.format("%.2f", necessaryNote) + " na final, mas o máximo é 4.0.";
                }
                else {
                    situation = "Vai para Final";
                    finalMessage = "Precisa tirar " + String.format("%.2f", necessaryNote) + " pontos na prova final para ser aprovado(a).";
                }
            }
        }
    }
}
