package main

import (
	"fmt"
	"time"
)

func main() {
	canal := make(chan string)

	// Inicia a goroutine que escreve mensagens no canal
	go escrever("Olá Mundo!", canal)

	fmt.Println("Aguardando mensagem...")

	// Recebe mensagens do canal
	// bloqueia até receber a próxima mensagem
	// não respeito o for, porque a mensagem chegou a primeira vez
	mensagem := <-canal
	println(mensagem)

	// Continua recebendo mensagens do canal
	// bloqueia até receber a próxima mensagem
	// deadlock se não tiver mais mensagens

	//for {
	// Recebe mensagem do canal
	// Se o canal estiver fechado, a variavel aberto será false
	//	mensagem, aberto := <-canal

	// Se o canal estiver fechado, sai do loop
	//	if !aberto {
	//		break
	//	}

	//	println(mensagem)
	//}

	for mensagem := range canal {
		println(mensagem)
	}

	fmt.Println("Fim do programa!")
}

func escrever(text string, canal chan string) {
	time.Sleep(time.Second * 5)

	for i := 0; i < 5; i++ {
		// Envia mensagem para o canal
		canal <- text
		time.Sleep(time.Second)
	}

	close(canal) // fecha o canal quando não for mais usar
}
