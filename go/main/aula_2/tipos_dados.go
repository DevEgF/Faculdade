package main

import (
	"errors"
	"fmt"
)

func main() {
	var inteiro int = 10
	var flutuante float64 = 10.5
	var booleano bool = true
	var texto string = "Olá, Go!"

	var text string

	var error error = errors.New("Isso é um erro")

	fmt.Println(inteiro)
	fmt.Println(flutuante)
	fmt.Println(booleano)
	fmt.Println(texto)
	fmt.Println(text)
	fmt.Println(error)
}
