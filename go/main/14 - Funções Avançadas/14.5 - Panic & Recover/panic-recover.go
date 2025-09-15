package main

import "fmt"

func recuperarExecucao() {
	if r := recover(); r != nil {
		fmt.Println("Execução recuperada com sucesso:", r)
	}
}

func alunoEstaAprovado(n1, n2 float64) bool {
	defer recuperarExecucao()

	media := (n1 + n2) / 2

	if media > 6 {
		return true
	} else {
		return false
	}

	panic("A média é exatamente 6!")
}

func main() {
	fmt.Println(alunoEstaAprovado(6, 6))

	fmt.Println("Pós chamada da função")
}
