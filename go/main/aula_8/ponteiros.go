package main

import "fmt"

func main() {
	fmt.Print("Ponteiros!")

	var variavel1 int = 10
	var variavel2 int = variavel1

	variavel1++
	fmt.Println(variavel1, variavel2)

	// PONTEIRO É UMA REFERÊNCIA DE MEMORIA
	var variavel3 int

	// GUARDA O ENDEREÇO DE MEMORIA
	var ponteiro *int

	variavel3 = 100
	ponteiro = &variavel3

	// VAI FAZER O PRINT DO ENDEREÇO DE MEMORIA NO PONTEIRO
	fmt.Println(variavel3, ponteiro)

	// VAI FAZER O PRINT DO VALOR QUE ESTÁ NO ENDEREÇO DE MEMORIA
	fmt.Println(*ponteiro) // Desreferenciação

	variavel3 = 150
	fmt.Println(variavel3, *ponteiro)
}
