package questions

// Deve efetuar a soma em duas variaveis, a primeria numeros de 1 a 5 e a segunda de 6 a 10

import "fmt"

func Question_4() {
	slc := []int{2, 8, 3, 10, 5, 4, 7, 9, 1}

	numberAt5 := 0
	numberAt10 := 0

	for item := 0; item < len(slc); item++ {
		if slc[item] <= 5 {
			numberAt5 += slc[item]
		} else {
			numberAt10 += slc[item]
		}
	}

	fmt.Println("A soma dos números de 1 a 5 é:", numberAt5)
	fmt.Println("A soma dos números de 6 a 10 é:", numberAt10)
}
