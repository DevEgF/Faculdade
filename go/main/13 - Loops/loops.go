package main

import "fmt"

func main() {
	fmt.Println("Loops em Go")

	// Loop "for" tradicional
	for i := 0; i < 5; i++ {
		fmt.Println("Contador:", i)
	}

	// Loop "for" com condição
	j := 0
	for j < 5 {
		fmt.Println("Contador j:", j)
		j++
	}

	// Loop infinito com break
	k := 0
	for {
		if k >= 5 {
			break
		}
		fmt.Println("Contador k:", k)
		k++
	}

	// Loop "for" com range

	numbers := []int{10, 20, 30, 40, 50}
	for index, value := range numbers {
		fmt.Printf("Index: %d, Value: %d\n", index, value)
	}

	// Loop "for" com range ignorando o índice
	for _, value := range numbers {
		fmt.Printf("Value: %d\n", value)
	}

	fmt.Println("Fim dos exemplos de loops.")

}
