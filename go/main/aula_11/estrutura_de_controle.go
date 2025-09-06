package main

import "fmt"

func main() {
	fmt.Println("Estruturas de Controle")

	numero := 10

	if numero > 15 {
		fmt.Println("Número maior que 15")
	} else {
		fmt.Println("Número menor ou igual a 15")
	}

	if anotherNumber := numero; anotherNumber > 0 {
		fmt.Println("Número maior que 0")
	} else if anotherNumber < 0 {
		fmt.Println("Número menor que 0")
	} else {
		fmt.Printf("Número igual a %d\n", anotherNumber)
	}
}
