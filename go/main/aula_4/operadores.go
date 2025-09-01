package main

import "fmt"

func main() {

	soma := 5 + 10
	subtracao := 10 - 5
	multiplicacao := 5 * 10
	divisao := 10 / 5
	restoDaDivisao := 10 % 5

	// Imprimindo os resultados
	fmt.Println("Soma:", soma)
	fmt.Println("Subtração:", subtracao)
	fmt.Println("Multiplicação:", multiplicacao)
	fmt.Println("Divisão:", divisao)
	fmt.Println("Resto da Divisão:", restoDaDivisao)

	var num1 int16 = 10
	var num2 int16 = 5
	resultado := num1 + num2
	fmt.Println("Resultado da soma:", resultado)

	// FIM DOS ARITMETICOS

	// ATRIBUIÇÃO
	var variavel1 string = "String"
	variavel2 := "Outra String"
	fmt.Println("Valor da variável 1:", variavel1)
	fmt.Println("Valor da variável 2:", variavel2)
	// FIM DOS OPERADORES DE ATRIBUIÇÃO

	// OPERADORES RELACIONAIS
	fmt.Println("num1 é igual a num2?", num1 == num2)
	fmt.Println("num1 é diferente de num2?", num1 != num2)
	fmt.Println("num1 é maior que num2?", num1 > num2)
	fmt.Println("num1 é menor que num2?", num1 < num2)
	fmt.Println("num1 é maior ou igual a num2?", num1 >= num2)
	fmt.Println("num1 é menor ou igual a num2?", num1 <= num2)
	// FIM DOS RELACIONAIS

	// OPERADORES LOGICOS
	fmt.Println("num1 é maior que num2 E num1 é menor que 20?", num1 > num2 && num1 < 20)
	fmt.Println("num1 é maior que num2 OU num1 é menor que 5?", num1 > num2 || num1 < 5)
	fmt.Println("num1 é diferente de num2?", num1 != num2)
	// FIM DOS OPERADORES LOGICOS

	// OPERADORES BITWISE
	fmt.Println("num1 AND num2:", num1&num2)
	fmt.Println("num1 OR num2:", num1|num2)
	fmt.Println("num1 XOR num2:", num1^num2)
	fmt.Println("num1 NOT:", ^num1)
	fmt.Println("num1 SHL 1:", num1<<1)
	fmt.Println("num1 SHR 1:", num1>>1)
	// FIM DOS OPERADORES BITWISE

	// OPERADORES DE INCREMENTO E DECREMENTO
	num1++
	num2--
	fmt.Println("num1 após incremento:", num1)
	fmt.Println("num2 após decremento:", num2)

	num1 -= 20
	num1 *= 30
	num1 /= 10
	num1 += 50
	num1 %= 3
	// FIM DOS OPERADORES DE INCREMENTO E DECREMENTO

	// OPERADORES TERNARIOS (go não tem operadores ternários)
	text := "Menor ou igual a 5"
	if num1 > 5 {
		text = "Maior que 5"
	}
	fmt.Println("Resultado do operador ternário:", text)

}
