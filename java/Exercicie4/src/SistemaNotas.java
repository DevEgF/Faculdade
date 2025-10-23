import javax.swing.JOptionPane;

public class SistemaNotas {

    public static void main(String[] args) {

        while (true) {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Cálculo de Notas do Georgio!");

            String studentName = JOptionPane.showInputDialog(null, "Digite o nome do(a) aluno(a):");

            if (studentName.isBlank()) {
                break;
            }

            double noteProject1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota de Projeto (0 a 2):"));
            double noteProject2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota de Projeto (0 a 2):"));
            double noteEvaluation1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota de Prova (0 a 2):"));
            double noteEvaluation2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota de Prova (0 a 2):"));
            double noteExercicies = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota de Atividades (0 a 2):"));

            double sumProjectsNotes = noteProject1 + noteProject2;
            double sumEvaluationNotes = noteEvaluation1 + noteEvaluation2;
            double finalBase = sumProjectsNotes + noteExercicies;
            double totalAverage = sumProjectsNotes + sumEvaluationNotes + noteExercicies;

            String situation;
            String finalDetails = "";

            if (finalBase < 4.0) {
                situation = "Reprovado Direto (Projeto + Atividades < 4.0)";
            } else if (totalAverage >= 7.0) {
                situation = "Aprovado Direto";
            } else if (totalAverage >= 4.0) {
                situation = "Vai para Final";

                double needeedNote = 6.0 - finalBase;

                if (needeedNote <= 0) {
                    finalDetails = "\nJá está aprovado! Precisa de 0 pontos na final.";
                } else if (needeedNote > 4.0) {
                    finalDetails = String.format("\nReprovado na final - Precisa de %.2f pontos (mais que 4.0)", needeedNote);
                } else {
                    finalDetails = String.format("\nPrecisa tirar %.2f pontos na final", needeedNote);
                }
            } else {
                situation = "Reprovado Direto (Média total < 4.0)";
            }

            String resume = String.format(
                    "--- Resultado do Aluno ---\n" +
                            "Nome: %s\n\n" +
                            "Soma das 5 notas: %.2f\n" +
                            "- Projetos: %.2f\n" +
                            "- Provas: %.2f\n" +
                            "- Atividades: %.2f\n" +
                            "Situação: %s%s",
                    studentName, totalAverage, sumProjectsNotes, sumEvaluationNotes,
                    noteExercicies, situation, finalDetails
            );

            JOptionPane.showMessageDialog(null, resume);

            Object[] options = {"Calcular outro aluno", "Sair"};
            int choices = JOptionPane.showOptionDialog(null,
                    "Deseja calcular a nota de outro aluno?",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choices == 1 || choices == JOptionPane.CLOSED_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema, Georgio! Bom descanso!");
    }
}