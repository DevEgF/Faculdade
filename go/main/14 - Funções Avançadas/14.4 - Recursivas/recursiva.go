package main

import "fmt"

// função fibonacci recursiva
func fibonacci(pisocao int) int {
	if pisocao <= 1 {
		return pisocao
	}
	return fibonacci(pisocao-2) + fibonacci(pisocao-1)
}

func main() {
	fmt.Println("Função Recursiva")
	fmt.Println(fibonacci(10))

	// CUIDADO COM FUNÇÕES RECURSIVAS
	// fmt.Println(fibonacci(10000)) // ERRO: stack overflow

	posicao := 12

	for i := 0; i < posicao; i++ {
		fmt.Printf("Fibonacci de %d: %d\n", i, fibonacci(i))
	}
}
