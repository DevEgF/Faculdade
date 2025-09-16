package main

import (
	"fmt"
	"time"
)

func main() {
	channel1, channel2 := make(chan string), make(chan string)

	go func() {
		for {
			time.Sleep(time.Millisecond * 500)
			channel1 <- "Olá do channel 1"
		}
	}()

	go func() {
		for {
			time.Sleep(time.Second * 2)
			channel2 <- "Olá do channel 2"
		}
	}()

	for {
		select {
		case mensagemChannel1 := <-channel1:
			fmt.Println(mensagemChannel1)
		case mensagemChannel2 := <-channel2:
			fmt.Println(mensagemChannel2)
		default:
			fmt.Println("Aguardando mensagens...")
		}

		// Sem o select, a leitura dos canais fica bloqueada até que uma mensagem seja enviada
		// Portanto, é importante usar o select para evitar bloqueios
		mensagemChannel1 := <-channel1
		fmt.Println(mensagemChannel1)

		mensagemChannel2 := <-channel2
		fmt.Println(mensagemChannel2)
	}
}
