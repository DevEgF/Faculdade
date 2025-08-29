package main

import "fmt"

func main() {
	soma := somar(5, 10)
	fmt.Println("Soma:", soma)

	subtracao := subtrair(10, 5)
	fmt.Println("Subtração:", subtracao)
	anotherFunc()

	resultadoSoma, resultadoSubtracao := functionWithMultipleReturns(5, 10)
	fmt.Println("Resultado da soma:", resultadoSoma)
	fmt.Println("Resultado da subtração:", resultadoSubtracao)
}

func somar(a int, b int) int {
	return a + b
}

func subtrair(a int, b int) int {
	return a - b
}

func anotherFunc() {

	var f = func(txt string) string {
		fmt.Println(txt)
		return txt
	}

	result := f("Texto passado para a função aninhada")
	fmt.Println("Resultado da função aninhada:", result)
}

func functionWithMultipleReturns(a int, b int) (int, int) {
	soma := a + b
	subtracao := a - b
	return soma, subtracao
}
