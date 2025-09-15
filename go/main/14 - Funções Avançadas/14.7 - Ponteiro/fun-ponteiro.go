package main

import "fmt"

func inverterSinal(numero int) int {
	return numero * -1
}

func inverterSinalPonteiro(numero *int) {
	*numero = *numero * -1
}

func main() {
	// Usando passagem por valor
	num := 20
	numeroInvertido := inverterSinal(num)
	fmt.Println(numeroInvertido)
	fmt.Println(num)

	// Usando passagem por referência (ponteiro)
	novoNumero := 40
	inverterSinalPonteiro(&novoNumero)
	fmt.Println(novoNumero)
}
