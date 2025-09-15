package main

import "fmt"

func clousure() func() {
	text := "Dentro da função clousure"

	funcao := func() {
		fmt.Println(text)
	}

	return funcao
}

func main() {
	text := "Dentro da função main"
	fmt.Println(text)

	funcaoNova := clousure()
	funcaoNova()

	fmt.Println("Fim do programa")
}
