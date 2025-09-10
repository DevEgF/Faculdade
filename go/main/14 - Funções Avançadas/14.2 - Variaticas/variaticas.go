package main

import "fmt"

func sumVariatica(numeros ...int) int {
	total := 0
	for _, numero := range numeros {
		total += numero
	}

	return total
}

func escrever(texto string, numeros ...int) {
	for _, numero := range numeros {
		fmt.Println(texto, numero)
	}
}

func main() {
	totalDaSoma := sumVariatica(1, 2, 3, 4, 5, 6, 200, 102, 12, 13)
	fmt.Println("Total da soma:", totalDaSoma)

	escrever("Números:", 1, 2, 3, 4, 5)
}
