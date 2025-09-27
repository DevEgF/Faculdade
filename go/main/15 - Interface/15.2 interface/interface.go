package main

import (
	"fmt"
	"math"
)

// INTERFACE: Define um contrato que tipos concretos devem implementar
// Em Go, uma interface é um conjunto de assinaturas de métodos
// Qualquer tipo que implemente TODOS os métodos da interface automaticamente a satisfaz
type forma interface {
	area() float64 // Método que deve retornar um float64
}

// TIPO CONCRETO 1: struct retangulo
type retangulo struct {
	altura  float64
	largura float64
}

// TIPO CONCRETO 2: struct circulo
type circulo struct {
	raio float64
}

// IMPLEMENTAÇÃO da interface forma para retangulo
// Note: Go usa receiver functions para associar métodos a tipos
func (r retangulo) area() float64 {
	return r.altura * r.largura
}

// IMPLEMENTAÇÃO da interface forma para circulo
func (c circulo) area() float64 {
	return math.Pi * math.Pow(c.raio, 2)
}

// FUNÇÃO POLIMÓRFICA: Aceita qualquer tipo que implemente a interface forma
// Esta função não precisa saber o tipo concreto, apenas que ele tem um método area()
func escreverArea(f forma) {
	fmt.Printf("A área é %0.2f\n", f.area())
}

func main() {
	// Criando instâncias dos tipos concretos
	r := retangulo{altura: 5, largura: 10}
	c := circulo{raio: 10}
	
	// POLIMORFISMO EM AÇÃO:
	// Ambos os tipos podem ser passados para escreverArea porque implementam a interface forma
	escreverArea(r) // Chama retangulo.area()
	escreverArea(c) // Chama circulo.area()
}