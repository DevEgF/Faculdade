package main

func main() {
	canal := make(chan string) // canal sem buffer
	canal <- "Olá Mundo!"

	mensagem := <-canal // deadlock, não tem quem recebe
	println(mensagem)

	channel2 := make(chan string, 2) // canal com buffer de 2 posições
	channel2 <- "Olá"
	channel2 <- "Mundo!"
	// channel2 <- "!" // panic, buffer cheio

	mensagem2 := <-channel2 // recebe a primeira mensagem
	mensagem3 := <-channel2 // recebe a segunda mensagem
	println(mensagem2)
	println(mensagem3)

}
