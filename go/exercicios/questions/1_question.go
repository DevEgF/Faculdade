package questions

// 1. Realiza a leitura de 2 floats e imprime as seguintes operações: soma, subtração, multiplicação, divisão e resto da divisão.
import "fmt"

func Question_1() {
	var num1, num2 float64
	fmt.Print("Digite o primeiro número: ")
	fmt.Scan(&num1)
	fmt.Print("Digite o segundo número: ")
	fmt.Scan(&num2)

	soma := num1 + num2
	subtracao := num1 - num2
	multiplicacao := num1 * num2
	divisao := num1 / num2
	resto := int(num1) % int(num2)

	fmt.Printf("Soma: %.2f\n", soma)
	fmt.Printf("Subtração: %.2f\n", subtracao)
	fmt.Printf("Multiplicação: %.2f\n", multiplicacao)
	fmt.Printf("Divisão: %.2f\n", divisao)
	fmt.Printf("Resto da divisão: %d\n", resto)
}
