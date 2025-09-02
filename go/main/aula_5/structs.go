package main

import "fmt"

type user struct {
	name    string
	age     int
	address address
}

type address struct {
	street  string
	city    string
	zipCode int
}

func main() {
	var user1 user

	user1.age = 33
	user1.name = "José"
	user1.address = address{street: "Rua A", city: "São Paulo", zipCode: 12345}

	user2 := user{
		name:    "Amanda",
		age:     28,
		address: address{street: "Rua B", city: "Rio de Janeiro", zipCode: 67890}}

	fmt.Println(user1)
	fmt.Println(user2)
}
