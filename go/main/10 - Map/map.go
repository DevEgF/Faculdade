package main

import "fmt"

func main() {
	fmt.Println("Maps em Go")

	usuario := map[string]string{
		"nome":      "João",
		"sobrenome": "Silva",
	}

	fmt.Println(usuario)

	usuario["nome"] = "Pedro"
	usuario["idade"] = "30"
	fmt.Println(usuario)

	// Deletando um elemento do map
	delete(usuario, "sobrenome")
	fmt.Println(usuario)

	usuario2 := make(map[string]map[string]string)
	usuario2["usuario1"] = map[string]string{
		"nome":      "João",
		"sobrenome": "Silva",
	}
	usuario2["usuario2"] = map[string]string{
		"nome":      "Maria",
		"sobrenome": "Oliveira",
	}

	fmt.Println(usuario2)

	// Chave existente
	idade, ok := usuario["idade"]
	if ok {
		fmt.Println("Idade:", idade)
	} else {
		fmt.Println("Idade não encontrada")
	}
}
