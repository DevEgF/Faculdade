package main

import "fmt"

type user struct {
	name string
	age  int
}

func (u user) salvar() {
	fmt.Println("Salvando usuário", u.name)
}

func main() {
	usuario1 := user{"João", 30}

	fmt.Println(usuario1)
	usuario1.salvar()
}
