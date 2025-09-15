package main

var n int

func init() {
	// A função init é executada antes da função main
	println("Função init executada")

	n = 10
}

func main() {
	// A função main é executada
	println("Função main executada")
	println(n)
}
