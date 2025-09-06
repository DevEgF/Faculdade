package main

import (
	"fmt"
	"time"
)

func main() {

	i := 0

	for i < 10 {
		time.Sleep(1 * time.Second)
		i++
		fmt.Println(i)
	}

	// Classic for loop
	for j := 0; j < 10; j++ {
		time.Sleep(1 * time.Second)
		fmt.Println(j)
	}

	// Looping over a collection
	numbers := []int{10, 20, 30, 40, 50}

	// Quando precisar iterar sobre índices e valores
	for index, value := range numbers {
		fmt.Printf("Index: %d, Value: %d\n", index, value)
	}

	// Ignoring index
	for _, value := range numbers {
		fmt.Printf("Value: %d\n", value)
	}

	// Ignoring value
	for index := range numbers {
		fmt.Printf("Index: %d\n", index)
	}

	// Iterating over a string
	// When you range over a string, you get the index of each rune (character)
	// To get the actual character, you need to convert the index to a string
	// using string(index)
	for index := range "Hello" {
		fmt.Println(string(index))
	}

	usuarios := map[string]string{
		"nome":      "João",
		"sobrenome": "Silva",
		"idade":     "30",
	}

	// Iterating over a map
	for chave, valor := range usuarios {
		fmt.Printf("%s: %s\n", chave, valor)
	}

	type user struct {
		name string
		age  int
	}

	list1 := []user{
		{name: "Carlos", age: 25},
		{name: "Mariana", age: 32},
	}

	// Iterating over a slice of structs
	for _, usuario := range list1 {
		fmt.Printf("Name: %s, Age: %d\n", usuario.name, usuario.age)
	}

}
