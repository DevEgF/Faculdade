package main

import (
	"fmt"
)

func funcao1() {
	fmt.Println("Função 1")
}

func funcao2() {
	fmt.Println("Função 2")
}

func alunoEstaAprovado(n1, n2 float64) bool {
	defer fmt.Println("Média calculada. Resultado será retornado em breve...")

	fmt.Println("Calculando a média...")

	media := (n1 + n2) / 2

	if media >= 6 {
		return true
	}

	return false
}

func main() {
	// ADIAR a execução de uma função até o final da função que a chamou
	defer funcao1() // adiada até o final da função2
	funcao2()

	fmt.Println(alunoEstaAprovado(7, 8))
}
