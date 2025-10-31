public class Question7 {
    public static void main(String[] args) {

        String[] names = {
                "Ana Beatriz",
                "Bruno Alves",
                "Carla Dias",
                "Daniel Moreira",
                "Elisa Fernandes",
                "Felipe Costa",
                "Gabriela Lima",
                "Hugo Martins",
                "Isabela Rocha",
                "João Pedro"
        };


        int[] ages = {
                22,
                35,
                18,
                41,
                29,
                50,
                27,
                33,
                19,
                62
        };


        for(int i = 0; i < names.length; i++){
            String name = names[i];
            int age = ages[i];
            System.out.println("Nome: " + name + ", Idade: " + age);
        }
    }
}
