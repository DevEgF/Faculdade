import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //DIALOG
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema");

        // INPUT
        String name = JOptionPane.showInputDialog(null, "Digite seu nome");
        System.out.println(name);

        //INPUT COM COVNERSÃO DE TIPO
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        System.out.println(age);

        int anwser = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

        //YES == 0 NO == 1 CANCEL == 2
        if (anwser == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu YES");
        }

        //CUSTOM DIALOG
        Object[] option = {"Continuar", "Cancelar", "Ajuda"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "O que deseja fazer?",
                "Menu principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                option,
                option[0]
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu Continuar");
        }
    }
}

