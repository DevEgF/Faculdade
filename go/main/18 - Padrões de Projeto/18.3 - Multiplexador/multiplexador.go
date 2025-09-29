package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	// Usando o multiplexador para combinar dois canais
	channel := multiplexar(escrever("Olá, Mundo!"), escrever("Olá, Golang!"))

	// Lendo do canal combinado
	for i := 0; i < 10; i++ {
		fmt.Println(<-channel)
	}
}

func multiplexar(c1, c2 <-chan string) <-chan string {
	out := make(chan string)

	go func() {
		for {
			select {
			case msg := <-c1:
				out <- msg
			case msg := <-c2:
				out <- msg
			}
		}
	}()

	return out
}

// Multiplexador: Combina múltiplos canais em um único canal de saída
func escrever(text string) <-chan string {
	out := make(chan string)

	go func() {
		fmt.Printf("Valor recebido: %s", text)
		time.Sleep(time.Millisecond * time.Duration(rand.Intn(2000)))
	}()

	return out
}