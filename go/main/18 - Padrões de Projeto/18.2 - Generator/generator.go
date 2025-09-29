package main

import (
	"fmt"
	"time"
)

func main() {
	channel := escrever("Olá, Mundo!")

	for i := 0; i < 10; i ++ {
		fmt.Println(<-channel)
	}
}

// Uma função que vai encapsular uma chamada em goroutine e retornar um canal
func escrever(text string) <-chan string {
	out := make(chan string)

	go func () {
		fmt.Printf("Valor recebido: %s", text)
		time.Sleep(time.Millisecond * 500)
	} ()

	return out
}