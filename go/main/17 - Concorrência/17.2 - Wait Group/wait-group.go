package main

import (
	"fmt"
	"sync"
	"time"
)

func main() {
	var waitGroup sync.WaitGroup

	waitGroup.Add(2) // Adiciona duas goroutines ao wait group

	go func() {
		escrever("Olá Mundo!")
		defer waitGroup.Done() // Decrementa o contador do wait group ao finalizar
	}()

	go func() {
		escrever("Programando em Go!")
		defer waitGroup.Done()
	}()

	waitGroup.Wait() // Aguarda todas as goroutines finalizarem
}

func escrever(text string) {
	for i := 0; i < 5; i++ {
		fmt.Println(text)
		time.Sleep(time.Second)
	}
}
