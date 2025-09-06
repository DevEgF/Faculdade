package main

import "fmt"

type person struct {
	name     string
	lastName string
	height   int
	age      int
}

type student struct {
	person
	course  string
	college string
}

func main() {
	p1 := person{name: "João", lastName: "Silva", height: 180, age: 25}
	fmt.Println("Person:", p1)

	e1 := student{p1, "Engenharia de Software", "Universidade Federal"}
	fmt.Println("Student:", e1.name)
}
