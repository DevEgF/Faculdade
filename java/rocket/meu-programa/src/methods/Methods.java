package methods;

public class Methods {



    public static void main(String[] args) {
        int soma = sum(1, 2);
        int sub = sub(1, 2);
        int mul = mul(2, 2);
        int div = div(2, 2);
        int mod = mod(2, 5);

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }


    static int sum(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
