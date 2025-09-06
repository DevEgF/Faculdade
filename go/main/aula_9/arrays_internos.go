package main

import "fmt"

func main() {

	// make cria um slice com tamanho e capacidade definidos
	slice3 := make([]float64, 10, 15)

	slice3 = append(slice3, 5)
	slice3 = append(slice3, 6)

	// Exibindo o slice
	fmt.Println(slice3)
	// Exibindo informações sobre o tamanho do slice
	fmt.Println(len(slice3))
	// Exibindo informações sobre a capacidade do slice
	fmt.Println(cap(slice3))

	slice4 := make([]float32, 5)

	// O Slice vai assumir o tamanho e capacidade definidos na função make
	// Caso não seja definido a capacidade, ela será igual ao tamanho
	// Nesse caso, o slice4 terá tamanho e capacidade iguais a 5
	fmt.Println(slice4)
	fmt.Println(len(slice4))
	fmt.Println(cap(slice4))
}
