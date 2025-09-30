package wrappers;

import java.io.File;

public class TiposWrappers {

    public static void main(String[] args) {
        double numeroDouble = 123.56;
        //Expression cast
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        //Recurso Wrapper
        Double numeroDouble2 = 123.5623;
        Integer numeroInt2 = numeroDouble2.intValue();
        System.out.println(numeroInt2);

        String num = "100";
        int num2 = Integer.parseInt(num);
        System.out.println(num2);
    }

    /**
     * Oferece métodos utilitários para conversões numéricas, demonstrando as
     * diferenças cruciais entre o uso de type casting em tipos primitivos e a
     * invocação de métodos em classes Wrapper.
     *
     * <p>A escolha entre uma abordagem e outra tem implicações diretas em
     * performance, legibilidade e, mais importante, segurança em relação a
     * valores nulos (Null Safety). Esta classe serve como uma documentação técnica
     * e prática sobre qual método utilizar em cada cenário.
     *
     */
    public final class TypeConversionUtils {

        /**
         * Construtor privado para impedir a instanciação de classe utilitária.
         */
        private TypeConversionUtils() {}

        /**
         * Converte um {@code double} primitivo para um {@code int} primitivo usando
         * um type cast direto.
         *
         * <p>Este método utiliza o operador de cast {@code (int)}, que é uma instrução
         * de baixo nível da linguagem Java. A conversão é feita por <strong>truncamento</strong>,
         * o que significa que qualquer parte decimal é descartada, sem arredondamento.
         *
         * <p><strong>Características:</strong>
         * <ul>
         * <li><strong>Performance:</strong> É a forma mais rápida de conversão, pois não
         * envolve chamadas de método ou criação/desempacotamento de objetos.</li>
         * <li><strong>Segurança:</strong> Totalmente seguro contra {@code NullPointerException},
         * pois tipos primitivos não podem ser nulos.</li>
         * </ul>
         *
         * <p><b>Exemplo:</b>
         * <pre>{@code
         * double d = 123.99;
         * int i = TypeConversionUtils.convertFromPrimitive(d); // i será 123
         * }</pre>
         *
         * @param primitiveDouble o valor {@code double} primitivo a ser convertido.
         * @return O valor {@code int} resultante após o truncamento da parte decimal.
         */
        public static int convertFromPrimitive(double primitiveDouble) {
            return (int) primitiveDouble;
        }

        /**
         * Converte um objeto {@link Double} para um {@code int} primitivo utilizando o
         * método {@link Double#intValue()}.
         *
         * <p>Este método invoca o método de instância no objeto Wrapper. Internamente,
         * este método também realiza um cast com <strong>truncamento</strong>, similar ao
         * operador {@code (int)}.
         *
         * <p><strong>Características:</strong>
         * <ul>
         * <li><strong>Performance:</strong> Possui uma leve sobrecarga (overhead) devido
         * à chamada de método e ao processo de unboxing (extração do valor primitivo
         * do objeto).</li>
         * <li><strong>Segurança:</strong> <strong>Atenção!</strong> Este método lançará uma
         * {@link NullPointerException} se o parâmetro de entrada for {@code null}.
         * O chamador é responsável por garantir que o objeto não é nulo antes da
         * invocação.</li>
         * </ul>
         *
         * <p><b>Exemplo:</b>
         * <pre>{@code
         * Double dWrapper = Double.valueOf(123.56);
         * int i = TypeConversionUtils.convertFromWrapper(dWrapper); // i será 123
         *
         * Double dNull = null;
         * // A linha abaixo lançará NullPointerException
         * // int j = TypeConversionUtils.convertFromWrapper(dNull);
         * }</pre>
         *
         * @param wrapperDouble o objeto {@code Double} a ser convertido. <strong>Pode ser nulo.</strong>
         * @return O valor {@code int} resultante da conversão.
         * @throws NullPointerException se {@code wrapperDouble} for {@code null}.
         */
        public static int convertFromWrapper(Double wrapperDouble) {
            // A exceção será lançada aqui se wrapperDouble for null.
            // Numa aplicação real, uma verificação de nulo seria recomendada.
            // if (wrapperDouble == null) {
            //     throw new IllegalArgumentException("O Double Wrapper não pode ser nulo.");
            // }
            return wrapperDouble.intValue();
        }
    }
}
