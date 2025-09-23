class Rectangule {
    double width = 5.5;
    double height = 8.0;

    double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangule rect = new Rectangule();
        System.out.println("Área do retangule é " + rect.area());
    }
}
