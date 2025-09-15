package main

import "fmt"

func diaDaSemana(numero int) string {
	switch numero {
	case 1:
		return "Domingo"
	case 2:
		return "Segunda"
	case 3:
		return "Terça"
	case 4:
		return "Quarta"
	case 5:
		return "Quinta"
	case 6:
		return "Sexta"
	case 7:
		return "Sábado"
	default:
		return "Número inválido"
	}
}

func diaDaSemana2(number int) string {
	var result string

	switch number {
	case 1:
		result = "Domingo"
		fallthrough // executa o próximo case mesmo que a condição não seja satisfeita
	case 2:
		result = "Segunda"
	case 3:
		result = "Terça"
	case 4:
		result = "Quarta"
	case 5:
		result = "Quinta"
	case 6:
		result = "Sexta"
	case 7:
		result = "Sábado"
	default:
		result = "Número inválido"
	}
	return result
}

func main() {
	fmt.Println("Switch em Go")

	var entry int

	fmt.Print("Digite o número: ")
	fmt.Scan(&entry)

	fmt.Println(diaDaSemana(entry))

	fmt.Println(diaDaSemana2(entry))
}
