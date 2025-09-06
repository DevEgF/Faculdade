package questions

//2 Realiza a leitura de 1 int e imprime o seu antecessor e o seu sucessor

import "fmt"

func Question_2() {

	var num int
	fmt.Print("Digite um número inteiro: ")
	fmt.Scan(&num)

	successor := num + 1
	predecessor := num - 1

	fmt.Printf("Antecessor: %d\n", predecessor)
	fmt.Printf("Sucessor: %d\n", successor)
}
