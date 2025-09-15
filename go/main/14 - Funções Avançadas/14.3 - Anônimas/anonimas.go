package main

import "fmt"

func main() {
	fmt.Print("Funções Anônimas")
	// DECLARAÇÃO E EXECUÇÃO IMEDIATA
	func() {
		fmt.Println("Função Anônima Executada")
	}()

	// DECLARAÇÃO E EXECUÇÃO IMEDIATA COM PARÂMETRO
	func(texto string) {
		fmt.Println(texto)
	}("Função Anônima com Parâmetro")

	// ATRIBUIÇÃO A UMA VARIÁVEL
	func(texto string) {
		fmt.Println(texto)
	}("Função Anônima Atribuída a uma Variável")

	// ATRIBUIÇÃO A UMA VARIÁVEL E EXECUÇÃO
	minhaFuncao := func(texto string) {
		fmt.Println(texto)
	}
	minhaFuncao("Função Anônima Atribuída a uma Variável e Executada")

	// FUNÇÃO ANÔNIMA COM RETORNO
	soma := func(a, b int) int {
		return a + b
	}
	resultado := soma(10, 20)
	fmt.Println(resultado)

	// FUNÇÃO ANÔNIMA COM RETORNO E EXECUÇÃO IMEDIATA
	resultado2 := func(a, b int) int {
		return a + b
	}(30, 40)
	fmt.Println(resultado2)

	// FUNÇÃO ANÔNIMA COM RETORNO E MÚLTIPLOS VALORES
	resultado3, resultado4 := func(a, b int) (int, int) {
		return a + b, a - b
	}(50, 20)
	fmt.Println(resultado3, resultado4)

	// FUNÇÃO ANÔNIMA COM RETORNO, MÚLTIPLOS VALORES, ATRIBUIÇÃO A UMA VARIÁVEL E EXECUÇÃO
	minhaFuncao3 := func(a, b int) (int, int) {
		return a + b, a - b
	}
	resultado5, resultado6 := minhaFuncao3(90, 10)
	fmt.Println(resultado5, resultado6)

}
